import java.util.*;

public class Main {
    public static void main(String[] args) {
        int k;
        Scanner in1 = new Scanner(System.in);
        System.out.println("Дорогой пользователь, введите точностиь с которой  будет вычисляться косинус: ");
        k = in1.nextInt();
        double digree;
        System.out.println("Дорогой пользователь, введите градусы, косинус которых вы зотите вычислить:");
        digree = in1.nextDouble();
        double result = TeylorRow.calcCos(k, Math.toRadians(digree));
        Formatter frm = new Formatter();
        frm.format("Ваш результат: %#1.10f", result);
        System.out.println(frm);
        Formatter frm1 = new Formatter();
        frm1.format("Ваш результат: %+1.10f", result);
        System.out.println(frm1);
        Formatter frm2 = new Formatter();
        frm2.format("Ваш результат: %01.10f", result);
        System.out.println(frm2);
        System.out.println(result);
        System.out.println("Погрешность составила:" + TeylorRow.compar(k, Math.toRadians(digree)));
    }
}

