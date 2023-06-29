public class YoungestOfThree {
    public static void main(String[] args) {
        int a = 6;
        int b =7;
        int c = 3;

        if(a<b && a<c){
            System.out.println(a);
        }else if ( b<a && b<c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
