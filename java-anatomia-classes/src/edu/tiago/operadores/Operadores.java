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

        //operadores unários
        int numero = 10;
        System.out.println(numero);
        System.out.println(numero++);
        System.out.println(numero);
        System.out.println(++numero); // Operação de incremento
        System.out.println(numero);
        System.out.println(numero--);
        System.out.println(numero);
        System.out.println(--numero); // Operaçao de decremento
        System.out.println(numero);

        boolean verdadeiro = true;
        System.out.println(verdadeiro);
        System.out.println(!verdadeiro); //Operador de negação
    
        //operadores ternários
        int numero1 = 30;
        int numero2 = 20;
        //se numero1 for maior que numero2, então resultado recebe numero1, senão resultado recebe numero2
        int resultado = (numero1 > numero2) ? numero1 : numero2;
        System.out.println(resultado);

        //operadores relacionais
        int a = 10; 
        int b = 20;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        String nome1 = "Tiago";
        String nome2 = new String("Tiago"); // Cria um novo objeto
        System.out.println(nome1 == nome2); // Compara a referência de memória
        System.out.println(nome1.equals(nome2));   // Compara o conteúdo da String - sempre usar equals para comparar Strings

        //operadores lógicos
        boolean x = true;
        boolean y = false;

        if(x && y){
            System.out.println("As duas condições são verdadeiras");
        } else if(x || y){
            System.out.println("Pelo menos uma condição é verdadeira");
        } else if(x ^ y){
            System.out.println("Apenas uma condição é verdadeira");
        } else if(!x){
            System.out.println("A condição é falsa");
        } else {
            System.out.println("Nenhuma condição é verdadeira");
        }

        
        /* System.out.println(x && y); // E
        System.out.println(x || y); // OU
        System.out.println(x ^ y); // OU exclusivo
        System.out.println(!x); // Negação */

        
    }
  
}
