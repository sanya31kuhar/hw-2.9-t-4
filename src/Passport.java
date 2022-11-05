import java.time.LocalDate;
import java.util.Objects;

public class Passport {

    private final String number;
    private String name;
    private String patronymic;
    private String surname;
    private LocalDate birthDate;

    public Passport(String number, String name, String patronymic, String surname, String birthDate) {
        if (number == null || number.isBlank() || !number.matches("\\d{4}\\s\\d{6}")) {
            throw new IllegalArgumentException();
        } else {
            this.number = number;
        }
        setName(name);
        setPatronymic(patronymic);
        setSurname(surname);
        setBirthDate(birthDate);
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException();
        } else {
            this.name = name;
        }

        public String getPatronymic() {
            return patronymic;
        }

        public void setPatronymic(String patronymic){
            if (patronymic == null || patronymic.isBlank()) {
            }
            this.patronymic = "Отчество отсутствует";
        } else{
            this.patronymic = patronymic;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.isBlank()) {
            throw new IllegalArgumentException();
        } else {
            this.surname = surname;
        }
    }


    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        if (birthDate == null || birthDate.isBlank()) {
            throw new IllegalArgumentException();
        } else {
            this.birthDate = LocalDate.parse(birthDate.replace('.', '-'));
        }
    }
}
