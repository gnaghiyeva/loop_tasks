import java.util.Scanner;

public class fibonacci_series_while {
    public static void main(String[] args) {
        int n1 = 0, n2=1, i=1, n;

        System.out.print("n=");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        while (i<=n){

            System.out.print(n1+  " ");
            int n3 = n1+n2;
            n1=n2;
            n2=n3;
            i++;
        }
    }
}
