package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
//Для каждого значения из ImageTypes возвращать соответствующий Reader,
// например, для ImageTypes.JPG — JpgReader;
    public static ImageReader getImageReader(ImageTypes types) {
            if (types == ImageTypes.BMP ) {
                return new BmpReader();
            }
            if (types == ImageTypes.PNG ) {
                return new PngReader();
            }
            if (types == ImageTypes.JPG ) {
                return new JpgReader();
            }
            else throw new  IllegalArgumentException("Неизвестный тип картинки");
    }
}
