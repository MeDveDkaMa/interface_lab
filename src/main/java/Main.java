import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Main {

    private static final String CLASSFORTEST = "java.lang.String";
    //private static final String CLASSFORTEST = "java.lang.reflect.Method";

    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Information info = new Information();
        Information info2 = new Information();
        try {


            Myclassloader myclassloader1 = new Myclassloader();
            Myclassloader2 myclassloader2 = new Myclassloader2();

            Class test1 = myclassloader1.findClass("/home/alexander/IdeaProjects/Interface/target/classes/MyClass");
            Class test2 = myclassloader2.findClass("/home/alexander/IdeaProjects/Interface/target/classes/MyClass2");
            System.out.println("Load Class: " + test1+ " && " + test2);

//            Method method = test1.getMethod("PrintMessage",new Class[]{String.class});
//            method.invoke(test1.newInstance(), new Object[]{"Hello Classloader"});

            Method method = test1.getMethod("CallTest");//,new Class[]{Class.class});
            Method method2 = test2.getMethod("CallMyClass",new Class[]{Method.class});
            method2.invoke(test2.newInstance(), method);



            TestInterface testInterface = (TestInterface)  test2.newInstance();
            testInterface.PrintMessage("Wooooooooow");

//            info2.getInfo(test1);
//            info.getInfo(test2);
//            info.printClass();



            Class clazz = Class.forName(CLASSFORTEST);
            info.getInfo(clazz);
            info.printClass();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
