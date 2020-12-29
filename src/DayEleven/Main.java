package DayEleven;

public class Main {
    public static void main(String[] args) {
        WareHouse MyWareHouse = new WareHouse(0,0);
        Picker MyPicker = new Picker(0,MyWareHouse);
        Courier MyCourier = new Courier(0,MyWareHouse);
        for (int i = 0; i < 1500; i++) {
            MyPicker.doWork();
        }
        for (int i = 0; i < 1000; i++) {
            MyCourier.doWork();
        }
        System.out.println(MyCourier.getSalary());
        System.out.println(MyPicker.getSalary());
        System.out.println(MyWareHouse);

        WareHouse HisWarehouse = new WareHouse(0,0);
        Picker HisPicker = new Picker(0,HisWarehouse);
        Courier HisCourier = new Courier(0,HisWarehouse);

        HisPicker.doWork();
        HisCourier.doWork();

        System.out.println(MyCourier.getSalary());
        System.out.println(MyPicker.getSalary());
        System.out.println(MyWareHouse);

    }
}
