import java.util.Scanner;

public class Exercicios{ /* minha ideia foi de uma calculadora de media com peso em cada uma das notas
    uma com peso de 3.5 e a outra com peso de 7.5 com a soma dos pesos sendo 11
    e sabendo que cada nota pode ir apenas de 1.0(um float) á 10.0 (dez Float)*/
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner(System.in); //importei a classe do scanner pra ler os valores.
        float A,B,media;
        System.out.println("Digite a primeira nota: "); //interação pra nao ficar muito robótico
        A = teclado.nextFloat();
        System.out.println("Digite a segunda nota: ");
        B = teclado.nextFloat();
        media = (float)((A* 3.5 + B * 7.5)/11);//Poderia também por a typeCast pra declarar como Float.
        System.out.printf("A Média do aluno foi de %.2f: ", media);




}




}