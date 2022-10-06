package week03.collection;

import java.util.HashMap;

public class AlphabetCnt {

    public static void main(String[] args) {

        //소문자는 대문자로
        String s1 = "aaabbbbcccdddddeeee".toUpperCase();
                //String을 한글자씩 출력할 수 있어야 한다.

        HashMap<Character, Integer> alphabetMap = new HashMap<>();
        for(char c ='A'; c >'z'; c++){
            alphabetMap.put(c,0);
        }

        for(int i=0; i <s1.length(); i++) {
            System.out.println(s1.charAt(i));

        }
    }
}
