package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio31 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codalto = 0;
        int codbaixo = 0;
        float alto = 0;
        float baixo =0;
        for(int i=1;i<=10;i++){
            System.out.print("Informe seu número: ");
            int cod = entrada.nextInt();
            System.out.print("Informe sua altura:");
            float h = entrada.nextFloat();
            if (i==1){
                codalto = cod;
                codbaixo = cod;
                alto = h;
                baixo = h;
            }
            else{
                if (h>alto){
                    codalto = cod;
                    alto = h;
                }else if(h<baixo){
                    codbaixo = cod;
                    baixo = h;
                }
            }
        }
        System.out.println("O código do aluno mais alto é "+codalto+" com altura de "+alto+"m");
        System.out.println("O código do aluno mais baixo é "+codbaixo+" com altura de "+baixo+"m");
    }
}
