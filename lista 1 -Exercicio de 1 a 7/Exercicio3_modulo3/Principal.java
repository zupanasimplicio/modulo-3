package br.com.zup.Exercicio3_modulo3;

public class Principal {
    public static void main(String[] args) {

        ConverteMetrosParaCentimetros obj_calcular = new ConverteMetrosParaCentimetros();

        double centimetros = obj_calcular.converter(280);
        System.out.println(" A conversão é:" + centimetros);

    }
}
