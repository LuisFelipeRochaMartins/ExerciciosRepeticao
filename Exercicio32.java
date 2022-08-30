package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        int sum = 0;
        int codmaior = 0;
        int codmenor = 0;
        int sum2 =0;
        int k =1 ;
        int k2=0;
        for(k=1;k<=5;k++){
            System.out.print("Informe o código da cidade: ");
            int cod = entrada.nextInt();
            System.out.print("Informe o número de veículos de passeio em 1999: ");
            int v = entrada.nextInt();
            sum+=v;
            System.out.print("Informe o número de acidentes de trânsito com vítimas em 1999: ");
            int a = entrada.nextInt();
            if (k==1){
                maior = cod;
                menor = cod;
                codmaior = cod;
                codmenor = cod;
            }
            if (v<2000){
                sum2 =a;
                k2++;

            }
            if (v>maior){
                codmaior = cod;
                maior = v;
            }else if(v<menor){
                codmenor = cod;
                menor = v;
            }
        }
        System.out.println("A média de veículos da cinco cidades é de: "+ (sum/k));
        System.out.println("A média de acidentes de trânsito com menos de 2000 de passeio: "+(sum2/k2));
    }
}
