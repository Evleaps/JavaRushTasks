package Test.Криптография_3DES_алгоритм;

/* 
Шифровка
Придумать механизм шифровки/дешифровки.

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName

где:
fileName — имя файла, который необходимо зашифровать/расшифровать.
fileOutputName — имя файла, куда необходимо записать результат шифрования/дешифрования.
-e — ключ указывает, что необходимо зашифровать данные.
-d — ключ указывает, что необходимо расшифровать данные.


Требования:
1. Считывать с консоли ничего не нужно.
2. Создай поток для чтения из файла, который приходит вторым параметром ([fileName]).
3. Создай поток для записи в файл, который приходит третьим параметром ([fileOutputName]).
4. В режиме "-e" программа должна зашифровать [fileName] и записать в [fileOutputName].
5. В режиме "-d" программа должна расшифровать [fileName] и записать в [fileOutputName].
6. Созданные для файлов потоки должны быть закрыты.
*/

import javax.crypto.*;
import javax.crypto.spec.DESedeKeySpec;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class Solution {
    public static void main(String[] args) throws IOException {

        switch (args[0]) {
            case "-e":
                Encruption(args);
                break;
            case "-d":
                Uncruption(args);
                break;
        }
    }

    public static void Encruption(String[] args) throws IOException {
        //**считаем текст который хотим зашифровать
        BufferedReader reader = new BufferedReader(new FileReader(args[1]));
        String message = null;
        String str;
        while ((str = reader.readLine()) != null) {
            message = message + str;
        }

        try {
            String keyFile = "key.key"; // - создадим Файл keyfile, будет содержать ключ.
            String algoritm = "DESede"; // - укажем, какой именно алгорит хотим использовать

            KeyGenerator keyGenerator = KeyGenerator.getInstance(algoritm);
            SecretKey key = keyGenerator.generateKey();

            //Имея ключ, мы создаем объект Cipher для шифрования сообщения (ENCRYPT_MODE), расшифровка будет DECRYPT_MODE
            Cipher cipher = Cipher.getInstance(algoritm);
            cipher.init(Cipher.ENCRYPT_MODE, key);

            //Теперь можно создать шифрованный стрим и обернуть его во что хотим, в данном случае - в FileOutputStream:
            //Мы указываем, куда именно записать ответ!

            ObjectOutputStream outStream = new ObjectOutputStream(new CipherOutputStream(new FileOutputStream(args[2]), cipher));
            outStream.writeObject(message);//для того что бы записать строку, а не байт используем writeObject

            FileOutputStream outputStreamKey = new FileOutputStream(keyFile);
            SecretKeyFactory skf = SecretKeyFactory.getInstance(algoritm);
            DESedeKeySpec keySpec = (DESedeKeySpec) skf.getKeySpec(key, DESedeKeySpec.class);
            outputStreamKey.write(keySpec.getKey());
            outputStreamKey.close();
            outStream.close();


        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }
    }

    public static void Uncruption(String[] args) throws IOException {


        try {
            String algoritm = "DESede"; // - укажем, какой именно алгоритм хотим использовать

            FileInputStream fis = new FileInputStream(args[1]);
            byte[] keySpecBytes = new byte[fis.available()];
            fis.read(keySpecBytes);
            SecretKeyFactory skf = SecretKeyFactory.getInstance(algoritm);
            DESedeKeySpec keySpec = new DESedeKeySpec(keySpecBytes);
            SecretKey key = skf.generateSecret(keySpec);
            Cipher cipher = Cipher.getInstance(algoritm);
            cipher.init(Cipher.DECRYPT_MODE, key);
            ObjectInputStream ois = new ObjectInputStream(new CipherInputStream(new FileInputStream(args[2]), cipher));
            String secret = (String) ois.readObject();
            System.out.println(secret);
            fis.close();
            ois.close();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
//http://base.vingrad.ru/view/1940-Kriptografiya-v-JAVA





















