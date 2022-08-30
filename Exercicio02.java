package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Informe sua senha: ");
        String senha = entrada.nextLine();
        while (nome.equalsIgnoreCase(senha) ){
            System.out.println("Senha fraca, use uma senha diferente do seu nome!");
            senha = entrada.nextLine();
        }
        System.out.println("Usuário cadastrado!");
        entrada.close();
    }
}
