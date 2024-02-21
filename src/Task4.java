import java.io.IOException;
import java.util.logging.*;

public class Task4 {
    private final static Logger logger = Logger.getLogger(Task4.class.getName());

    public static void main(String[] args) throws IOException {
//        Console
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINE);
//        File
        FileHandler fileHandler = new FileHandler("test2.txt",true);
        fileHandler.setFormatter(new SimpleFormatter());
        fileHandler.setLevel(Level.FINE);

        logger.setUseParentHandlers(false);
        logger.addHandler(consoleHandler);
        logger.addHandler(fileHandler);
        logger.setLevel(Level.FINE);
        logger.fine("Fine msg");

    }
}
