package Carros;

public abstract class Icarros {

    private String marca;
    private int ano;
    private double valor;
    private String cor;
    private double velocidade;
    private int portas;

    public Icarros(String marca, int ano, double valor, String cor, double velocidade, int portas) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.cor = cor;
        this.velocidade = velocidade;
        this.portas = portas;
    }


    public double getVelocidade() {
        return velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public void darPartidaMotor(){
        System.out.println("“Iniciando o motor...\n" +
                "Minha velocidade está em " + velocidade + " KM");

    }

    public void freiarCarro(){
        System.out.println("“Freando...\n" +
                "Minha velocidade está em " + velocidade + " KM");
    }

    public void acelerarCarro(){
        System.out.println("“Acelerando...\n" +
                "Minha velocidade está em " + velocidade + " KM");
    }

    public void registroCarro(){
        System.out.println("---------Registro do carro---------");
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Quantidade de portas: " + portas);
        System.out.println("Valor: " + valor);
    }
}