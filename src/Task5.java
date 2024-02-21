import java.util.concurrent.Callable;

public class Task5 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                run();
            }
        };


        Callable<Integer> call= ()->{
            Thread.sleep(1000);
            return 1;
        };

    }
}
