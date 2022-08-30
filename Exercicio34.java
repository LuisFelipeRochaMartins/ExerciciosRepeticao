package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio34 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quad1 = 0;
        int quad2 = 0;
        int quad3 = 0;
        int quad4 = 0;

        while (true){
            System.out.print("Informe um valor positivo entre 0 e 100");
            int n = entrada.nextInt();

            if (n<0){
                break;
            }

            while (n>100){
                System.out.print("Número inválido favor, digite novamente: ");
                n = entrada.nextInt();
            }
            if (n>=0 && n<=25){
                quad1++;

            }else if (n>25 && n<=50){
                quad2++;
            }else if (n>50 && n<=75){
                quad3++;
            }else if (n>75 && n<=100){
                quad4++;
            }

        }
        System.out.println("No intervalo entre 0-25 temos: "+quad1+" números.");
        System.out.println("No intervalo entre 0-25 temos: "+quad2+" números.");
        System.out.println("No intervalo entre 0-25 temos: "+quad3+" números.");
        System.out.println("No intervalo entre 0-25 temos: "+quad4+" números.");
    }
}
