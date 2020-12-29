package DayTwelve;

public class MusicBand {
    private int year;
    private String name;

    public int getYear() {
        return year;
    }

    public MusicBand(int year, String name) {
        this.year = year;
        this.name = name;
    }

    @Override
    public String toString() {
        return "year found - " + year +
                ", name - " + name + '\'';
    }
}
