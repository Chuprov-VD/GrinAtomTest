package TaskAtomGrin;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
      String word = Input();
      Palindrom(word);

    }
    static String Input(){
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        scanner.close();
        return str;
    }
    static void Palindrom(String word){
        int f = word.length();
        int count = -1;
        int i = -1;
        while (i < f){
            f = f - 1;
            i++;
            if (word.toCharArray()[i] == word.toCharArray()[f]){
                count++;
                }
        }
        if (count == word.length() / 2){
            System.out.println("Да, строка является палиндромом ");
        }
        else {
            System.out.println("Нет, строка не является палиндромом ");
        }
    }
}
