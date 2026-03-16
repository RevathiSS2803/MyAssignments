package orrg.study.org.week2;

public class Fibonaci_less_than_100 {
    public static void main(String[] args) {
        int a1 = 0; int b1 = 1;
        while (a1 < 1000)
        {
            System.out.print(a1+ " ");
            int c = a1+b1;
            a1 = b1;
            b1 = c;
        }
        
    }

}
