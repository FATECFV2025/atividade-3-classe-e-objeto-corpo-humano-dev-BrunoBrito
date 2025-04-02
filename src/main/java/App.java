package main.java;
import java.util.Scanner;

public class App {
        //Comentário

    public static void main (String[] arg) throws Exception{
        //Biblioteca para entrada de dados
        Scanner scanner = new Scanner(System.in); 
        

        System.out.println("Digite o Peso: ");
        float massa = scanner.nextFloat();

        System.out.println("Digite a Altura: ");
        float altura = scanner.nextFloat();

        scanner.close();

        CorpoHumano corpo = new CorpoHumano(0,0);
        corpo.setMassa(massa);
        corpo.setAltura(altura);

        corpo.calcularImc();
        System.out.println("o imc é de: " + corpo.calcularImc());

        


    }
    
}
