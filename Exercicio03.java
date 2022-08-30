package ExercicioIniciacao.EstruturaRepeticao;
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = entrada.nextLine();
        while(nome.length()<=3) {
            System.out.print("Nome muito curto, favor insira seu nome novamente: ");
            nome = entrada.nextLine();
        }
        System.out.print("Informe sua idade: ");
        int age = entrada.nextInt();
        while(age<0 || age>150){
            System.out.print("Idade inválido, insira novamente: ");
            age = entrada.nextInt();
        }
        System.out.print("Informe seu salário: ");
        float sal = entrada.nextFloat();
        while (sal<0){
            System.out.println("Salário invalido, favor insira um valor positivo: ");
            sal = entrada.nextFloat();
        }
        String leitura = entrada.nextLine();
        String sexo, f = "F", m = "M";
        System.out.print("Informe seu sexo: ");
        sexo = entrada.nextLine();
        while(!(sexo.equalsIgnoreCase(f) || (sexo.equalsIgnoreCase(m)))){
            System.out.print("Informe um sexo válido: ");
            sexo = entrada.nextLine();
        }
        System.out.println("Informe seu estado cívil:"
        +"\n S - Para Solteiro"
        +"\n C - Para Casado"
        +"\n V - Para Viúvo"
        +"\n D - Para Divorciado");
        String civil, s = "S", c = "C", v = "V", d = "D";
        civil = entrada.nextLine();
        while(!(civil.equalsIgnoreCase(s)|| civil.equalsIgnoreCase(c) || civil.equalsIgnoreCase(v) || civil.equalsIgnoreCase(d))){
            System.out.println("Informe um estado cívil válido:");
            civil = entrada.nextLine();
        }
        entrada.close();
    }
}
