import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tipos de Triangulo:");
        System.out.println("Insira os Lados do Triângulo , assim verificaremos a área e qual o tipo do triângulo:");
        System.out.println("Lado 01");
        int ladoA  = sc.nextInt();
        System.out.println("Lado 02");
        int ladoB  = sc.nextInt();
        System.out.println("Lado 03");
        int ladoC  = sc.nextInt();

        sc.close();
    }
}
