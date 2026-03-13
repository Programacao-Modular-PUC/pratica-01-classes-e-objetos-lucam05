package br.lpm;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        Pessoa[] p= new Pessoa[10];

        int totalCadastrados = 0;
        for(int i=0; i<p.length; i++){
            System.out.println("--- Cadastro da Pessoa " + (i + 1) + " ---");
            
            System.out.println("Digite o nome:");
            String nome = scanner.nextLine();

            System.out.println("Digite o sobrenome:");
            String sobrenome = scanner.nextLine();
        if(i > 0){
                if(nome.equalsIgnoreCase(p[i-1].getNome()) && sobrenome.equalsIgnoreCase(p[i-1].getSobrenome())){
                    System.out.println("Pessoa já cadastrada. Encerrando os cadastros...");
                    break; 
                }
            }
        
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
        totalCadastrados++;
        

        System.out.println("O IMC de " + p[i].getNome() + " " + p[i].getSobrenome() + " é: " + p[i].getImc());
        p[i].InformaObesidade(p[i].getImc());
    }
    System.out.println("\n=== RESULTADOS FINAIS ===");
    for(int i = 0; i < totalCadastrados; i++){
        String nomeReferencia = p[i].getSobrenome() + ", " + p[i].getNome().toUpperCase();

            System.out.println("Cadastro " + (i + 1) + ":"); 
            System.out.println("Nome completo: " + p[i].getNome() + " " + p[i].getSobrenome()); 
            System.out.println("Nome de referência: " + nomeReferencia); 
            System.out.println("Idade: " + p[i].calcularIdade()); 
            System.out.println("Peso: " + p[i].getPeso()); 
            System.out.println("Altura: " + p[i].getAltura()); 
            System.out.println("IMC: " + String.format("%.2f", p[i].getImc())); 
    }
    


        scanner.close();
    }
}