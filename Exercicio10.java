package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a base:");
        int b = entrada.nextInt();
        System.out.println("Informe o expoente: ");
        int e = entrada.nextInt();
        int sum = 1;
        for(int k=1; k<=e;k++){
            sum*=b;
        }
        System.out.println("O resultado de "+b+" elevado a "+e+" é "+sum);
        entrada.close();
    }
}
