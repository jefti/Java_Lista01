package com.holidayzer.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/holidays")

public class HolidayController {
    List<Holiday> holidays = new ArrayList<>();
    public void registerHolidays(){
        holidays.add(new Holiday("Confraternização Mundial","01-01-2024"));
        holidays.add(new Holiday("Carnaval", "12-02-2024"));
        holidays.add(new Holiday("Carnaval", "13-02-2024"));
        holidays.add(new Holiday("Sexta-feira Santa", "29-03-2024"));
        holidays.add(new Holiday("Tiradentes", "21-04-2024"));
        holidays.add(new Holiday("Dia do Trabalho", "01-05-2024"));
        holidays.add(new Holiday("Corpus Christi", "30-05-2024"));
        holidays.add(new Holiday("Independência do Brasil", "07-09-2024"));
        holidays.add(new Holiday("Nossa Senhora Aparecida", "12-10-2024"));
        holidays.add(new Holiday("Finados", "02-11-2024"));
        holidays.add(new Holiday("Proclamação da República", "15-11-2024"));
        holidays.add(new Holiday("Dia Nacional de Zumbi e da Consciência Negra", "20-11-2024"));
        holidays.add(new Holiday("Natal", "25-12-2024"));
    }
    
    HolidayController(){
        registerHolidays();
    }

    @GetMapping
    public List<Holiday> getHoliday() {
        return holidays;
    }

    @GetMapping("/{data}")
    public String isHoliday(@PathVariable String data){
        for(Holiday h: holidays){
            if(h.getData().equals(data)){
                return("A data " + data + " é feriado.");
            }
        }
        return "A data "+ data+" não é feriado.";
    }
}
