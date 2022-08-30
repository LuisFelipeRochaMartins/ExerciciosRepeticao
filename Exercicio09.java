package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o número que deseja saber a tabuada: ");
        int n = entrada.nextInt();
        for(int k = 0; k<=10;k++){
            System.out.println(n+" x "+ k+" = "+(k*n));
        }
        entrada.close();
    }
}
