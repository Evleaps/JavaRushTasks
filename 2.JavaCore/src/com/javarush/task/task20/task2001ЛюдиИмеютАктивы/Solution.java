package com.javarush.task.task20.task2001ЛюдиИмеютАктивы;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Читаем и пишем в файл: Human
Реализуй логику записи в файл и чтения из файла для класса Human.
Поле name в классе Human не может быть пустым.
Метод main реализован только для вас и не участвует в тестировании.


Требования:
1. Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если список assets пустой.
2. Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если поле name и список assets не пустые.
3. Класс Solution.Human не должен поддерживать интерфейс Serializable.
4. Класс Solution.Human должен быть публичным.
5. Класс Solution.Human не должен поддерживать интерфейс Externalizable.
*/
public class Solution {
    public static void main(String[] args) {
        try {
            //Создали временный файл, в него запишем данный и из него их влозьмем
            File your_file_name = File.createTempFile("1.txt", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            //несколькол человек имеют разные активы
            Human ivanov = new Human("Ivanov", new Asset("home"), new Asset("car"));
            //сохранили его активы в поток и очистили поток
            ivanov.save(outputStream);
            outputStream.flush();

            Human petrov = new Human("Petrov", new Asset("korobka"), new Asset("vodka"), new Asset("passport"));
            petrov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);

            System.out.println(somePerson.equals(ivanov));
            System.out.println(somePerson.name);
            for (Asset a : somePerson.assets) System.out.println(a.getName());

            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }


    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter writer = new PrintWriter(outputStream);
//проверяем, передали ли в параметр что-то, если да, записать в файл
            String isNamePresent = !name.isEmpty()? "yes" : "no";
            writer.println(isNamePresent);

            if (isNamePresent.equals("yes")) {
                writer.println(name);
                if (assets.size() > 0) {
                    for (Asset empty : assets) {
                        writer.println(empty.getName());
                    }
                }
                writer.close();
            }
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String hasName = reader.readLine();

            if ("yes".equals(hasName)) {
                name = reader.readLine();
                String assetName;
                while ((assetName = reader.readLine()) != null)
                    assets.add(new Asset(assetName));
            }
            reader.close();
        }
    }
}
