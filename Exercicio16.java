package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int k = 1;
        int maior = 0;
        int menor = 0;
        while(true){
            System.out.print("Informe um número inteiro: ");
            int n = entrada.nextInt();
            if (k==1){
                maior = n;
                menor = n;
            }
            else{
                if(n>maior){
                    maior = n;
                }
                else if(n<menor){
                    menor = n;
                }
            }
            k++;
            String op, s = "S";
            op = entrada.nextLine();
            System.out.print("Deseja continuar ? "
            +"\nS - para Continuar "
            +"\nQualquer tecla para parar: ");
            op = entrada.nextLine();
            if (!(op.equalsIgnoreCase(s))){
                break;
            }
        }
        System.out.println("menor é "+menor);
        System.out.println("Maior é "+maior);
    }
}
