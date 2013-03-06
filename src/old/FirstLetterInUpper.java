package old;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FirstLetterInUpper {

	/*Write a program which will accept three sentences
    (one sentence per line) and print the words
    having Initial Caps within the sentences.*/

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> lst = new LinkedList<String>();

        for (int i = 0; i < 3; i++) {
            String tmp[] = scanner.nextLine().split(" ");
            for(String wrd:tmp)
                lst.add(wrd);
        }

        for (int i = 0; i < lst.size(); i++) {
            String str = lst.get(i).substring(0, 1);
            if(str.equals(str.toUpperCase())) {
                System.out.println(lst.get(i));
            }
        }   

    }

}
