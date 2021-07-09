package br.com.zup.Exercicio2_modulo3;

import java.util.concurrent.Callable;

public class Principal {

    public static void main(String[] args) {
        CalculaNotaAluno obj_calc = new CalculaNotaAluno(20, 50, 40, 50
        );
        double media = obj_calc.calculaMedia();
        System.out.println(media);







        }


}
