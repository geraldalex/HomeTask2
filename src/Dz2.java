import java.util.Scanner;

public class Dz2 {
    public static void main(String[] args) {
        System.out.println("Введите стороны прямоугольника а и  b : ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double S = a*b;
        double P = 2*(a+b);
        System.out.println("Площадь прямоугольника равна: " + S);
        System.out.println("Периметр прямоугольника равен: " + P);


    }
}
