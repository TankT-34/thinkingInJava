public class Excercize7 {
    static class StaticTest{
        static int i = 47;
    }
    static class Incrementable{
        static void increment(){
            StaticTest.i++;
        }
    }

    public static void main(String[] args){
        Incrementable.increment();
        System.out.println("Инкрементируемое значение i: " + StaticTest.i);
    }
}
