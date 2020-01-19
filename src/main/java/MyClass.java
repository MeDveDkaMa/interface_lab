public class MyClass implements TestInterface{

    private int a = 2;
    private String b = "dasdasd";

    public void PrintMessage(String message) {

        System.out.println(message + " from first class");


    }

    public static void  CallTest(){

        System.out.println("Hello from MyClass");


    }

}
