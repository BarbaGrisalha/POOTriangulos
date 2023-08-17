package calculos;

import java.io.PrintStream;

public class DefinicaoTriangulo {
    public int aSide;
    public int bSide;
    public int cSide;
    public String name;
    public int perimeter;


    public void calc() {
        if (aSide == bSide && bSide == cSide) {
            perimeter = aSide + bSide + cSide;
            System.out.printf("Triângulo Equilátero com perímetro %d%n", perimeter);
        } else if (aSide == bSide || aSide == cSide || bSide == cSide) {
            perimeter = aSide + bSide + cSide;
            System.out.printf("Triângulo Isóceles com perímetro %d%n", perimeter);
        } else {
            perimeter = aSide + bSide + cSide;
            System.out.printf("Triângulo Escaleno com perímetro %d%n", perimeter);
        }

    }

}
