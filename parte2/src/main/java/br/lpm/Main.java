package br.lpm;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        Pessoa[] p= new Pessoa[10];

        
        for(int i=0; i<p.length; i++){
        if(i>0){
            if(p[i-1].getNome().equalsIgnoreCase("Pessoa já cadastrada")){
                break;
            }
        }
        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o sobrenome:");
        String sobrenome = scanner.nextLine();

        

        System.out.println("Digite a altura:");
        double altura = scanner.nextDouble();

        System.out.println("Digite o peso:");
        double peso = scanner.nextDouble();

        System.out.println("Digite a data de nascimento (dd/MM/yyyy):");
        String dataString = scanner.nextLine();
        java.time.format.DateTimeFormatter formatador = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
        java.time.LocalDate dataConvertida = java.time.LocalDate.parse(dataString, formatador);

        Data dataNascimento = new Data(
        dataConvertida.getDayOfMonth(), 
        dataConvertida.getMonthValue(), 
        dataConvertida.getYear()        
        );

        
        p[i] = new Pessoa(nome, sobrenome, dataNascimento, altura, peso);
        p[i].CalcularIMC();
        

        System.out.println("O IMC de " + p[i].getNome() + " " + p[i].getSobrenome() + " é: " + p[i].getImc());
        p[i].InformaObesidade(p[i].getImc());
    }
    


        scanner.close();
    }
}