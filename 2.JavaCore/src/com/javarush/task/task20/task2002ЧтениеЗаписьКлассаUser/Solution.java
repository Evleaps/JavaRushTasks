package com.javarush.task.task20.task2002ЧтениеЗаписьКлассаUser;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* 
Читаем и пишем в файл: JavaRush
Реализуйте логику записи в файл и чтения из файла для класса JavaRush.
В файле your_file_name.tmp может быть несколько объектов JavaRush.
Метод main реализован только для вас и не участвует в тестировании.


Требования:
1. Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если список users пустой.
2. Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если список users не пустой.
3. Класс Solution.JavaRush не должен поддерживать интерфейс Serializable.
4. Класс Solution.JavaRush должен быть публичным.
5. Класс Solution.JavaRush не должен поддерживать интерфейс Externalizable.
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);

            JavaRush javaRush = new JavaRush();

            User user1 = new User();
            user1.setFirstName("Roma");
            user1.setLastName("Aymal");
            user1.setBirthDate(dateFormat.parse("19 05 1996"));
            user1.setMale(true);
            user1.setCountry(User.Country.RUSSIA);

            User user2 = new User();
            user2.setFirstName("NatashA");
            user2.setLastName("Pelum");
            user2.setBirthDate(dateFormat.parse("20 06 1997"));
            user2.setMale(false);
            user2.setCountry(User.Country.UKRAINE);
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут

            javaRush.users.add(user1);
            javaRush.users.add(user2);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны
            System.out.println(javaRush.equals(loadedObject));

            for (int i = 0; i < javaRush.users.size(); i++) {
                System.out.println(javaRush.users.get(i).getFirstName());
                System.out.println(javaRush.users.get(i).getLastName());
                System.out.println(javaRush.users.get(i).getBirthDate());
                System.out.println(javaRush.users.get(i).isMale());
                System.out.println(javaRush.users.get(i).getCountry());
                System.out.println();
                System.out.println(loadedObject.users.get(i).getFirstName());
                System.out.println(loadedObject.users.get(i).getLastName());
                System.out.println(loadedObject.users.get(i).getBirthDate());
                System.out.println(loadedObject.users.get(i).isMale());
                System.out.println(loadedObject.users.get(i).getCountry());
            }

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);
            String isEmpty = users.isEmpty() ? "yes" : "no";
            writer.println(isEmpty);

            if (isEmpty.equals("no")) {
                for (User entry : users) {
                    writer.println(entry.getFirstName());
                    writer.println(entry.getLastName());
                    writer.println(entry.getBirthDate());
                    writer.println(entry.isMale());
                    writer.println(entry.getCountry());
                }
            }
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String hasName = reader.readLine();

            if ("no".equals(hasName)) {
                while (reader.ready()) {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd hh:mm:ss zzz yyyy", Locale.ENGLISH);

                    User user = new User();
                    user.setFirstName(reader.readLine());
                    user.setLastName(reader.readLine());
                    user.setBirthDate(dateFormat.parse(reader.readLine()));
                    user.setMale(Boolean.parseBoolean(reader.readLine()));
                    String country = reader.readLine();
                    if (country.contains("RUSSIA"))
                        user.setCountry(User.Country.RUSSIA);
                    else if (country.contains("UKRAINE"))
                        user.setCountry(User.Country.UKRAINE);
                    else user.setCountry(User.Country.OTHER);

                    users.add(user);
                }
            }
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;
        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
