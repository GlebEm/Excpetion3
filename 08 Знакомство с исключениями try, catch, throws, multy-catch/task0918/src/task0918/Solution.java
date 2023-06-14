package task0918;

/* 
Все свои, даже исключения
Есть четыре класса MyException, MyException2, MyException3, MyException4.
Унаследуй классы так, чтобы у тебя появилось любые два checked исключения и любые два unchecked исключения.

Подсказка:
Изучи внимательно классы Exception1, Exception2, Exception3 из второй задачи этого блока.


Requirements:
1. В классе Solution должно быть 4 вложенных класса: MyException, MyException2, MyException3 и MyException4.
2. Все вложенные классы должны быть унаследованы от классов исключений.
3. Два класса из четырех должны быть checked исключениями.
4. Два класса из четырех должны быть unchecked исключениями.*/

import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends FileSystemNotFoundException {   // В классе Solution должно быть 4 вложенных класса: MyException
    }
//3. Два класса из четырех должны быть checked исключениями.
    static class MyException2 extends IOException { /// В классе Solution должно быть 4 вложенных класса: MyException2
    }
//3. Два класса из четырех должны быть checked исключениями.
    static class MyException3 extends RuntimeException{ // В классе Solution должно быть 4 вложенных класса: MyException3
    }
//4. Два класса из четырех должны быть unchecked исключениями.
    static class MyException4 extends IndexOutOfBoundsException{ // В классе Solution должно быть 4 вложенных класса: MyException4
    }
//4. Два класса из четырех должны быть unchecked исключениями.
}

