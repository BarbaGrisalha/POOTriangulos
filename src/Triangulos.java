import calculos.DefinicaoTriangulo;

import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DefinicaoTriangulo defTriangulo = new DefinicaoTriangulo();


        System.out.println("tipos de Triangulo:");
        System.out.println("Insira os Lados do Triângulo , assim verificaremos o perímetro e qual o tipo do triângulo:");
        System.out.println("Lado 01");
        defTriangulo.aSide = sc.nextInt();
        System.out.println("Lado 02");
        defTriangulo.bSide = sc.nextInt();
        System.out.println("Lado 03");
        defTriangulo.cSide = sc.nextInt();

        defTriangulo.calc();

        sc.close();
    }
}
