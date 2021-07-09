package br.com.zup.Exercicio2_modulo3;

public class CalculaNotaAluno {
    public double primeiraNota;
    public double  segundaNota;
    public double terceiraNota;
    public double   quartaNota;

    public CalculaNotaAluno(double primeiraNota, double segundaNota, double terceiraNota, double quartaNota){

        this.primeiraNota = primeiraNota;
        this.segundaNota  = segundaNota ;
        this.terceiraNota = terceiraNota;
        this.quartaNota   = quartaNota  ;

    }

    public double calculaMedia(){
        double soma = this.primeiraNota + this.segundaNota + this.terceiraNota + this.quartaNota;
        return soma/4;



}

}
