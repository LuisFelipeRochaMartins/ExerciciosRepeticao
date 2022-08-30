package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio27 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float sum = 0;
        while(true){
            int k=0;
            k++;
            System.out.println("Informe o valor do produto");
            float v = entrada.nextFloat();
            sum +=v;
            System.out.println("produto"+k+": R$ "+v);
            System.out.flush();
        }
    }
}
