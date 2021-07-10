package br.com.zup.Lista2Exercicio2;

public class Principal {

    public static void main(String[] args) {

        Quadrado novoQuadrado = new Quadrado();
        novoQuadrado.mudaValorLado(20);
        System.out.println(" O Lado do quadrado e: "+novoQuadrado.retornaValorLado());
        System.out.println(" A area e: " +novoQuadrado.calcularArea());

        
    }
}
