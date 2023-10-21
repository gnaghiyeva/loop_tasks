import java.util.Scanner;

public class convert_to_word {
    public static void main(String[] args) {
        int number;
        System.out.print("n=");
        Scanner sc = new Scanner(System.in);
        number=sc.nextInt();

        int a = number/100;
        int b = (number/10)%10;
        int c = number%10;

//        System.out.println(a+" "+b+" "+c);

        switch (a){
            case 1:
                System.out.print(" yüz ");
                break;
            case 2:
                System.out.print("iki yüz ");
                break;
            case 3:
                System.out.print("üç yüz ");
                break;
            case 4:
                System.out.print("dörd yüz ");
                break;
            case 5:
                System.out.print("beş yüz ");
                break;
            case 6:
                System.out.print("altı yüz ");
                break;
            case 7:
                System.out.print("yeddi yüz ");
                break;
            case 8:
                System.out.print("səkkiz yüz ");
                break;
            case 9:
                System.out.print("doqquz yüz ");
                break;

        }

        switch (b){
            case 1:
                System.out.print("on ");
                break;
            case 2:
                System.out.print("iyirmi ");
                break;
            case 3:
                System.out.print("otuz ");
                break;
            case 4:
                System.out.print("qırx ");
                break;
            case 5:
                System.out.print("əlli ");
                break;
            case 6:
                System.out.print("altmış ");
                break;
            case 7:
                System.out.print("yetmiş ");
                break;
            case 8:
                System.out.print("səksən ");
                break;
            case 9:
                System.out.print("doxsan ");
                break;

        }

        switch (c){
            case 1:
                System.out.print("bir");
                break;
            case 2:
                System.out.print("iki");
                break;
            case 3:
                System.out.print("üç");
                break;
            case 4:
                System.out.print("dörd");
                break;
            case 5:
                System.out.print("beş");
                break;
            case 6:
                System.out.print("altı");
                break;
            case 7:
                System.out.print("yeddi");
                break;
            case 8:
                System.out.print("səkkiz");
                break;
            case 9:
                System.out.print("doqquz");
                break;

        }






    }
}
