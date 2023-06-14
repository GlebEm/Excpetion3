package task0915;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/* 
�������� ���������� ����������
1. ���������, ����� ���������� ������� ����� BEAN.methodThrowExceptions.
2. ����� handleExceptions ������ �������� ����� BEAN.methodThrowExceptions � ������������ ����������:
2.1. ���� �������� ���������� FileSystemException, �� ���������� ��� (������� ����� BEAN.log) � ���������� ������
2.2. ���� �������� ���������� CharConversionException ��� ����� ������ IOException, �� ������ ���������� ��� (������� ����� BEAN.log)
3. ������ � ���������� ������ handleExceptions ����� ����������, ������� �� ������������� � �.2.1.
4. � ������ main ��������� ���������� ���������� - ������� ���. ��������� try..catch

���������:
���� �� �������� ���������� MyException, ������� �� ����� �����������, ��� ����� ���������� ������ ����� ����:
catch (MyException e) {
 throw e;
}


Requirements:
1. ����� handleExceptions ������ �������� ����� BEAN.methodThrowExceptions.
2. ����� handleExceptions ������ ���������� ���������� FileSystemException (������� ����� BEAN.log), � ����� ���������� ��� ������.
3. ����� handleExceptions ������ ������ ���������� (������� ����� BEAN.log) ���������� CharConversionException.
4. ����� handleExceptions ������ ������ ���������� ����� ���������� IOException.
5. ������ � ���������� ������ handleExceptions ����� ���������� FileSystemException.
6. ����� main ������ ������������ try..catch.
7. ����� main ������ ���������� ����������, ������� ������ ����� handleExceptions.*/

public class Solution {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args)  {
        try {
            handleExceptions();
        }catch (FileSystemException e){ //6. ����� main ������ ������������ try..catch.
            BEAN.log(e); //7. ����� main ������ ���������� ����������, ������� ������ ����� handleExceptions.*/
        }
    }

    public static void handleExceptions() throws FileSystemException { //5. ������ � ���������� ������ handleExceptions ����� ���������� FileSystemException.
        try {
            BEAN.methodThrowExceptions();
        } catch (FileSystemException e) { //����� handleExceptions ������ ���������� ���������� FileSystemException (������� ����� BEAN.log), � ����� ���������� ��� ������.
            BEAN.log(e);
            throw e;
        }catch (CharConversionException e){
            BEAN.log(e); //����� handleExceptions ������ ������ ���������� (������� ����� BEAN.log) ���������� CharConversionException.
        }catch (IOException e){
            BEAN.log(e); //4. ����� handleExceptions ������ ������ ���������� ����� ���������� IOException.
        }
    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0) {
                throw new CharConversionException();
            } else if (i == 1) {
                throw new FileSystemException("���");
            } else if (i == 2) {
                throw new IOException();
            }
        }
    }
}
