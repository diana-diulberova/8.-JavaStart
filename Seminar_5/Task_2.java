// Даны 2 строки, написать метод, который вернет true, если эти строки являются 
// изоморфными и false, если нет. Строки изоморфны, если одну букву в первом 
// слове можно заменить на некоторую букву во втором слове, при этом
// повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением 
// порядка следования. (Например, add - egg изоморфны)
// буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true

package Seminar_5;

import java.util.HashMap;
import java.util.Map;

public class Task_2 {
    public static void main (String[] args) {
        System.out.println(IsIzomorph("paper", "title"));
    }
    public static boolean IsIzomorph (String s1, String s2) { // Проверка равенства длины слов
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.equals(s2)) { // проверка одинаковости двух слов
            return true;
        }
        Map <Character, Character> subWord = new HashMap<>(); // символы первого слова - ключ. Мы им присваиваем соответствие символов во втором слове
        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i); // Парсим слово на символы. Делаем соответствие символов 1 слово к символам 2 слова
            char b = s2.charAt(i);
            if (subWord.containsKey(a) && b != subWord.get(a)) {
                return false;
            } else {
                subWord.put(a, b);
            }
        }
        return true;
    }
