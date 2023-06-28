public class perimeterArea {
    public static void main(String[] args) {
        int a = 6;
        int b = 7;

        int area = a*b;
        int peri = a+b+a+b;

        if(area>peri){
            System.out.println("Area is greater " + area);
        }else{
             System.out.println("Perimeter is greater " + peri); 
        }

    }
}
