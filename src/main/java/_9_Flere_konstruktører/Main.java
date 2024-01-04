package _9_Flere_konstruktører;

public class Main {
    public static void main(String[] args) {

        DataValidator dv = new DataValidator();

        User user1 = new User("Børge", "bwfe87Df43");
        User user2 = new User("Anna", "frwfrDFH!45", "annalarsen@gmail.com");
        User user3 = new User("Peter", "r2nfw¤#FerfJ", "peterchristensen@gmail.com", 50387436);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        System.out.println("Is uppercase: " + dv.isUppercase(user3.getName()));
        System.out.println("Is min/max length: " + dv.isMinMaxLength(user3.getPassword()));
        System.out.println("Has @ sign: " + dv.hasAtSign(user3.getEmail()));
        System.out.println("Is phone number: " + dv.isPhoneNumber(user3.getPhoneNumber()));

    }
}
