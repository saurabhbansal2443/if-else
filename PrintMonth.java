import java.util.*;
public class PrintMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        if( n==1){
            System.out.println("Jan");
        }else if( n==2){
            System.out.println("feb");
        }else if( n==3){
            System.out.println("march");
        }else if( n==4){
            System.out.println("april");
        }else if( n==5){
            System.out.println("may");
        }else if( n==6){
            System.out.println("june");
        }else if( n==7){
            System.out.println("july");
        }else if( n==8){
            System.out.println("august");
        }else if( n==9){
            System.out.println("sep");
        }else if( n==10){
            System.out.println("oct");
        }else if( n==11){
            System.out.println("Nov");
        }else if( n==12){
            System.out.println("dec");
        }else{
            System.out.println("Invalid Input ");
        }
    }
}
