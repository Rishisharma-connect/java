package in.rishisharma;

public class HelloAutoClose {
    public static void main(String[] args) {
        try (AutoCloseable c = System.out::println) {
            System.out.println("Hello, World!");
            c.close();
        } catch (Exception e) {
            /* do something */ } 
        finally {
            /* do something */ }

    }

}
