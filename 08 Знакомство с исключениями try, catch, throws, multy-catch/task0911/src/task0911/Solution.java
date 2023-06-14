package task0911;

import java.util.HashMap;

/* 
���������� ��� ������ � ����������� Map
����������� ���������� (� ������� ��� �� �����), ������ ��� ���, ����������� ��� ���������� ����:
HashMap<String, String> map = new HashMap<String, String>(null);
map.put(null, null);
map.remove(null);


Requirements:
1. ��������� ������ �������� ��������� �� �����.
2. � ��������� ������ ���� ���� try-catch.
3. ��������� ������ ����������� ���������� ����������� ����, � �� ��� ��������� (Exception).
4. ���������� ��������� ������ ��������� ��� ���������� ����������.
5. ��������� ��� � ������ main �� �������.*/

public class Solution {
    public static void main(String[] args) {
        //�������� ��� ��� ���
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException" + "\n" + "������ �������� ����");
        }

        //�������� ��� ��� ���
    }
}
