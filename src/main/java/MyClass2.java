import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyClass2 implements TestInterface {

    public void PrintMessage(String message) {
        System.out.println(message + " from second class");
    }
    public void CallMyClass(Method method) throws InvocationTargetException, IllegalAccessException {
        System.out.println("HELLO FROM MYCLASS2, CALL MY CLASS....");
        method.invoke(null,null);
    }
}
