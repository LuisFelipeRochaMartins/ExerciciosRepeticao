package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int par=0; int impar = 0;
        for(int k =1;k<=10;k++){
            System.out.println("informe o "+k+"ª número:");
            int n = entrada.nextInt();
            if(n%2==0){
                par +=1;
            }
            else{
                impar+=1;
            }
        }
        System.out.println("A Quantidade de número pares é: "+par);
        System.out.println("A Quantidade de número ímpares é: "+impar);
        entrada.close();
    }
}
