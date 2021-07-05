import java.util.Scanner;

public class Main {

    static boolean asal(int n,int i){
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return asal(n, i + 1);
    }


    public static void main(String[] args) {

        int k;

        Scanner input =new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        k=input.nextInt();


        if (asal(k, 2))
            System.out.println(k+ " Sayısı ASALDIR !");
        else
            System.out.println(k+ " Sayısı ASAL değildir !");





    }
}
