package base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matheus on 30/10/2016.
 */

public class Agenda {

    //  private Day[] days;
   private List<Day> days;

    public Agenda(){}

    public Agenda(List<Day> days) {

        this.days = new ArrayList<>();
        this.days = days;
    }

    public List<Day> getDays() {
        return days;
    }

    public void setDays(List<Day> days) {
        this.days = days;
    }



}
