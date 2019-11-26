package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes) {
        if (imageTypes == null) throw new IllegalArgumentException("Неизвестный тип картинки");
        try {
            switch (imageTypes) {
                case BMP:
                    return new BmpReader();
                case JPG:
                    return new JpgReader();
                case PNG:
                    return new PngReader();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Неизвестный тип картинки");
        }
        return null;
    }
}

