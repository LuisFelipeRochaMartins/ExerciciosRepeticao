package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int n1 = entrada.nextInt();
        System.out.print("Informe outro número inteiro: ");
        int n2 = entrada.nextInt();
        if(n1>n2){
            for(int k = n2+1;k<n1;k++){
                System.out.print(k+" ");
            }
        }
        else{
            for(int k = n1+1;k<n2;k++){
                System.out.println(k+" ");
            }
        }
        entrada.close();
    }
}
