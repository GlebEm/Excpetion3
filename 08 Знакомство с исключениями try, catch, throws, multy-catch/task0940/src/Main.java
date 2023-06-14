import java.util.logging.Logger;

/**
 * Трай с ресурсами
 * Для примера и упрощения, вам уже даны 2 класса имплементирующие интерфейс AutoCloseable
 * Любой класс, который имплементит данный интерфейс или интерфейс Closeable, является ресурсом.
 * Так же ресурсами в JAVA являются практически всё IO/NIO и классы требующие закрытия (напр. при работе с БД)
 * <p>
 * Задача:
 * 1. Используя конструкцию "Трай с ресурсами", ОДНОВРЕМЕННО вызвать оба этих класса и посмотреть на то, каким образом
 * ресурсы будут сначала открыты, отработаны, а затем закрыты.
 * 2. Заменить вывод сообщений в консоль, на логирование уровня INFO
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
    private static final Logger loggerFirst = Logger.getLogger(Main.class.getName()); //Добавил логер в классы
    public AutoCloseableResourcesFirst() {
        loggerFirst.info("Заменить вывод сообщений в консоль, на логирование(первый логер) уровня INFO");
        //System.out.println("Вызов конструктора -> AutoCloseableResources_First");
    }

    public void doSomething() {
        loggerFirst.info("Заменить вывод сообщений в консоль, на логирование(первый логер) уровня INFO");
        //System.out.println("Какой то метод -> AutoCloseableResources_First");
    }

    @Override
    public void close() throws Exception {
        loggerFirst.info("Заменить вывод сообщений в консоль, на логирование(первый логер) уровня INFO");
        //System.out.println("ЗАКРЫВАЕМ ресурс -> AutoCloseableResources_First");
    }
}


class AutoCloseableResourcesSecond implements AutoCloseable {
    private static final Logger loggerSecond = Logger.getLogger(Main.class.getName()); //Добавил логер в классы
    public AutoCloseableResourcesSecond() {
        loggerSecond.info("Заменить вывод сообщений в консоль, на логирование(второй логер) уровня INFO");
        //System.out.println("Вызов конструктора -> AutoCloseableResources_Second");
    }

    public void doSomething() {
        loggerSecond.info("Заменить вывод сообщений в консоль, на логирование(второй логер) уровня INFO");
        //System.out.println("Какой то метод -> AutoCloseableResources_Second");
    }

    @Override
    public void close() throws Exception {
        loggerSecond.info("Заменить вывод сообщений в консоль, на логирование(второй логер) уровня INFO");
        //System.out.println("ЗАКРЫВАЕМ ресурс -> AutoCloseableResources_Second");
    }
}