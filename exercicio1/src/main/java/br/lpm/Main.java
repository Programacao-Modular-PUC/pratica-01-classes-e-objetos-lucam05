package br.lpm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cateto1;
        double cateto2;
        System.out.println("Digite o valor do cateto 1 e cateto 2: ");
            cateto1 = scanner.nextDouble();
            cateto2 = scanner.nextDouble();
        TrianguloRetangulo triangulo = new TrianguloRetangulo(cateto1, cateto2);
        triangulo.setCateto1(cateto1);
        triangulo.setCateto2(cateto2);
        System.out.println("Hipotenusa: " + triangulo.CalcularHipotenusa());
        System.out.println("Área: " + triangulo.CalcularArea());


        scanner.close();
    }
}