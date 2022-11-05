public class Main {

    public static void main(String[] args) {

        Passport passport = new Passport("5361 768943", "Чудин", "Михаил",
                "Сергеевич", "1975.10.31");

        Passport passport1 = new Passport("5362 768943", "Панин", "Андрей",
                "", "1980.07.21");

        Passport passport2 = new Passport("4751 235478", "Сереброва", "Светлана",
                "Петровна", "1995.11.30");

        Passport passport3 = new Passport("4751 235478", "Качурова", "Светлана",
                "Петровна", "1995.11.30");

        PassportHolder passportHolder = new PassportHolder();
        passportHolder.addPassport(passport);
        passportHolder.addPassport(passport1);
        passportHolder.addPassport(passport2);
        passportHolder.addPassport(passport3);
        System.out.print(passportHolder);
        System.out.println(passportHolder.getPassport("5361 768943"));
        System.out.println(passportHolder.getPassport("5361 "));
    }
}
