package com.javarush.task.task03циклыВводСклавы.lesson04_Massiv.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class New_object_in_StarkraftName
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "1";
        System.out.println(zerg1.name);

        Zerg zerg2 = new Zerg();
        zerg2.name = "2";
        System.out.println(zerg2.name);

        Zerg zerg3 = new Zerg();
        zerg3.name = "3";
        System.out.println(zerg3.name);

        Zerg zerg4 = new Zerg();
        zerg4.name = "4";
        System.out.println(zerg4.name);

        Zerg zerg5 = new Zerg();
        zerg5.name = "5";
        System.out.println(zerg5.name);

        Zerg zerg6 = new Zerg();
        zerg6.name = "6";
        System.out.println(zerg6.name);

        Zerg zerg7 = new Zerg();
        zerg7.name = "7";
        System.out.println(zerg7.name);

        Zerg zerg8 = new Zerg();
        zerg8.name = "8";
        System.out.println(zerg8.name);

        Zerg zerg9 = new Zerg();
        zerg9.name = "9";
        System.out.println(zerg9.name);

        Zerg zerg10 = new Zerg();
        zerg10.name = "10";
        System.out.println(zerg10.name);
//jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj
        Protos protos1 = new Protos();
        protos1.name = "Oleg1";
        System.out.println(protos1.name);

        Protos protos2 = new Protos();
        protos2.name = "Oleg2";
        System.out.println(protos2.name);

        Protos protos3 = new Protos();
        protos3.name = "Oleg3";
        System.out.println(protos3.name);

        Protos protos4 = new Protos();
        protos4.name = "Oleg4";
        System.out.println(protos4.name);

        Protos protos5 = new Protos();
        protos5.name = "Oleg5";
        System.out.println(protos5.name);


//jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj
        Terran terran1 = new Terran();
        terran1.name = "Kira1";
        System.out.println(terran1.name);

        Terran terran2 = new Terran();
        terran2.name = "Kira12";
        System.out.println(terran2.name);

        Terran terran3 = new Terran();
        terran3.name = "Kira13";
        System.out.println(terran3.name);

        Terran terran4 = new Terran();
        terran4.name = "Kira14";
        System.out.println(terran4.name);

        Terran terran5 = new Terran();
        terran5.name = "Kira15";
        System.out.println(terran5.name);

        Terran terran6 = new Terran();
        terran6.name = "Kira16";
        System.out.println(terran6.name);

        Terran terran7 = new Terran();
        terran7.name = "Kira17";
        System.out.println(terran7.name);

        Terran terran8 = new Terran();
        terran8.name = "Kira18";
        System.out.println(terran8.name);

        Terran terran9 = new Terran();
        terran9.name = "Kira19";
        System.out.println(terran9.name);

        Terran terran10 = new Terran();
        terran10.name = "Kira10";
        System.out.println(terran10.name);

        Terran terran11 = new Terran();
        terran11.name = "Kira111";
        System.out.println(terran11.name);

        Terran terran12 = new Terran();
        terran12.name = "Kira112";
        System.out.println(terran12.name);

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}