package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        float valor = entrada.nextFloat();

        System.out.println("Valor da Dívida    Valor dos Juros    Quant de Parcelas    Valor da Parcela");
        System.out.println("R$: "+ valor +"         0                   1                 "+valor);
        System.out.println("R$: "+ valor +"        100                  3                 "+(float)(valor+100)/3);
        System.out.println("R$: "+ valor +"        150                  6                 "+(float)(valor+150)/6);;
    }
}
