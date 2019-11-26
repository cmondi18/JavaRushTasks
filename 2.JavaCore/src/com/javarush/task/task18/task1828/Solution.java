package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        if ((args != null) && (args.length > 0)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            reader.close();

            FileReader fileReader = new FileReader(fileName);
            BufferedReader bfr = new BufferedReader(fileReader);
            String s;

            LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
            while ((s = bfr.readLine()) != null) {
                String sArg0 = s.substring(0, 8);
                int indx = sArg0.indexOf(' ');
                if (indx != -1) {
                    sArg0 = sArg0.substring(0, indx);
                }
                int i = Integer.parseInt(sArg0);
                map.put(i, s);
            }
            bfr.close();

            if (args[0].equals("-d")) {
                map.remove(Integer.parseInt(args[1]));
            }
            else if (args[0].equals("-u")) {
                if (map.containsKey(Integer.parseInt(args[1]))) {
                    String productName = "";
                    for (int i = 2; i < args.length - 2; i++) {
                        productName = productName + args[i] + " ";
                    }
                    String newS = String.format("%-8.8s%-30.30s%-8.8s%-4.4s", args[1], productName, args[args.length - 2], args[args.length - 1]);

                    map.put(Integer.parseInt(args[1]), newS);
                }
            }

            FileWriter fw = new FileWriter(fileName);
            for (Map.Entry<Integer, String> pair : map.entrySet() ) {
                char buffer[] = new char[pair.getValue().length()];
                pair.getValue().getChars(0, pair.getValue().length(), buffer, 0);
                fw.write(buffer);
                fw.write('\n');
            }
            fw.close();
        }
    }
}
