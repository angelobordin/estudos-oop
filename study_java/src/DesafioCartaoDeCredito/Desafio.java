package DesafioCartaoDeCredito;

import DesafioCartaoDeCredito.classes.CartaoDeCredito;
import DesafioCartaoDeCredito.classes.Compra;

import java.util.Comparator;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        // Cria-se o cartão;
        System.out.println("Digite o limite do cartão:");
        double limiteCartao = scanner.nextInt();
        CartaoDeCredito cartao = new CartaoDeCredito(limiteCartao);

        // Menu de compras;
        while (continuar) {
            System.out.println("");

            // Cria-se a compra
            System.out.println("Digite a descrição da compra:");
            String descricaoCompra = scanner.next();
            System.out.println("Digite o valor da compra:");
            double valorCompra = scanner.nextDouble();

            System.out.println("**********************");
            System.out.println("Compra de: " + descricaoCompra);
            System.out.println("No valor de: " + valorCompra);
            System.out.println("**********************");
            System.out.println("Deseja registrar a compra?");
            System.out.println("Sim: (S) ou Não: (N)");
            String registrarCompra = scanner.next();

            if (Character.toUpperCase(registrarCompra.charAt(0)) == 'S'){
                if (cartao.registraCompra(new Compra(descricaoCompra, valorCompra))) {
                    System.out.println("Compra registrada com sucesso.");
                    System.out.println("Saldo atual disponível: " + cartao.getSaldo());
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            };
            System.out.println("");

            System.out.println("Realizar nova compra?");
            System.out.println("Sim: (S) ou Não: (N)");
            String realizaNovaCompra = scanner.next();

            if (Character.toUpperCase(realizaNovaCompra.charAt(0)) == 'N'){
                continuar = false;
            };
        };

        // Mostrar lista de compras ordenadas por valor
        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        cartao.listaCompras().sort(Comparator.comparing(Compra::getValorCompra));
        for (Compra compra: cartao.listaCompras()) {
            System.out.println(compra);
        }

    }
}
