public class Excercize9 {
    public static void main(String[] args){
        float expFloat1 = 1.13e-12f;
        float expFloat2 = 1.13e-24f;

        double expDouble1 = 54e12;
        double expDouble2 = 54e24;

        if (expFloat1 < expFloat2){
            System.out.println("Наименьшее expFloat1 = " + expFloat1);
            System.out.println("Наибольшее expFloat2 = " + expFloat2);
        }
        else {
            System.out.println("Наименьшее expFloat2 = " + expFloat2);
            System.out.println("Наибольшее expFloat1 = " + expFloat1);
        }
        if (expDouble1 < expDouble2){
            System.out.println("Наименьшее expDouble1 = " + expDouble1);
            System.out.println("Наибольшее expDouble2 = " + expDouble2);
        }
        else {
            System.out.println("Наименьшее expDouble2 = " + expDouble2);
            System.out.println("Наибольшее expDouble1 = " + expDouble1);
        }
    }
}
