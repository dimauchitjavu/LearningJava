package DayEleven;

public class WareHouse {
    private int countOrder;
    private double balance;

    public WareHouse(int countOrder, double balance) {
        this.countOrder = countOrder;
        this.balance = balance;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public void increaseCountOrder() {
        this.countOrder++;
    }

    public double getBalance() {
        return balance;
    }

    public void increaseBalance() {
        this.balance += 1000;
    }

    @Override
    public String toString() {
        return "WareHouse info " +
                "количество заказов = " + countOrder +
                ", баланс = " + balance;
    }
}
