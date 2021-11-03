package code._4_student_effort;

import java.util.Scanner;

public class FooBarQix {
    public static void compute(int x)
    {
        if(x%3==0) {
            System.out.print("Foo");
            if (x % 5 == 0)
                System.out.print("Bar");
            else if (x % 7 == 0)
                System.out.print("Qix");
        }
       else if(x%5==0) {
            System.out.print("Bar");
            if (x % 7 == 0)
                System.out.print("Qix");
        }
       else if(x%7==0)
            System.out.print("Qix");
        int r=0;
        int aux=x;
        while(aux>0)
        {
             r = r*10+aux%10;
            aux=aux/10;
        }
        while(r>0)
        {
                 if(r%10==3)
               System.out.print("Foo");
            if(r%10==5)
                System.out.print("Bar");
            if(r%10==7)
                System.out.print("Qix");
            r=r/10;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
         compute(x);
    }
}
