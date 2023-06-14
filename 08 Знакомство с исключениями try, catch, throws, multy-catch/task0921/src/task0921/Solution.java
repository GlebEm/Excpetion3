package task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

/* 
����� � try..catch
�������� ���������, ������� ����� ������� ����� � ����������.
��� �� ������ ����� � ���������� ������ ���� � ������ readData.
��� ������ readData �������� � try..catch.
���� ������������ ��� �����-�� �����, ������ ����� �����, �� ����� ������ ����������� ���������� � ������� �� ����� ��� ����� ��������� ����� � �������� ����������.
����� �������� � ����� ������ �������� ������� �����.


Requirements:
1. ��������� ������ ��������� ������ � ����������.
2. ����� main �� ��������.
3. ����� main �� ������ ������ ����������.
4. ����� readData ������ ��������� ���� try..catch.
5. ���� ������������ ���� �����, � �� �����, ��������� ������ ������� ��� ����� ��������� �����.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        readData();
    }

    public static void readData() throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();
        int n;
        String sum;
        try {
            while (true) {
                n = Integer.parseInt(reader.readLine());
                numbers.add(n);
            }
        } catch (NumberFormatException e) {
            System.out.println("������� ������, � �� �����");
            for (int num : numbers) {
                System.out.println(num);
            }
        }
    }
}
//����� �������� � ����� ������ �������� ������� �����.