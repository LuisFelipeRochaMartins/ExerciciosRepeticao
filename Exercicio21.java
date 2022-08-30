package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sum = 0;
        int k = 1;
        while(true){
            System.out.println("Informe a sua idade: ");
            int age = entrada.nextInt();
            sum+=age;
            String op, s = "S";
            op = entrada.nextLine();
            System.out.print("Deseja continuar ? "
                    +"\nS - para Continuar "
                    +"\nQualquer tecla para parar: ");
            op = entrada.nextLine();
            if (!(op.equalsIgnoreCase(s))){
                break;
            }
            k++;
        }
        if(sum/k<=25){
            System.out.println("Turma Jovem");
        }else if (sum/k>=26 && sum/k<=60){
            System.out.println("Turma Adulta");
        }else if (sum/k>60) {
            System.out.println("Turma Idosa");
        }
    }
}
