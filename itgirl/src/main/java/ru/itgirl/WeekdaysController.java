package ru.itgirl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class WeekdaysController {

    @GetMapping("/dayWeek")
    public String dayOf(@RequestParam(value = "day") String dayString) {
        HashMap<String, String> DaysList = new HashMap<String, String>();
        DaysList.put("MONDAY", "Понедельник");
        DaysList.put("TUESDAY", "Вторник");
        DaysList.put("WEDNESDAY", "Среда");
        DaysList.put("THURSDAY", "Четверг");
        DaysList.put("FRIDAY", "Пятница");
        DaysList.put("SATURDAY", "Суббота");
        DaysList.put("SUNDAY", "Воскресенье");

        for (HashMap.Entry<String, String> day: DaysList.entrySet()) {
            if (day.getKey().equals(dayString)){
                return String.format("Сегодня %s!", day.getValue());
            }
        }
        return "";
    }
    }
