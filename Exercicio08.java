package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int n1 = entrada.nextInt();
        System.out.print("Informe outro número inteiro: ");
        int n2 = entrada.nextInt();
        int sum = 0;
        if(n1>n2){
            for(int k = n2+1;k<n1;k++){
                System.out.print(k+" ");
                sum += k;
            }
            System.out.println("Soma igual a: "+sum);
        }
        else{
            for(int k = n1+1;k<n2;k++){
                System.out.println(k+" ");
                sum += k;
            }
            System.out.println("Soma igual a: "+sum);
        }
        entrada.close();
    }
}
