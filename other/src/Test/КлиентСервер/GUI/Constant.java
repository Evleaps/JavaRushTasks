package Test.КлиентСервер.GUI;
/**
 1.userLimit указывает макс.колличество подключений к Server и CheckForOnline, так-же указывает размер HashSet в Server
 2.PORT_MESSAGE - Порт для сервера;
 3.PORT_ONLINE - Порт для CheckForOnline(Проверяет, в сети ли пользователь)
 4.IP, LOGIN задаются при включении программы
 */
public abstract class Constant {
    public static final int           userLimit = 20;
    public static final int           PORT_MESSAGE = 7000;
    public static final int           PORT_ONLINE = 7001;
    public static String              IP;
    public static String              LOGIN;

}