package task0912;

/* 
���������� ��� ������ � �������
����������� ���������� (� ������� ��� �� �����), ������ ��� ���, ����������� ��� ���������� ����:
int num=Integer.parseInt("XYZ");
System.out.println(num);


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

            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException" + "\n" + "������������� �������������� ");
        }
        //�������� ��� ��� ���
    }
}
