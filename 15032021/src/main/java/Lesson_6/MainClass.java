package Lesson_6;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.logging.*;

public class MainClass {
    private static final Logger logger = Logger.getLogger("");
//    private static final Logger logger = Logger.getLogger(Lesson_6.MainClass.class.getName());
    public static void main(String[] args) throws IOException {

//        LogManager.getLogManager().readConfiguration(new FileInputStream("logging.prop"));
//
//        logger.setLevel(Level.ALL);
//        logger.getHandlers()[0].setLevel(Level.ALL);
//
//        logger.getHandlers()[0].setFormatter(new Formatter() {
//            @Override
//            public String format(LogRecord record) {
//                return record.getLevel() + "\t" + record.getMessage() + "\t " + record.getMillis() + "\n";
//            }
//        });
//        logger.getHandlers()[0].setFilter(new Filter() {
//            @Override
//            public boolean isLoggable(LogRecord record) {
//                return record.getMessage().startsWith("J");
//            }
//        });
////
//        Handler fileHandler = new FileHandler("mylog.log", true);
//        fileHandler.setLevel(Level.ALL);
//        fileHandler.setFormatter(new SimpleFormatter());
//        logger.addHandler(fileHandler);
////
//        logger.log(Level.SEVERE, "Java");
//        logger.log(Level.INFO, "C#");
//        logger.log(Level.CONFIG, "Python");
//        logger.log(Level.FINE, "JS");

        // OFF
        // SEVERE - важные ошибки
        // WARNING - ошибка
        // INFO - информация
        // CONFIG - параметры
        // FINE - кастомный уровень 1
        // FINER - кастомный уровень 2
        // FINEST - кастомный уровень 3
        // ALL


        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 2));


    }
}
