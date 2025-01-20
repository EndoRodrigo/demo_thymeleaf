package com.endorodrigo.demo_thymeleaf.controller;

import com.endorodrigo.demo_thymeleaf.model.SeedStarter;
import com.endorodrigo.demo_thymeleaf.model.Variety;
import com.endorodrigo.demo_thymeleaf.service.SeedStarterService;
import com.endorodrigo.demo_thymeleaf.service.VarietyService;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.metamodel.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;


@Controller
public class SeedStarterMngController {
    @Autowired
    private VarietyService varietyService;

    @Autowired
    private SeedStarterService seedStarterService;

    @ModelAttribute("allTypes")
    public List<Type> populateTypes() {
        return Arrays.asList(Type.ALL);
    }

    @ModelAttribute("allFeatures")
    public List<JsonFormat.Feature> populateFeatures() {
        return Arrays.asList(Feature.ALL);
    }

    @ModelAttribute("allVarieties")
    public List<Variety> populateVarieties() {
        return this.varietyService.findAll();
    }

    @ModelAttribute("allSeedStarters")
    public List<SeedStarter> populateSeedStarters() {
        return this.seedStarterService.findAll();
    }

    @RequestMapping({"/","/seedstartermng"})
    public String showSeedstarters(final SeedStarter seedStarter) {
        seedStarter.setDatePlanted(Calendar.getInstance().getTime());
        return "seedstartermng";
    }

    @RequestMapping(value="/seedstartermng", params={"save"})
    public String saveSeedstarter(
            final SeedStarter seedStarter, final BindingResult bindingResult, final ModelMap model) {
        if (bindingResult.hasErrors()) {
            return "seedstartermng";
        }
        this.seedStarterService.add(seedStarter);
        model.clear();
        return "redirect:/seedstartermng";
    }
}
