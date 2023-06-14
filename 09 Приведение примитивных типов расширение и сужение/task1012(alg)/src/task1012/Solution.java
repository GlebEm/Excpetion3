package task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра. Результат выведи на экран в алфавитном порядке.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
...
я 9


Requirements:
1. Программа должна 10 раз считывать данные с клавиатуры.
2. Программа должна выводить текст на экран.
3. Выведенный текст должен содержать 33 строки.
4. Каждая строка вывода должна содержать букву русского алфавита, пробел и количество раз, которое буква встречалась в введенных строках.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
//        List<Character> alphabet = Arrays.asList(
//                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
//                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
//                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
//                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');
        String alphabetS = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] alphabetSArray = alphabetS.toCharArray();
        ArrayList<Character> alphabet = new ArrayList<Character>();  //Создал массив для символов
        for (int i = 0; i < alphabetSArray.length; i++)
        {
            alphabet.add(alphabetSArray[i]);  //Заполнил массив для символов элементами из строки алфавит
        }

        ArrayList<String> list = new ArrayList<String>();  //Массив для вводимых строк
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();  //Считал строку
            list.add(s.toLowerCase());     //Заполнил лист строками с ридера
        }
        int num = 0;
        for (int j = 0; j < alphabet.size(); j++)           //Проходимся по алфавиту
        {
            for (int i = 0; i < list.size(); i++)           //Проходимся по строкам с ридера
            {
                char[] ok = list.get(i).toCharArray();           //Проверяем по порядку каждый символ строки на совпадение с алфавитом
                for (int k = 0; k < ok.length; k++)          //пробежались по строке
                {
                    if (ok[k] == alphabetSArray[j])  //Если символ из алфавита равен символу из строки, инкрементим счётчик
                        num += 1;
                }
            }
//            System.out.println(alphabetSArray[1]);
            System.out.println(alphabetSArray[j] + " " + num); //Выводим символ алфавита и его счетчик
            num = 0; //обнуляем счетчик перед переходом на новый символ алфавита!!!
        }
    }
}

































//        char[]abcArray = alphabetS.toCharArray();
//        ArrayList<Character>alphabet = new ArrayList<Character>();
//        for(int i =0;i<abcArray.length;i++){
//            alphabet.add(abcArray[i]);
//        }
//
//        // Ввод строк
//        ArrayList<String> list = new ArrayList<String>();
//        for (int i = 0; i < 5; i++) {
//            String line = reader.readLine();
//            list.add(line.toLowerCase());
//        }
//
//        ArrayList<Character[]> listChar = new ArrayList<>(); //Объявили новый динамический массив символов
//        for (int i = 0; i < alphabet.size(); i++) {
//            Character[] ch = new Character[list.get(i).length()]; //Объявили размер массива для символов
//            for (int j = 0; j < list.get(i).length(); j++) {
//                ch[j] = list.get(i).charAt(j); // заполнили массив символов
//            }
//            listChar.add(ch); //Заполнили динамический массив
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
//// напишите тут ваш код

