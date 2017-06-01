package Test;

import java.io.IOException;
import java.util.*;
/*Ввод
6
DEVELOPER.@gmail.com
t+es+ter@GMAIL.COM
T@bmail.com
a@gmail.com.ru
D.eveloper@Gmail.Com
a+b@gmail.com.ru

Ожидаемый ответ
5
2 DEVELOPER.@gmail.com D.eveloper@Gmail.Com
1 t+es+ter@GMAIL.COM
1 T@bmail.com
1 a@gmail.com.ru
1 a+b@gmail.com.ru*/

/*логин и майл, точки не учитываем, регистр тоже, если гугл, то все, что после знака + не учитывается. */

public class ПочтовыеАдреса {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        int sumNumber;
        String email;

        while (true) {
            sumNumber = Integer.parseInt(scanner.nextLine());
            if (sumNumber < 1 || sumNumber > 20000)
                System.out.println("Ошибка. Введите число от 1 до 20 000 включительно.");
            else break;
        }

        for (int i = 0; i < sumNumber; i++) {
            email = scanner.nextLine();
            list.add(email);
        }
        sortList(list);
    }


    public static void sortList(ArrayList<String> list) {
        Map<String, String> map = new HashMap<>();
        ArrayList<String> sortedMail = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String email = list.get(i).toLowerCase();
            String[] s = email.split("@");
            if (s[1].equals("gmail.com")) {
                s[0] = s[0].replace(".", "");
                s[0] = s[0].split("\\+")[0];

                String resultEmail = s[0] + "@" + s[1];

                if (map.containsKey(resultEmail)) {
                    map.put(resultEmail, map.get(resultEmail) + " " + list.get(i));
                } else {
                    map.put(resultEmail, list.get(i));
                }

            } else {
                if (map.containsKey(email)) {
                    map.put(email, map.get(email) + " " + list.get(i));
                } else map.put(email, list.get(i));
            }
        }


        for (Map.Entry<String, String> entry : map.entrySet()) {
            String[] s = entry.getValue().split(" ");
            sortedMail.add(s.length + " " + entry.getValue());
        }

        Collections.sort(sortedMail, Collections.reverseOrder());
        System.out.println(sortedMail.size());
        for (String s : sortedMail) {
            System.out.println(s);
        }
    }
}
