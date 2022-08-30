package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o número que queira saber o fatorial: ");
        int n  = entrada.nextInt();
        int sum = 1;
        for(int k =1;k<=n;k++){
            sum*=(k);
        }
        System.out.printf("O fatorial de "+n+" é "+sum);
        entrada.close();
    }
}
