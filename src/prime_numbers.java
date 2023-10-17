import java.util.Scanner;

public class prime_numbers {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("a=");
        a= sc.nextInt();

        System.out.print("b=");
        b=sc.nextInt();

        for (int i = a; i <= b; i++) {

            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    prime = false;
                    break;
                }

            }
            if(prime==true)
                System.out.print(i+" ");


        }

    }
}
