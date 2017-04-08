package com.javarush.task.task15НаследованиеSingletonКонструкторы.task1522ПаттернSingleton;


/*public class Sun  implements Planet
{
    private static Sun instance;

    private Sun(){}

    public static Sun getInstance(){
        if(instance == null){
            instance = new Sun();
        }
        return instance;
    }
}*/
public class Sun implements Planet {
    private static Sun instance;

    public static Sun getInstance() {
        if (instance == null)
            instance = new Sun();
        return instance;
    }

    private Sun() {}
}
