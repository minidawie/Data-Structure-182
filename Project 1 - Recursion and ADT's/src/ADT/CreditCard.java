package ADT;

/*
Programmer: David Koh
 */

public class CreditCard {
    private String firstName, accountNumber, lastName, dueDate;
    private int rewardPoints;
    private double balance;

    public CreditCard() { // Default
        accountNumber = "00000000";
        firstName = "first name";
        lastName= "last name";
        rewardPoints = 0;
        balance = 0.0;
        dueDate = "mm/dd/yyyy";

    }
    public CreditCard(String newAccountNumber) {
        setAccountNumber(newAccountNumber);
        firstName = "first name";
        lastName = "last name";
        rewardPoints = 0;
        balance = 0.0;
        dueDate = "mm/dd/yyyy";
    }
    public CreditCard(String newAccountNumber, String newFirstName, String newLastName) {
        setAccountNumber(newAccountNumber);
        setFirstName(newFirstName);
        setLastName(newLastName);
        rewardPoints = 0;
        balance = 0.0;
        dueDate = "mm/dd/yyyy";
    }
    public CreditCard(String newAccountNumber, String newFirstName, String newLastName,
                      int newRewardPoints) {
        setAccountNumber(newAccountNumber);
        setFirstName(newFirstName);
        setLastName(newLastName);
        setRewardPoints(newRewardPoints);
        balance = 0.0;
        dueDate = "mm/dd/yyyy";
    }
    public CreditCard(String newAccountNumber, String newFirstName, String newLastName,
                      int newRewardPoints, double newBalance) {
        setAccountNumber(newAccountNumber);
        setFirstName(newFirstName);
        setLastName(newLastName);
        setRewardPoints(newRewardPoints);
        setBalance(newBalance);
        dueDate = "mm/dd/yyyy";
    }
    public CreditCard(String newAccountNumber, String newFirstName, String newLastName,
                   int newRewardPoints, double newBalance, String newDueDate) {
        setAccountNumber(newAccountNumber);
        setFirstName(newFirstName);
        setLastName(newLastName);
        setRewardPoints(newRewardPoints);
        setBalance(newBalance);
        setDueDate(newDueDate);
    }
    public void setAccountNumber(String newAccountNumber) {
        if(newAccountNumber.length() == 8) {
            accountNumber = newAccountNumber;
        }
    }
    public void setFirstName(String newFirstName) {
        if(newFirstName.length() > 0) {
            firstName = newFirstName;
        }
    }
    public void setLastName(String newLastName) {
        if(newLastName.length() > 0) {
            lastName = newLastName;
        }
    }
    public void setRewardPoints(int newRewardPoints) {
        if(newRewardPoints >= 0) {
            rewardPoints = newRewardPoints;
        }
    }
    public void setBalance(double newBalance) {
        if(newBalance >= 0) {
            balance = newBalance;
        }
    }
    public void setDueDate(String newDueDate) {
        if(newDueDate.length() >= 0) {
            dueDate = newDueDate;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getRewardPoints() {
        return rewardPoints;
    }
    public double getBalance() {
        return balance;
    }
    public String getDueDate() {
        return dueDate;
    }

    public String toString() {
        return "Account Number: " + accountNumber + "\nName: " + firstName + " " + lastName +
                "\nReward Points: " + rewardPoints + "\nBalance: " + balance + "\ndueDate: " + dueDate;
    }
}

