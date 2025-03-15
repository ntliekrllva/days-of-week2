package ru.itgirl;

public class App {
    public static void main(String[] args) {
        System.out.println("Сегодня " + DayOfWeek.SATURDAY.getName());
    }

    public enum DayOfWeek {
        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота"),
        SUNDAY("Воскресенье");

        private String name;

        DayOfWeek(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
