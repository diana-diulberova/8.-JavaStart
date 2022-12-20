// Написать программу, определяющую правильность расстановки скобок в выражении.

// a+(d*3) - истина
// [a+(1*3) - ложь
// [6+(3*3)] - истина
// {a}[+]{(d*3)} - истина
// <{a}+{(d*3)}> - истина
// {a+]}{(d*3)} - ложь

package Homework_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_3 {
    public static void main (String[] args) {
        String str = "a+(d*3)";
        // String str = "[a+(1*3)";
        // String str = "[6+(3*3)]";
        // String str = "{a}[+]{(d*3)}";
        // String str = "<{a}+{(d*3)}>";
        // String str = "{a+]}{(d*3)}";
        String[] s = str.split("");

        ArrayList <String> arrayList = new ArrayList<>(Arrays.asList(s));
        System.out.println(str);
        // System.out.println(arrayList);

        RemoveBrackets(arrayList, "(", ")");
        RemoveBrackets(arrayList, "[", "]");
        RemoveBrackets(arrayList, "{", "}");
        RemoveBrackets(arrayList, "<", ">");

        // System.out.println(arrayList);
        System.out.println(Checking(arrayList));
    }
    public static ArrayList <String> RemoveBrackets (ArrayList <String> arrayList, String first_Bracket, String second_Bracket) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(first_Bracket)) {
                for (int j = 0; j < arrayList.size(); j++) {
                    if (arrayList.get(j).equals(second_Bracket)) {
                        arrayList.remove(j);
                        arrayList.remove(i);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }
    
    public static boolean Checking (ArrayList <String> arrayList) {
        boolean result = true;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals("(") || arrayList.get(i).equals(")") || arrayList.get(i).equals("[") || arrayList.get(i).equals("]") || arrayList.get(i).equals("{") || arrayList.get(i).equals("}") || arrayList.get(i).equals("<") || arrayList.get(i).equals(">")) {
                result = false;
            }

        }
        return result;
    }
    
}
