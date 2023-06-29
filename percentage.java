import java.util.*;
public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();

        int totalMarksObtained= sub1 + sub2 + sub3 + sub4 + sub5;

        int p = totalMarksObtained/5;

        if(p>=90){
            System.out.println("Grade A");
        }else if(p>=80){
            System.out.println("Grade B");
        }else if (p>=70){
            System.out.println("Grade C");
        }else if (p>=60){
            System.out.println("Grade D");
        }else if(p>=40){
            System.out.println("Grade E");
        }else{
            System.out.println("Grade F");
        }
    }
}
