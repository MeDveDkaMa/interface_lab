import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Information {

    public static StringBuilder sb = new StringBuilder();

    public void getInfo(Class clazz) {
        printClass(clazz);
        getFields(clazz);
        getMethods(clazz);
        getParent(clazz);
        getInterfaces(clazz);
    }

    private void getFields(Class clazz) {
        Field[] field = clazz.getDeclaredFields();
        int cout = field.length;
        sb.append("\nFields: " + printClass(clazz) + "\n==========================" + "\t ").append(cout).append("\n");
        for (int i = 0; i < field.length; i++) {
         sb.append(field[i]).append("\n");
        }
    }

    private String printClass(Class clazz){
        StringBuffer temp = new StringBuffer();
        temp.append(clazz.getName()).toString();
        return String.valueOf(temp);
    }

    private void getInterfaces(Class clazz) {
        Class[] field = clazz.getInterfaces();
        int cout = field.length;
        sb.append("\nInterfaces of :" + printClass(clazz) + "\n==========================" + "\t ").append(cout).append("\n");
        for (int i = 0; i < field.length; i++) {
            sb.append(field[i]).append("\n");
        }
    }

    private void getMethods(Class clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        int cout = methods.length;
        sb.append("\nMethods:" + printClass(clazz) + "\n==========================" + "\t ").append(cout).append("\n");
        for (int i = 0; i < methods.length; i++) {
            sb.append(methods[i]).append("\n");
        }
    }

    private void getParent(Class clazz) {
        if (clazz.getSuperclass() != null) {
            sb.append("\nSuperclass: " + printClass(clazz) + "\n==========================\n" + "\t" + clazz.getSuperclass().getName()).append("\n");
            getInfo(clazz.getSuperclass());
        }
    }
}
