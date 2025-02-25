package edu.tiago.operadores;

public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Tiago" + " " + "Silva";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        System.out.println(concatenacao);
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
    }
}
