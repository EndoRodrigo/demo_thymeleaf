package com.endorodrigo.demo_thymeleaf.conf;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class VarietyFormatter implements Formatter<?> {
    @Override
    public ? parse(String text, Locale locale) throws ParseException {
        return null;
    }

    @Override
    public String print(Object object, Locale locale) {
        return "";
    }
}
