package kata1;

import java.util.Date;

public class Person {
    public final String name;
    public final Date birthday;
    private final static long MS_PER_SECOND = 1000;
    private final static long SECONDS_PER_MINUTE = 60;
    private final static long MINUTES_PER_HOUR = 60;
    private final static long HOURS_PER_DAY = 24;
    private final static double DAYS_PER_YEAR = 365.25;
    private final static long MS_PER_YEAR = (long) (MS_PER_SECOND * SECONDS_PER_MINUTE * MINUTES_PER_HOUR * HOURS_PER_DAY * DAYS_PER_YEAR);

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        long ms = new Date().getTime() - birthday.getTime();
        return (int) (ms / MS_PER_YEAR);
    }
        
        
}
