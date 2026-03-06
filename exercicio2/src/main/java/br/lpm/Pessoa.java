package br.lpm;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;

    public Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
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
    public int getIdade() { return idade;}
    public double getAltura() { return altura;}
    public double getPeso() { return peso;}
    public double getImc() { return imc;}
    
    public void setNome(String nome) { this.nome = nome;}
    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome;}
    public void setIdade(int idade) { this.idade = idade;}  
    public void setAltura(double altura) { this.altura = altura;}
    public void setPeso(double peso) { this.peso = peso;}
    public void setImc(double imc) { this.imc = imc;}

}
