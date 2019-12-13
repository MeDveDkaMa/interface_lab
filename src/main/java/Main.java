public class Main {

    //private static final String CLASSFORTEST = "java.lang.String";
    private static final String CLASSFORTEST = "java.lang.reflect.Method";

    public static void main(String[] args) {
        Information info = new Information();
        try {
            Class clazz = Class.forName(CLASSFORTEST);
            info.getInfo(clazz);
            System.out.println(Information.sb);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
