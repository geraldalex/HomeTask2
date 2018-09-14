import java.util.Scanner;

public class Dz4 {
    public static void main(String[] args) {
        System.out.println("Введите номер формулы: ");
        Scanner sc = new Scanner(System.in);
        int formula = sc.nextInt();
        double answer;
        double x;
        double y;
        switch (formula){
            case 1:
                System.out.println("Введите коэфициэнты a, b, c : ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                answer = (b + Math.sqrt(Math.pow(b,2)+4*a*c))/2*a - Math.pow(a,3)*c+Math.pow(b,-2);
                System.out.println(answer);
                break;
            case 2:
                System.out.println("Введите x : ");
                x = sc.nextDouble();
                answer = Math.pow(x,2) + Math.pow(x,3);
                System.out.println(answer);
                break;
            case 3:
                System.out.println("Введите x : ");
                x = sc.nextDouble();
                answer = x-Math.pow(x,3)/3+Math.pow(x,5)/5;
                System.out.println(answer);
                break;
            case 4:
                System.out.println("Введите коэфициэнты x, y : ");
                x = sc.nextDouble();
                y = sc.nextDouble();
                answer = (x+y)/(y+1)-(x*y-12)/(34 + x);
                System.out.println(answer);
                break;
            case 5:
                System.out.println("Введите x : ");
                x = sc.nextDouble();
                answer = Math.sin(Math.sqrt(x + 1)) - Math.sin(Math.sqrt(x - 1));
                System.out.println(answer);
                break;




        }
    }
}
