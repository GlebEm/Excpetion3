import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * ����������� ��������� � ������ � ������ ���������.
 * �������� �����, ������� ����������� ����������� ���������� � �������� ��� � ������ main
 * �������� � ����������� ������ ������ ������ � ������� � ���� ������ ������� INFO � WARNING ��������������
 */

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Hello world!");
        try {
            logger.info("����������� ������ ������ ������ � ������� ������� INFO");
            bigDeal();
        } catch (FileNotFoundException e) {
            logger.warning("����������� ���� ������ ������� WARNING ");
        }
    }

    public static void bigDeal() throws FileNotFoundException {
        File file = new File("�� ������������ ����");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw e;
        }
    }
}