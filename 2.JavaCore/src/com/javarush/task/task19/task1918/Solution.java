package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;


// *TODO NE MOE RESHENIE :(
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(br.readLine()));
        br.close();

        StringBuffer str = new StringBuffer();
        while (file.ready()) {
            str.append(file.readLine());
        }
        file.close();

        String line = str.toString().replaceAll("\r\n", "");
        String tag = args[0];

        findTags(tag, line, 0);
    }

    public static void findTags(String tag, String x, int q) {
        int howManyTag = 0, lastTagsIndex = 0;
        int i = q;
        while (i < (x.length() - tag.length() - 1)) {
            if (x.substring(i, i + tag.length() + 1).equals("<" + tag)) {
                if (howManyTag == 0) lastTagsIndex = i;
                howManyTag++;
            } else if (x.substring(i, i + tag.length() + 2).equals("</" + tag)) {
                howManyTag--;
                if (howManyTag == 0) {
                    String newString = x.substring(lastTagsIndex, i + tag.length() + 3);
                    System.out.println(newString);
                    findTags(tag, newString, 1);
                }
            }
            i++;
        }
    }
}
