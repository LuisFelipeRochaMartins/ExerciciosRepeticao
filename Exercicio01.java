package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe sua Nota: ");
        float n = entrada.nextFloat();
        do {
            System.out.println("Valor inválido, favor informe novamente sua nota: ");
            n = entrada.nextFloat();
        }while(n<0 ||n>10);
        entrada.close();
    }
}
