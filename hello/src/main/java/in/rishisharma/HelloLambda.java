package in.rishisharma;

public class HelloLambda {

    public static void main(String[] args) {
        Runnable helloWorld = () -> System.out.println("Hello, World!");
        helloWorld.run();
    }

}
