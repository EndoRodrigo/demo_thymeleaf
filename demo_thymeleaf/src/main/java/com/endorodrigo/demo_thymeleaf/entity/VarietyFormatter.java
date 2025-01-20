package com.endorodrigo.demo_thymeleaf.entity;

import com.endorodrigo.demo_thymeleaf.service.VarietyService;
import org.springframework.beans.factory.annotation.Autowired;

public class VarietyFormatter {
    @Autowired
    private VarietyService varietyService;


    public VarietyFormatter() {
        super();
    }

    public Variety parse(final String text, final Locale locale) throws ParseException {
        final Integer varietyId = Integer.valueOf(text);
        return this.varietyService.findById(varietyId);
    }


    public String print(final Variety object, final Locale locale) {
        return (object != null ? object.getId().toString() : "");
    }
}
