package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe quantos termos da sequência de Fibonacci deseja ver: ");
        int n = entrada.nextInt();
        int x = 0;
        int y = 1;
        int z = 1;
        for(int k =1; k<=n;k++){
            System.out.println("O termo "+k+" é igual a:"+x);
            z = x+y;
            x=y;
            y=z;
        }
        entrada.close();
    }
}
