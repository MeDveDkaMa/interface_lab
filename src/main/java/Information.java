import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Information {

    public static StringBuilder sb = new StringBuilder();

    public void getInfo(Class clazz) {
        getFields(clazz);
        getMethods(clazz);
        getInterfaces(clazz);
        getParent(clazz);
    }

    private void getFields(Class clazz) {
        String Fields = null;
        Field[] field = clazz.getDeclaredFields();
        int cout = field.length;
        sb.append("\nFields: \n" + "==========================" + "\t ").append(cout).append("\n");
        for (int i = 0; i < field.length; i++) {
         sb.append(field[i]).append("\n");
        }
    }

    private void getInterfaces(Class clazz) {
        String Fields = null;
        Class[] field = clazz.getInterfaces();
        int cout = field.length;
        sb.append("\nInterfaces: \n" + "==========================" + "\t ").append(cout).append("\n");
        for (int i = 0; i < field.length; i++) {
            sb.append(field[i]).append("\n");
        }
    }

    private void getMethods(Class clazz) {
        String Methods = null;
        Method[] methods = clazz.getDeclaredMethods();
        int cout = methods.length;
        sb.append("\nMethods: \n" + "==========================" + "\t").append(cout).append("\n");
        for (int i = 0; i < methods.length; i++) {
            sb.append(methods[i]).append("\n");
        }
    }

    private void getParent(Class clazz) {
        if (clazz.getSuperclass() != null) {
            sb.append("\nSuperclass: \n" + "========================== \n" + clazz.getSuperclass().getName()).append("\n");
            getInfo(clazz.getSuperclass());
        }
    }
}
