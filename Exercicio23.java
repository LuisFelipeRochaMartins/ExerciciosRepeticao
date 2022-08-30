package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sum = 0;
        int k = 0;
        while(true){
            k++;
            System.out.print("Informe a quantidade de alunos dessa sala: ");
            int n = entrada.nextInt();
            while(n<1 || n>40){
                System.out.println("Informe um número entre 1 e 40.");
                n = entrada.nextInt();
            }
            sum+=n;
            String op, S="S";
            op = entrada.nextLine();
            System.out.print("Deseja continuar? "
                    +"\n S - para Continuar"
                    +"\n Qualquer outra tecla para Cancelar ");
            op = entrada.nextLine();
            if(!(op.equalsIgnoreCase(S))){
                break;
            }
        }
        System.out.println("O número médio de alunos por sala foi de: "+(sum/k));
    }
}
