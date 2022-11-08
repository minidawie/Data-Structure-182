package ADT;

/*
Programmer: David Koh
 */

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCard CC = new CreditCard();

        CC.setAccountNumber("01234567");
        CC.setFirstName("David");
        CC.setLastName("Koh");
        CC.setRewardPoints(123);
        CC.setBalance(123.45);
        CC.setDueDate("09/15/2022");

        System.out.println(CC.getAccountNumber());
        System.out.println(CC.getFirstName());
        System.out.println(CC.getLastName());
        System.out.println(CC.getRewardPoints());
        System.out.println(CC.getBalance());
        System.out.println(CC.getDueDate());

        System.out.println(CC.toString());


    }
}
