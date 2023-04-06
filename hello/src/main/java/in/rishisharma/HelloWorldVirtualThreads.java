package in.rishisharma;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HelloWorldVirtualThreads {

    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newSingleThreadExecutor();
        
        executor.submit(() -> {
            System.out.println("Hello, World!");
        });
        
        executor.shutdown();
    }
}
