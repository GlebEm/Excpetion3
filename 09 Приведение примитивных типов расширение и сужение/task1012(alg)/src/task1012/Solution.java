package task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
���������� ����
����� � ���������� 10 ������� � �������� � ��� ���������� ��������� ���� ��� ����� ��������. ��������� ������ �� ����� � ���������� �������.

������ ������:
� 5
� 8
� 3
� 7
� 0
...
� 9


Requirements:
1. ��������� ������ 10 ��� ��������� ������ � ����������.
2. ��������� ������ �������� ����� �� �����.
3. ���������� ����� ������ ��������� 33 ������.
4. ������ ������ ������ ������ ��������� ����� �������� ��������, ������ � ���������� ���, ������� ����� ����������� � ��������� �������.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // �������
//        List<Character> alphabet = Arrays.asList(
//                '�', '�', '�', '�', '�', '�', '�', '�',
//                '�', '�', '�', '�', '�', '�', '�', '�',
//                '�', '�', '�', '�', '�', '�', '�', '�',
//                '�', '�', '�', '�', '�', '�', '�', '�', '�');
        String alphabetS = "��������������������������������";
        char[] alphabetSArray = alphabetS.toCharArray();
        ArrayList<Character> alphabet = new ArrayList<Character>();  //������ ������ ��� ��������
        for (int i = 0; i < alphabetSArray.length; i++)
        {
            alphabet.add(alphabetSArray[i]);  //�������� ������ ��� �������� ���������� �� ������ �������
        }

        ArrayList<String> list = new ArrayList<String>();  //������ ��� �������� �����
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();  //������ ������
            list.add(s.toLowerCase());     //�������� ���� �������� � ������
        }
        int num = 0;
        for (int j = 0; j < alphabet.size(); j++)           //���������� �� ��������
        {
            for (int i = 0; i < list.size(); i++)           //���������� �� ������� � ������
            {
                char[] ok = list.get(i).toCharArray();           //��������� �� ������� ������ ������ ������ �� ���������� � ���������
                for (int k = 0; k < ok.length; k++)          //����������� �� ������
                {
                    if (ok[k] == alphabetSArray[j])  //���� ������ �� �������� ����� ������� �� ������, ����������� �������
                        num += 1;
                }
            }
//            System.out.println(alphabetSArray[1]);
            System.out.println(alphabetSArray[j] + " " + num); //������� ������ �������� � ��� �������
            num = 0; //�������� ������� ����� ��������� �� ����� ������ ��������!!!
        }
    }
}

































//        char[]abcArray = alphabetS.toCharArray();
//        ArrayList<Character>alphabet = new ArrayList<Character>();
//        for(int i =0;i<abcArray.length;i++){
//            alphabet.add(abcArray[i]);
//        }
//
//        // ���� �����
//        ArrayList<String> list = new ArrayList<String>();
//        for (int i = 0; i < 5; i++) {
//            String line = reader.readLine();
//            list.add(line.toLowerCase());
//        }
//
//        ArrayList<Character[]> listChar = new ArrayList<>(); //�������� ����� ������������ ������ ��������
//        for (int i = 0; i < alphabet.size(); i++) {
//            Character[] ch = new Character[list.get(i).length()]; //�������� ������ ������� ��� ��������
//            for (int j = 0; j < list.get(i).length(); j++) {
//                ch[j] = list.get(i).charAt(j); // ��������� ������ ��������
//            }
//            listChar.add(ch); //��������� ������������ ������
//        }
//        LinkedHashMap<Character, Integer> differentLetters = new LinkedHashMap<>();
//        for (Character i : alphabet) {
//            differentLetters.put(i, 0);
//        }
//        for (HashMap.Entry<Character, Integer> pair : differentLetters.entrySet()) {
//            Integer count = 1;
//            for (Character[]mass:listChar){
//                for (int i =0;i<mass.length;i++){
//                    if (pair.getKey().equals(mass[i])){
//                        pair.setValue(count++);
//                    }
//                }
//            }
//        }
//        for (HashMap.Entry<Character,Integer> pair: differentLetters.entrySet()){
//            System.out.println(pair.getKey()+" "+pair.getValue());
//        }
//    }
//}
//// �������� ��� ��� ���

