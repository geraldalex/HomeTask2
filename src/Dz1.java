import java.util.Scanner;

public class Dz1 {
    static double a,b,c,Q,R,PI,t,x1,x2,x3,A,B;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x3+a*x2+b*x+c=0");
        System.out.println("Введите действительные коэффициэнты a, b, c : ");



        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        korny(a,b,c);
    }
    public static void korny(double a, double b,double c){
        System.out.println("x3+"+a+"*x2+"+b+"*x+"+c+"=0");
        Q =  (Math.pow(a,2)-3*b)/9;
        R =  (2*Math.pow(a,3)-9*a*b+27*c)/54;

        if(Math.pow(R,2)<Math.pow(Q,3)){
            t = Math.acos(R/Math.sqrt(Math.pow(Math.abs(Q),3)))/3;
            System.out.println(t);
            x1 = -2*Math.sqrt(Q)*Math.cos(t)-a/3;
            x2 = -2*Math.sqrt(Q)*Math.cos(t+(2*PI/3))-a/3;
            x2 = -2*Math.sqrt(Q)*Math.cos(t-(2*PI/3))-a/3;
            System.out.println("Имеем три действительных корня, вычисляющихся по формулам (Виета): " + x1+"  "+ x2+"  "+ x3);
        }else  if (Math.pow(R,2)>=Math.pow(Q,3)){
            if(R<=0)
                R = -R;
            A = -Math.pow(R+Math.sqrt(Math.pow(R,2)-Math.pow(Q,3)),1/3);
            if (A!=0)
                B = Q/A;
            else
                B=0;
            x1 = (A+B)-A/3;
            System.out.println("Имеем один действительный корень: "  + x1);
            if(A==B){
                x2 = -A-a/3;
                x3 = x2;
                System.out.println("Имеем три действительных корня: " + x1+"  "+ x2+"  "+ x3);
            }
        }
    }
}
