package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a populaçao do País A: ");
        float ha = entrada.nextInt();
        while(ha<0){
            System.out.print("Impossível haver população negativo, informe novamente: ");
            ha = entrada.nextInt();
        }
        System.out.print("Informe a taxa de crescimento do Pais A: ");
        float ta = entrada.nextFloat();
        System.out.print("Informe a populaçao do País B: ");
        float hb = entrada.nextInt();
        while(hb<0){
            System.out.print("Impossível haver população negativo, informe novamente: ");
            hb = entrada.nextInt();
        }
        System.out.print("Informe a taxa de crescimento do Pais B: ");
        float tb = entrada.nextFloat();
        int cont = 0;
        if (ha>hb){
            while(hb<=ha){
                cont +=1;
                hb = ((hb*tb)/100)+hb;
                ha = ((ha*ta)/100)+ha;
            }
            System.out.println("Demorou "+cont+" anos para o País B se igualar ou ultrapassar o País A.");
        }
        else{
            while(ha<=hb){
                cont +=1;
                hb = ((hb*tb)/100)+hb;
                ha = ((ha*ta)/100)+ha;
            }
            System.out.println("Demorou "+cont+" anos para o País A se igualar ou ultrapassar o País B.");
        }
        entrada.close();
    }
}
