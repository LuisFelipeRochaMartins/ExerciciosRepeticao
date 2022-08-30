package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o número que deseja saber a tabuada: ");
        int n = entrada.nextInt();
        System.out.print("Informe por onde deseja começar: ");
        int in = entrada.nextInt();
        System.out.print("Informe onde quer terminar: ");
        int fim = entrada.nextInt();
        if (in>fim){
            for(int i=in;i>=fim;i--){
                System.out.println(n+" x "+i+" = "+(i*n));
            }
        }else if (fim>in){
            for(int i=in;i<=fim;i++){
                System.out.println(n+" x "+i+" = "+(i*n));
            }
        }
    }
}
