import java.util.Scanner;

public class square_root_integers {
    public static void main(String[] args) {
        int n,i=1,result;
        Scanner sc = new Scanner(System.in);
        System.out.print("n=");
        n=sc.nextInt();
        while (i<n){
            result = i*i;
            System.out.print(result + " ");
            i++;
        }
    }
}
