public class VariableTest {
    // Normal variable member, belongs to object
    public String first = "hello world";
    // Static variable member, belongs to class
    public static String second = "core java";
    // Parameter of method(frameWork), is local variable
    // Variable defined inside method(spring), is local variable
    public String studyFrameWork(String frameWork){
        String spring = "spring";
        return spring + frameWork;
    }
    // Parameter of method(webFrameWork), is local variable
    // Variable defined inside method(vue), is local variable
    public String studyWebFrameWork(String webFrameWork){
        String vue = "vue";
        return vue + webFrameWork;
    }
}
