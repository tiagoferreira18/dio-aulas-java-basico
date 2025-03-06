package edu.tiago.metodos;

public class Metodos {
   
    //métodos void
    public void imprimirNome() {
        System.out.println("Tiago");
    }

    public double somar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double dividir(double numero1, double numero2) throws ArithmeticException {
        if (numero2 == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return numero1 / numero2;
    }
    public static void main(String[] args) {
      
        Metodos metodos = new Metodos();
        metodos.imprimirNome();
        System.out.println(metodos.somar(10, 20));
        System.out.println(metodos.dividir(10, 2));
    
    }
}
