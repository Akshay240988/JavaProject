package task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Work","is","Worship");
        int max = 0; String str1 = "";

        for(String str: list){

            if(str.length()>max){
                max=str.length();
                str1=str;
            }
        }

        System.out.println(str1);

//        String max = null; String s=null;
//        String s1 = "Work";
//        String s2 = "is";
//        String s3 = "Worship";
//
//        for(int i=0;i<=list.size();i++){
//            s=s1.length()>s2.length()?s1:s2;
//            max=s.length()>s3.length()?s:s3;
//        }
//
//        System.out.println(max);




    }
}

