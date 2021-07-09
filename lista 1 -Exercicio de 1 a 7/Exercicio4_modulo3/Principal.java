package br.com.zup.Exercicio4_modulo3;

public class Principal {
    public static void main(String[] args) {

        Exercicio4_salario salarioJoao = new Exercicio4_salario();
        salarioJoao.horasTrabalhadas =40;
        salarioJoao.valorHora = 5.35;
        System.out.println("O Salario de joão no mês e: "+salarioJoao.calcularSalario());
    }
}
