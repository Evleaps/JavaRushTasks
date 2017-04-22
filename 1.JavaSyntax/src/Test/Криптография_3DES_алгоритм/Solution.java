package Test.Криптография_3DES_алгоритм;

/* 
Triple DES алгоритм

Программа запускается с одним из следующих наборов параметров:
-e fileNormalName fileOutputName
-d keySecretName fileSecretName

где:
fileNormalNam — имя файла, который необходимо зашифровать.
fileSecretName — имя файла, который необходимо расшифровать.
fileOutputName — имя файла, куда необходимо записать результат шифрования.
keySecretName — имя файла, который содержит ключ для дешифровки.

-e — аргумент указывает, что необходимо зашифровать данные.
-d — аргумент указывает, что необходимо расшифровать данные.
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

    /**
     * Шифровщик использует алгоритм Triple DES (ключи равны) , программа считывает 1 и 2 аргументы с консоли, являющиеся именами файлов(см ТЗ)
     * 1. создаем объект генерации ключа и генерируем сам ключ
     * 2. создать объект шифрования, аргументом укажем (действие) шифрование и сгенерированный ключ
     * 3. создадим OutStream, указать путь, куда записать зашифрованный текст, в нашем случае args[2]
     * 3.1 что-бы записались зашифрованные данные, обернуть в наш Cipher в "new CipherOutputStream"
     * 4. создать поток записи ключа в файл, без него мы не сможем расшифровать текст
     * 4.1 создать фабрику, аргументом передать алгоритм, ключ записать получив спецификацию getKeySpec
     * аргументами передав сгенерированный ключ и класс спецификации "DESedeKeySpec"
     * Наш ключ готов для записи
     * 5. закрыть потоки
     */

    public static void Encruption(String[] args) throws IOException {
        //считаем текст который хотим зашифровать
        BufferedReader reader = new BufferedReader(new FileReader(args[1]));
        String message = null;
        String str;
        while ((str = reader.readLine()) != null) {
            message = message + str;
        }

        try {
            String keyFile = "key.key"; // - создадим Файл keyfile, будет содержать ключ.
            String algoritm = "DESede"; // - укажем, какой именно алгоритм хотим использовать

            // 1.
            KeyGenerator keyGenerator = KeyGenerator.getInstance(algoritm);
            SecretKey key = keyGenerator.generateKey();//сгенерировали ключ и присвоили переменной SecretKey значение

            // 2. Имея ключ, мы создаем объект Cipher для шифрования сообщения (ENCRYPT_MODE), расшифровка будет DECRYPT_MODE
            Cipher cipher = Cipher.getInstance(algoritm);
            cipher.init(Cipher.ENCRYPT_MODE, key);

            //Теперь можно создать шифрованный стрим и обернуть его во что хотим, в данном случае - в FileOutputStream:
            //Мы указываем, куда именно записать ответ!

            // 3.текст из message будет сначала зашифрован оберткой, а потом записан по указанному пути
            ObjectOutputStream outStream = new ObjectOutputStream(new CipherOutputStream(new FileOutputStream(args[2]), cipher));
            outStream.writeObject(message);//для того что бы записать строку, а не байт используем writeObject

            // 4.
            FileOutputStream outputStreamKey = new FileOutputStream(keyFile);
            //4.1
            SecretKeyFactory skf = SecretKeyFactory.getInstance(algoritm);
            DESedeKeySpec keySpec = (DESedeKeySpec) skf.getKeySpec(key, DESedeKeySpec.class);
            outputStreamKey.write(keySpec.getKey());

            //5.
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
        /**Чтобы прочесть шифрованный файл, необходимо выполнить обратные операции: считать ключ
         * из файла, создать объект Cipher для дешифровки (DECRYPT_MODE) и прочитать объект:
         *
         * 1. создать поток чтения ключа дешифровки, прочесть его целиком
         * 2. создать фабрику шифровки, указать алгоритм, сгенерировать ключ дешифровки "generateSecret"  используя ключ
         * который мы создали при шифровании файла
         * 3. создать объект cipher, 1-м аргументом приказать расшифровать, вторым дать новый ключ дешифрования
         * 4. обенуть поток чтения в Cipher, чтение-->расшифровка-->преобразование в тект
         * 5. вывести на экран расшифрованное содержимое файла
         * 6. закрыть потоки*/
        try {
            String algoritm = "DESede"; // - укажем, какой именно алгоритм хотим использовать

            //1.тут только старый ключ
            FileInputStream keyReadStream = new FileInputStream(args[1]);
            byte[] keySpecBytes = new byte[keyReadStream.available()];
            keyReadStream.read(keySpecBytes);
            //2. тут новый ключ дешифровки, получили его благодаря старому ключу
            SecretKeyFactory skf = SecretKeyFactory.getInstance(algoritm);
            DESedeKeySpec keySpec = new DESedeKeySpec(keySpecBytes);
            SecretKey key = skf.generateSecret(keySpec);
            //3.тут сам объект шифровки, но теперь мы передаем в аргумент указание расшифровать и новый ключ дешифровки
            Cipher cipher = Cipher.getInstance(algoritm);
            cipher.init(Cipher.DECRYPT_MODE, key);
            //4.обернули InputStream, он прочитает откуда указано, потом расшифрует, и преобразует в String сохранит в переменную
            ObjectInputStream inStreamFile = new ObjectInputStream(new CipherInputStream(new FileInputStream(args[2]), cipher));
            String secret = (String) inStreamFile.readObject();
            //5.
            System.out.println(secret);
            //6.
            keyReadStream.close();
            inStreamFile.close();

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






















