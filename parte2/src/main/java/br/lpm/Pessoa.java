package br.lpm;

import java.time.LocalDate;
import java.time.Period;


public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;
    private Data dataNascimento;


    public Pessoa(String nome, String sobrenome, Data dataNascimento, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.idade = calcularIdade();
    }


        public int calcularIdade(){
        LocalDate hoje = LocalDate.now();
        LocalDate nascimento = LocalDate.of(dataNascimento.getAno(), dataNascimento.getMes(), dataNascimento.getDia());
        Period periodo = Period.between(nascimento, hoje);
        idade = periodo.getYears();
        return idade;
    }

    public double CalcularIMC(){
        imc = peso / (altura*altura);
        return imc;
    }
    public void InformaObesidade(double imc){
        if(imc < 18.5){
            System.out.println("Abaixo do peso");
         } else if(imc >=18.5 && imc < 25){
            System.out.println("Peso normal");
         } else if(imc >= 25 && imc < 30){
            System.out.println("Sobrepeso");
         } else if(imc >= 30 && imc < 35){
            System.out.println("Obesidade grau I");
         } else if(imc >= 35 && imc < 40){
            System.out.println("Obesidade grau II");
         } else {
            System.out.println("Obesidade grau III");
         }
    }
    public String getNome() { return nome;}
    public String getSobrenome() { return sobrenome;}
    public double getAltura() { return altura;}
    public double getPeso() { return peso;}
    public double getImc() { return imc;}
    public Data getDataNascimento() { return dataNascimento;}
    
    
    public void setNome(String nome) { this.nome = nome;}
    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome;}
    public void setAltura(double altura) { this.altura = altura;}
    public void setPeso(double peso) { this.peso = peso;}
    public void setImc(double imc) { this.imc = imc;}
    public void setDataNascimento(Data dataNascimento) { this.dataNascimento = dataNascimento;} 



}
