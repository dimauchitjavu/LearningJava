package DayEleven;

public class Courier implements Worker{
    private int salary;
    private WareHouse workWarehouse;

    public Courier(int salary, WareHouse workWarehouse) {
        this.salary = salary;
        this.workWarehouse = workWarehouse;
    }

    public int getSalary() {
        return salary;
    }

    public WareHouse getWorkWarehouse() {
        return workWarehouse;
    }

    @Override
    public void doWork() {
        this.salary += 100;
        this.workWarehouse.increaseBalance();
        if(this.workWarehouse.getBalance() == 1000000){
            this.bonus();
        }
    }

    @Override
    public void bonus() {
        this.salary *= 2;
    }
}
