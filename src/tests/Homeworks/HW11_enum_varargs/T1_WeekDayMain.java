package tests.HW11_enum_varargs;

public class T1_WeekDayMain {

    public static void main(String[] args) {

        for (T1_WeekDay weekDay : T1_WeekDay.values()) {
            System.out.println(weekDay.toString());
        }
    }
}
