package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {

    //Quadrilátero - Return

       System.out.println("Exercício Return");
        double areaQuadrado  = Quadrilatero.area( 3);
        System.out.println("Área do quadrado:"  + areaQuadrado);
        double areaRetangulo = Quadrilatero.area( 5d,5d);
        System.out.println("Área do retângulo:" + areaRetangulo);
        double areaTrapezio = Quadrilatero.area( 7,8,9);
        System.out.println("Área do Trapezio:"  + areaTrapezio);
        double areaLosango = Quadrilatero.area( 5f,5f);
        System.out.println("Área do Losango:" + areaLosango);
    }
}
