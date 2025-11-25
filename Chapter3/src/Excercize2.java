class Float{
    float obj;
}
public class Excercize2{
    public static void main(String[] args){
        Float f1 = new Float();
        Float f2 = new Float();
        f1.obj = 6.66f;
        f2.obj = 2.22f;
        System.out.println("f1 = " + f1.obj + ", f2 = " + f2.obj);
        f1 = f2;
        System.out.println("f1 = " + f1.obj + ", f2 = " + f2.obj);
        f1.obj = 3.14f;
        System.out.println("f1 = " + f1.obj + ", f2 = " + f2.obj);
    }
}
