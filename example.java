package Classes;

public class example {
    private int a= 10;
    public static int b= 20;
    public void printa(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println(b);
        example x = new example();
        x.printa();
    }
}
