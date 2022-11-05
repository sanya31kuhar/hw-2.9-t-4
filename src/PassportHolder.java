import java.util.Set;
import java.util.HashSet;

public class PassportHolder {

    private final Set<Passport> passportHolder = new HashSet<>();

    public void addPassport(Passport p) {
        if (passportHolder.add(p)) {
            return;
        } else {
            for (Passport pass : passportHolder) {
                if (pass.getNumber().equals(p.getNumber())) {
                    pass.setBirthDate(p.getBirthDate().toString());
                    pass.setSurname(p.getSurname());
                    pass.setName(p.getName());
                    pass.setPatronymic(p.getPatronymic());
                }
            }
        }
    }

    public Passport getPassport(String number) {
        for (Passport passport : passportHolder) {
            if (passport.getNumber().equals(number)) {
                return passport;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Passport passport : passportHolder) {
            sb.append(passport.toString()).append('\n');
        }
        return sb.toString();
    }
}