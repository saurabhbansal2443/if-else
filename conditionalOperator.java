public class conditionalOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 6;

     // code for maximum of three numbers 
        // if(a>b && a>c){
        //     System.out.println(a);
        // }else if(b>a && b>c){
        //     System.out.println(b);
        // }else{
        //     System.out.println(c);
        // }

      // code for triangle 
    

      if(a==b && a==c){
        System.out.println("Equi");
      }else if ( a==b || b==c || a==c){
        System.out.println("iso");
      }else{
        System.out.println("Scale");
      }



      
      
    }
}
