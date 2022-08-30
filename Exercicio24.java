package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a quantidade de CD's que você possui em sua coleção: ");
        int n = entrada.nextInt();
        float sum = 0;
        for(int i=1;i<=n;i++){
            System.out.print("Informe o valor do "+i+"º CD: ");
            float v = entrada.nextFloat();
            sum+=v;
        }
        System.out.println("A coleção tem um valor total investido de: "+sum);
        System.out.println("A média gasta por cada um dos Cd's foi de: "+(sum/n));
    }
}

