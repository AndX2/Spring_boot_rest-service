package ru.yandex.android.andrew.spring_guides;

/**
 * Created by Andrew on 07.02.2016.
 */
public class Utils {

    public static void stopAppMethod(int systemExitCode, int timeOut) {
        Thread backgroundThread = new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    sleep(timeOut);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.exit(systemExitCode);
            }
        };
        backgroundThread.start();
    }
}
