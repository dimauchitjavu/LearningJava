package DayEight;

class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private double fuel;

    public double getLength() {
        return length;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }
    public void info()
    {
        System.out.println("Изготовитель: " + this.producer +
                " , год выпуска: " + this.year + "  , длина: " + this.length +
                " , вес: "+ this.weight + " , количество топлива в баке: " + this.fuel);
    }
    public void fillUp(double fuel)
    {
        this.fuel += fuel;
    }
    public static void comparePlanes(Airplane FirstPlane, Airplane SecondPlane){
        if(FirstPlane.getLength() > SecondPlane.getLength()){
            System.out.println("Первый больше");
        }else {
            System.out.println("Второй длиннее. Вероятно");
        }
    }

    @Override
    public String toString() {
        return "Изготовитель: " + this.producer +
                " , год выпуска: " + this.year + "  , длина: " + this.length +
                " , вес: "+ this.weight + " , количество топлива в баке: " + this.fuel;
    }
}

