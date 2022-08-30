package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o preço do pão: ");
        double p = entrada.nextDouble();
        for(int i=1;i<=50;i++){
            System.out.println(i+" - "+(p*i));
        }
    }
}

