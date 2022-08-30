package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int k = 1;
        float sum = 0;
        while (true){
            System.out.println("Informe a "+k+"ª nota:");
            float nota = entrada.nextFloat();
            sum+= nota;
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
        System.out.println("A média das notas é igual a: "+(sum/k));
    }
}
