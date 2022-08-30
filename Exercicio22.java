package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int k1 = 0;
        int k2 = 0;
        int k3 = 0;
        while (true){
            System.out.print("Para votar digite: "
            +"\n1 - Para Raça Negra"
            +"\n2 - Para Pericles"
            +"\n3 - Para Turma do Pagode ");
            int op = entrada.nextInt();
            while(op<1 || op>3){
                System.out.println("Digito inválido, favor digite novamente: ");
                op = entrada.nextInt();
            }
            if (op==1){
                k1+=1;
            }else if(op==2){
                k2+=1;
            }else if(op==3){
                k3+=1;
            }
            String opc, s = "S";
            opc = entrada.nextLine();
            System.out.print("Deseja continuar ? "
                    +"\nS - para Continuar "
                    +"\nQualquer tecla para parar: ");
            opc = entrada.nextLine();
            System.out.println();
            if (!(opc.equalsIgnoreCase(s))){
                break;
            }
        }
        System.out.println("Pessoas que preferem Raça Negra: "+k1);
        System.out.println("Pessoas que preferem Pericles: "+k2);
        System.out.println("Pessoas que preferem Turma do Pagode: "+k3);
    }
}
