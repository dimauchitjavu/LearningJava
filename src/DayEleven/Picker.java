package DayEleven;

public class Picker implements Worker{
    private int salary;
    private WareHouse workWarehouse;

    public Picker(int salary, WareHouse workWarehouse) {
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
        this.salary += 80;
        this.workWarehouse.increaseCountOrder();
        if(this.workWarehouse.getCountOrder() == 1500){
            this.bonus();
        }
    }

    @Override
    public void bonus() {
        this.salary *= 3;
    }
}
