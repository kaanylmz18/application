package application.randomgenerator;

import java.util.Random;

import datetime.Date;
import math.Fraction;
import math.Point;
import array.ArrayUtil;
import java.util.Scanner;

public class RandomObjectArrayGeneratorApp {
    private RandomObjectArrayGeneratorApp() {
    }

    public static void run() {
        Random random = new Random();
        RandomObjectArrayFactory factory = new RandomObjectArrayFactory(random);
        Scanner kb = new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını giriniz:");
        int count = Integer.parseInt(kb.nextLine());

        for (Object object : factory.getObjects(count)) {
            System.out.println("--------------------------------------------------");
            String typeName = object.getClass().getName();
            System.out.printf("Dinamik tür ismi:%s%n", typeName);

            if (object instanceof String) {
                String s = (String) object;

                System.out.println(s.toUpperCase());
            } else if (object instanceof Fraction) {
                Fraction f = (Fraction) object;

                System.out.println(f.toString());
            } else if (object instanceof Date) {
                Date date = (Date) object;

                System.out.println(date.toLongDateStringTR());
            } else if (object instanceof int[]) {
                int[] a = (int[]) object;

                ArrayUtil.display(2, a);
            } else {
                Point p = (Point) object;

                System.out.println(p.toString());
                p.offset(20);
                System.out.println(p.toString());
            }
            System.out.println("--------------------------------------------------");
        }
    }
}