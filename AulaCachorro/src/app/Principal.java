/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Scanner;

/**
 *
 * @author Angelo2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cachorro c = new Cachorro();
        System.out.println("Digite a idade: ");
        c.idade = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Digite o nome:");
        c.nome = teclado.nextLine();

        System.out.println("Digite o peso: ");
        c.peso = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("Digite o porte: ");
        c.porte = teclado.nextLine();

        System.out.println("Digite a raça: ");
        c.raca = teclado.nextLine();

        System.out.println("Digite o peso máximo:");
        c.pesoMaximo = teclado.nextDouble();

        System.out.println("Digite a idade máxima:");
        c.idadeMaxima = teclado.nextInt();

        while (c.peso < c.pesoMaximo && c.idade < c.idadeMaxima) {
            c.verificarStatus();
            System.out.println("##########MENU############");
            System.out.println("1. Envelhecer o cachorro");
            System.out.println("2. Alimentar o cachorro");
            System.out.println("3. Correr");
            System.out.println("4. Verificar Status");

            int escolha = teclado.nextInt();

            switch (escolha) {
                case 1:
                    c.envelhecer();
                    break;
                case 2:
                    c.alimentar();
                    break;
                case 3:
                    c.correr();
                    break;

                default:
                    System.err.println("Opção Inválida! ");

            }
        }

        System.err.println("Putz, Morreu...");

    }

}
