package in.rishisharma;

public class HelloIndent {
    
    public static void main(String[] args) {
        String hello = "   Hello," +
            " World!\n" +
            "   \n".stripIndent();
        System.out.println(hello);
    }
    
}
