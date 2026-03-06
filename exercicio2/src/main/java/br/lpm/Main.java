package br.lpm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o sobrenome:");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite a altura:");
        double altura = scanner.nextDouble();

        System.out.println("Digite o peso:");
        double peso = scanner.nextDouble();

        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, altura, peso);
        pessoa.CalcularIMC();

        System.out.println("O IMC de " + pessoa.getNome() + " " + pessoa.getSobrenome() + " é: " + pessoa.getImc());
        pessoa.InformaObesidade(pessoa.getImc());
    


        scanner.close();
    }
}