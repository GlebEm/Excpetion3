import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Логирование состояний и ошибок в работе программы.
 * Напишите метод, который выбрасывает проверяемое исключение и поймайте его в методе main
 * Отловите и залогируйте начало вызова метода с ошибкой и саму ошибку уровнем INFO и WARNING соответственно
 */

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Hello world!");
        try {
            logger.info("залогируйте начало вызова метода с ошибкой уровнем INFO");
            bigDeal();
        } catch (FileNotFoundException e) {
            logger.warning("Залогируйте саму ошибку уровнем WARNING ");
        }
    }

    public static void bigDeal() throws FileNotFoundException {
        File file = new File("Не существующий файл");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw e;
        }
    }
}