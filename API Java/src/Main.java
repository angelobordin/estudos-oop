import classes.Titulo;
import records.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();
        Scanner scanner = new Scanner(System.in);
        String continuar = "S";
        List<Titulo> titulosLista = new ArrayList<Titulo>();
        try {
            while (continuar.equalsIgnoreCase("S")) {
                System.out.println("Digite o filme que deseja buscar:");
                String filme = scanner.next();
                String response = Main.buscaFilme(filme);

                TituloOmdb tituloOmbd = gson.fromJson(response, TituloOmdb.class);
                Titulo titulo = new Titulo(tituloOmbd);
                titulosLista.add(titulo);

                System.out.println("Adicionar mais algum filme? Sim (S) ou Não (N)");
                continuar = scanner.next().substring(0, 1);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        FileWriter file = new FileWriter("filmes.json");
        file.write(gson.toJson(titulosLista));
        file.close();
        System.out.println("Programa finalizou!!");
    }

    public static String buscaFilme(String filme) throws IOException, InterruptedException {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest req = HttpRequest.newBuilder().uri(URI.create("https://www.omdbapi.com/?t="+filme+"&apikey=6585022c")).build();
            HttpResponse<String> res = client.send(req, HttpResponse.BodyHandlers.ofString());
            return res.body();
        } catch (Exception e) {
            throw e;
        }
    }
}
