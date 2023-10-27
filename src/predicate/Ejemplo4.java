package predicate;

import java.util.function.Predicate;

public class Ejemplo4 {
    public static Predicate<User> isFemale() {
        return user -> user.getGender().equals("female");
    }
    public static void main(String[] args) {
        User user = new User("Juana", "female");

        boolean isFemale = isFemale().test(user);
        System.out.println(isFemale); // true
    }
}
