package academy.devdojo.maratonajava.Projetos.domino;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Calculadora");

        while (continuar) {
            double num1 = lerNumero(scanner, "Digite o primeiro número: ");
            double num2 = lerNumero(scanner, "Digite o segundo número: ");
            char operacao = lerOperacao(scanner);

            double resultado = executarOperacao(num1, num2, operacao);

            System.out.println("Resultado: " + resultado);

            System.out.print("Deseja continuar? (s/n): ");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
                System.out.println("Encerrando a calculadora.");
            }
        }

        scanner.close();
    }


    public static double lerNumero(Scanner scanner, String mensagem) {
        double numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print(mensagem);
            try {
                numero = scanner.nextDouble();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número válido.");
                scanner.next();
            }
        }

        return numero;
    }


    public static char lerOperacao(Scanner scanner) {
        char operacao;
        while (true) {
            System.out.print("Escolha a operação (+, -, *, /): ");
            operacao = scanner.next().charAt(0);
            if (operacao == '+' || operacao == '-' || operacao == '*' || operacao == '/') {
                break;
            } else {
                System.out.println("Operação inválida! Tente novamente.");
            }
        }
        return operacao;
    }


    public static double executarOperacao(double num1, double num2, char operacao) {
        switch (operacao) {
            case '+':
                return somar(num1, num2);
            case '-':
                return subtrair(num1, num2);
            case '*':
                return multiplicar(num1, num2);
            case '/':
                if (num2 != 0) {
                    return dividir(num1, num2);
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    return 0;
                }
            default:
                return 0;
        }
    }


    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}

