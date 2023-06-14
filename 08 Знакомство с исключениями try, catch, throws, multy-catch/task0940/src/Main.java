import java.util.logging.Logger;

/**
 * ���� � ���������
 * ��� ������� � ���������, ��� ��� ���� 2 ������ ���������������� ��������� AutoCloseable
 * ����� �����, ������� ����������� ������ ��������� ��� ��������� Closeable, �������� ��������.
 * ��� �� ��������� � JAVA �������� ����������� �� IO/NIO � ������ ��������� �������� (����. ��� ������ � ��)
 * <p>
 * ������:
 * 1. ��������� ����������� "���� � ���������", ������������ ������� ��� ���� ������ � ���������� �� ��, ����� �������
 * ������� ����� ������� �������, ����������, � ����� �������.
 * 2. �������� ����� ��������� � �������, �� ����������� ������ INFO
 */
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) throws Exception {
        try (AutoCloseableResourcesFirst autoCloseableResourcesFirst = new AutoCloseableResourcesFirst();
             AutoCloseableResourcesSecond autoCloseableResourcesSecond = new AutoCloseableResourcesSecond()) {
            autoCloseableResourcesFirst.doSomething();
            autoCloseableResourcesSecond.doSomething();
        }catch (Exception e){
            logger.info(e.getMessage());
        }
    }
}

class AutoCloseableResourcesFirst implements AutoCloseable {
    private static final Logger loggerFirst = Logger.getLogger(Main.class.getName()); //������� ����� � ������
    public AutoCloseableResourcesFirst() {
        loggerFirst.info("�������� ����� ��������� � �������, �� �����������(������ �����) ������ INFO");
        //System.out.println("����� ������������ -> AutoCloseableResources_First");
    }

    public void doSomething() {
        loggerFirst.info("�������� ����� ��������� � �������, �� �����������(������ �����) ������ INFO");
        //System.out.println("����� �� ����� -> AutoCloseableResources_First");
    }

    @Override
    public void close() throws Exception {
        loggerFirst.info("�������� ����� ��������� � �������, �� �����������(������ �����) ������ INFO");
        //System.out.println("��������� ������ -> AutoCloseableResources_First");
    }
}


class AutoCloseableResourcesSecond implements AutoCloseable {
    private static final Logger loggerSecond = Logger.getLogger(Main.class.getName()); //������� ����� � ������
    public AutoCloseableResourcesSecond() {
        loggerSecond.info("�������� ����� ��������� � �������, �� �����������(������ �����) ������ INFO");
        //System.out.println("����� ������������ -> AutoCloseableResources_Second");
    }

    public void doSomething() {
        loggerSecond.info("�������� ����� ��������� � �������, �� �����������(������ �����) ������ INFO");
        //System.out.println("����� �� ����� -> AutoCloseableResources_Second");
    }

    @Override
    public void close() throws Exception {
        loggerSecond.info("�������� ����� ��������� � �������, �� �����������(������ �����) ������ INFO");
        //System.out.println("��������� ������ -> AutoCloseableResources_Second");
    }
}