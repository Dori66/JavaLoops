package CelonisExercise;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(solution("abba"));
    }

    public static boolean solution(String S){


        for (int i=0; i<S.length();i++){
           if (S.charAt(i) == 'a'){
               continue;
           }
           else if (S.charAt(i) == 'b'){
               for (int j=i+1; j<S.length(); j++){
                   if (S.charAt(j) == 'a'){
                       return false;
                   }else {
                       break;
                   }
               }
           }
        }
        return true;
    }
}
