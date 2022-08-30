package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float gordo = 0;
        float alto = 0;
        float baixo = 0;
        float magro = 0;
        int codgordo = 0;
        int codmagro = 0;
        int codalto = 0;
        int codbaixo = 0;
        float sumh = 0;
        float sumkg = 0;
        int k =0;
        while (true){
            k++;
            System.out.print("Informe seu código:  (0 Para cancelar) ");
            int cod = entrada.nextInt();
            if (cod==0){
                break;
            }
            System.out.print("Informe seu peso: ");
            float peso = entrada.nextFloat();
            sumkg += peso;
            System.out.print("Informe sua altura: ");
            float h = entrada.nextFloat();
            sumh = h;
            if (k==1){
                codalto = cod;
                codbaixo = cod;
                codgordo = cod;
                codmagro = cod;
                gordo = peso;
                magro = peso;
                baixo = h;
                alto = h;
            }
            else{
                if (peso>gordo){
                    gordo = peso;
                    codgordo = cod;
                }else if (peso<magro){
                    magro = peso;
                    codmagro = cod;
                }
                if (h>alto){
                    alto = h;
                    codalto = cod;
                }else if (h<baixo){
                    baixo = h;
                    codbaixo = cod;
                }
            }
        }
        System.out.println("Código da pessoa mais alta é "+codalto+" com altura de "+alto+"m");
        System.out.println("Código da pessoa mais baixo é "+codbaixo+" com altura de "+baixo+"m");
        System.out.println("Código da pessoa mais magra é "+codmagro+" com peso de "+magro+"Kg");
        System.out.println("Código da pessoa mais gorda é "+codgordo+" com peso de "+gordo+"Kg");
        System.out.println("Peso médio de "+(sumkg/k)+"Kg");
        System.out.println("Altura média de "+(sumh/k)+"m");
    }
}
