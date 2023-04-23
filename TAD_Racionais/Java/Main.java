import java.util.Scanner;

public class Main{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        

        System.out.println("numerador primeiro objeto");
        int numerador1 = scanner.nextInt();

        System.out.println("denominador primeiro objeto");
        int denominador1 = scanner.nextInt();

        System.out.println("numerador segundo objeto");
        int numerador2 = scanner.nextInt();

        System.out.println("denominador segundo objeto");
        int denominador2 = scanner.nextInt();

        Racionais r1 = new Racionais(numerador1, denominador1);
        Racionais r2 = new Racionais(numerador2, denominador2);

        Racionais res_multiplicacao = r1.multiplicacao(r2);

        System.out.println("Resultado da multiplicacao: " + res_multiplicacao);

        scanner.close();
    }

}