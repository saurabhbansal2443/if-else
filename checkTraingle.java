public class checkTraingle {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;

        if(a==b){
            if(a==c){
                System.out.println("Equi");
            }else{
                System.out.println("Iso");
            }
        }else if(b==c){
            System.out.println("iso");
        }else if(a==c){
            System.out.println("iso");
        }else{
            System.out.println("scalene");
        }
    }
}
