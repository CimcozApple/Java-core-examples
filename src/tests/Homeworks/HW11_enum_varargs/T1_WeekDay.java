package tests.HW11_enum_varargs;
//stores weekdays in enum and print out every day of week in new line in view:
//M o N d A y
//T u E s D a Y

public enum T1_WeekDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    @Override
    public String toString() {

        String[] dayName = super.name().split(" ");
        StringBuilder week = new StringBuilder();
        for (int i = 0; i < dayName.length; i++) {
            String currentCase = dayName[i];
            for (int j = 0; j < currentCase.length(); j++) {
                if (j % 2 == 0) {
                    week.append(currentCase.substring(j, j + 1).toUpperCase() + " ");
                }
                if (j % 2 != 0) {
                    week.append(currentCase.substring(j, j + 1).toLowerCase() + " ");
                }
            }
        }
        return week.toString();
    }
}