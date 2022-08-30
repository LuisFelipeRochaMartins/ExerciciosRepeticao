package ExercicioIniciacao.EstruturaRepeticao;
import  java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o termo que deseja saber da sequência: ");
        int n = entrada.nextInt();
        int d =1;
        int k;
        for (k=0;k<=(n-1);k++){
            d+=2;
        }
        System.out.println("O "+n+" termo da sequência é: "+k+"/"+(d-2));
        entrada.close();
    }
}
