package com.developerspace.webrtcsample;

import java.util.*;

import org.junit.Test;

import org.junit.Assert.*;

class TestMode {

//    String val = getString();

    @Test
    public  String getString() {

        // String val = "";
        String inputString = "abbcccaaaaa";
        ArrayList<Character> arraylist = new ArrayList<Character>();

        // for(Map.Entry e : hashMap.entrySet()){
        //     val = val+e.getValue()+e.getKey();
        // }

        char[] inputChars = inputString.toCharArray();
        for (char i : inputChars){
            if(arraylist.size()>0){
                if( Character.compare(arraylist.get(arraylist.size()-2),i)==0){
                    arraylist.add((char)Integer.parseInt(String.valueOf(Integer.parseInt(String.valueOf(arraylist.add(i)))+1)));
                }
                else{
                    arraylist.add(i);
                    arraylist.add('1');
                }
            }
            else{
                arraylist.add(i);
                arraylist.add('1');
                //   hashMap.put(i,1);
            }
        }

        StringBuilder builder = new StringBuilder(arraylist.size());
        for(Character ch: arraylist)
        {
            builder.append(ch);
        }
        // return builder.toString();

        System.out.println(builder.toString());

         return builder.toString();
    }


}
