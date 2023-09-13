package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner terminal = new Scanner(System.in);

        System.out.println(" Digite o primeiro número: ");
        int parametro1 = terminal.nextInt();
        System.out.println(" Digite o segundo número: ");
        int parametro2 = terminal.nextInt();

        try {
            contar(parametro1, parametro2);

        } catch (Exception ParametrosInvalidosException) {
            throw new RuntimeException(" O segundo parâmetro deve ser maior que o primeiro");

        }

    }

    public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            System.out.println(" Valor do primeiro parametro deve ser menor do que o segundo ");
        } else {
            int contagem = parametro2 - parametro1;
            for (int contar = 1; contar <= contagem; contar++) {
                System.out.println("Imprimindo o número " + contar);
            }

        }
    }
}
