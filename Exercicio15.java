package ExercicioIniciacao.EstruturaRepeticao;
public class Exercicio15 {
    public static void main(String[] args) {
        System.out.println("A somátoria da sequência: S=(37*38)/1 + (36*37)/2 ... + (1*2)/37 ");
        int menor = 37;
        int maior = 38;
        int denominador = 1;
        float sum = 0;
        for(int k=0;k<=38;k++){
            sum = (menor*maior)/denominador;
            menor-=1;
            maior-=1;
            denominador+=1;
        }
        System.out.println("A soma é igual a: "+sum);
    }
}
