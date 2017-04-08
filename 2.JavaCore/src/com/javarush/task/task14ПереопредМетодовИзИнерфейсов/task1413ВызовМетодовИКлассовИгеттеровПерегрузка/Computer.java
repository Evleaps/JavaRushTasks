package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1413ВызовМетодовИКлассовИгеттеровПерегрузка;

/**
 * Created by Ромчи on 22.03.2017.
 */
public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private  Monitor monitor;

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }
    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
