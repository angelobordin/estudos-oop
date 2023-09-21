package DesafioContaCorrente;

import java.util.Scanner;

public class DesafioContaCorrente {

    public static void main(String[] args) {
        System.out.println("""
            ***********************
            Dados iniciais do cliente:
                            
            Nome: Angelo Bordin
            Tipo conta: Corrente
            Saldo inicial: R$ 2530,00
            ***********************
        """);
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;
        double saldo = 2530.0;

        while (!sair) {
            System.out.println("Operações disponíveis:");
            System.out.println("""
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
            """);
            System.out.println("Digite a opção desejada!");
            int operacao = scanner.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Valor disponível: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a receber:");
                    saldo += scanner.nextDouble();
                    System.out.println("Operação realizada com sucesso! Saldo atual: " + saldo);
                    break;
                case 3:
                    System.out.println("Digite o valor que gostaria de transferir:");
                    double valorTransferencia = scanner.nextDouble();
                    if (valorTransferencia > saldo) {
                        System.out.println("Valor superior ao saldo dispoonível. Operação não realizada!");
                    } else {
                        saldo -= valorTransferencia;
                        System.out.println("Operação realizada com sucesso! Saldo atual: " + saldo);
                    };
                    break;
                case 4:
                    System.out.println("Até breve!");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
