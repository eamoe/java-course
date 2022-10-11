package com.gb.Lesson013.logger;

public class LoggerFactory {

    public static Logger create() {
        return new LoggerImpl();
    }
}
