package br.com.zup.Lista2Exercicio2;

public class Quadrado {

    public Quadrado(){

    }
    private double lado;
    public void mudaValorLado(double novoValorLado){
        this.lado= novoValorLado;

    }
    public double retornaValorLado(){
        return this.lado;

    }
    public double calcularArea(){
        return lado*lado;
    }


}





