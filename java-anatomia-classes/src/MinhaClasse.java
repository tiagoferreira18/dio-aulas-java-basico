public class MinhaClasse {
    public static void main(String[] args) {
        /* int ano = 2021;
        ano = 2022;  quando a variavel é escrita com letra minuscula ela pode mudar o valor*/

        /* final String BR = "Brasil";
        BR = "Brazil"; 
        
        Quando é declarada com letra maiuscula o valor é imutavel e se coloca a palavra final na frente pra indicar isso
        
        */

        /* String meuNome = "Tiago";
        System.out.println(meuNome);

        int anoFabricacao = 2022;

        boolean verdadeira = true;
        boolean falsa = false; */

        String primeiroNome = "Tiago";
        String sobrenome = "Ferreira";

        String nomeCompleto = nomeCompleto(primeiroNome, sobrenome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String sobrenome) {
       return "Ressultado do método " + primeiroNome.concat(" ").concat(sobrenome);
    }
}
