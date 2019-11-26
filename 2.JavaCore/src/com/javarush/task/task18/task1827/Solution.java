package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            String productName = "";
            // получаем название товара
            for (int i = 1; i < args.length - 2; i++) {
                productName = productName + args[i] + " ";
            }
            productName = productName.substring(0, productName.length() - 1); // удаляем лишний пробел из названия
            String price = args[args.length - 2];
            String quantity = args[args.length - 1];
            productName = getSpaces(productName, 30);
            price = getSpaces(price, 8);
            quantity = getSpaces(quantity, 4);

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            reader.close();

            // проходим по строчно для нахождения максимального id
            String line;
            int maxId = 0;
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                line = line.substring(0,8);
                line = line.replaceAll("\\s+", "");
                int id = Integer.parseInt(line);
                if (id > maxId) maxId = id;
            }
            br.close();


            // увеличиваем id на единицу и добавляем пробелы при необходимости
            maxId++;
            String stringId = getSpaces(Integer.toString(maxId), 8);

            // получаем строку для вставки
            String newProduct = stringId + productName + price + quantity;

            FileWriter fw = new FileWriter(fileName, true);
            fw.write("\n" + newProduct);
            fw.close();
        }

    }

    // метод для добавления пробелов при недостаточной длине строки
    private static String getSpaces(String text, int maxLength) {
        String fullText = text;
        for (int i = text.length(); i < maxLength; i++) {
            fullText = fullText + " ";
        }
        return fullText;
    }
}
