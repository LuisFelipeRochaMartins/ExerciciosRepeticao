package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o valor fixo dos produtos: ");
        float n = entrada.nextFloat();
        for(int i=1;i<=50;i++){
            System.out.println(i+" - "+(i*n));
        }
    }
}

