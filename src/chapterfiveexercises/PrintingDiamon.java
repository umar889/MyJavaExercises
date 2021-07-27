package chapterfiveexercises;

import java.util.Scanner;

public class PrintingDiamon {
    private static int i;
    private static int n;
    private static int j;
    private static int k;

    public static void main(String[] args) throws InterruptedException {
        Scanner in= new Scanner(System.in);

        System.out.print("Enter size of triangle(must be odd in range 1-19): ");
        n=in.nextInt();
        while(n%2==0||n<1||n>19)
        {System.out.println("must be odd between 1 and 19");
            System.out.print("Enter size of triangle(must be odd in range 1-19): ");
            n=in.nextInt();

        }
        for(j=1;j<=n;j+=2)
        {for(i=1;i<=(n-j)/2;i++)
            System.out.print(" ");
            for(k=1;k<=j;k++)
                System.out.print("*");

            System.out.println();

        }
        for(j=n-1;j>=2;j-=2)
        {for(i=1;i<=(n-j+1)/2;i++)
            System.out.print(" ");
            for(k=1;k<j;k++)
                System.out.print("*");
            System.out.println();

        }
    }
}


