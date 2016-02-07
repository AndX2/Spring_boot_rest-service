package ru.yandex.android.andrew.spring_guides.hello;

/**
 * Created by Andrew on 07.02.2016.
 */
public class Greeting {

    private int id;
    private String content;

    public Greeting(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
