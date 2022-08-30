package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int k = 0;
        float maior = 0;
        float menor = 0;
        float sum = 0;
        while (true){
            k++;
            System.out.print("Informe uma temperatura: ");
            float temp = entrada.nextFloat();
            sum+=temp;
            if (k==1){
                maior = temp;
                menor = temp;
            }
            else{
                if (temp>maior){
                    maior = temp;
                }else if (menor<temp){
                    menor = temp;
                }
            }
            String op, S = "S";
            op = entrada.nextLine();
            System.out.print("Deseja continuar? "
            +"\nS - Para continuar"
            +"\nQualquer tecla para cancelar: ");
            op = entrada.nextLine();
            if (!(op.equalsIgnoreCase(S))){
                break;
            }
        }
        System.out.println("A Temperatura mais alta foi de "+maior);
        System.out.println("A temperatura mais baixa foi de "+menor);
        System.out.println("A Média de temperatura entre essas cidades é de "+(sum/k));
    }
}
