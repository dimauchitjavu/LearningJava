package DayTwelve.TaskFour;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DayTwelve.TaskFour.MusicBand bandA  = new DayTwelve.TaskFour.MusicBand(2001,"Космос-2001",
                Arrays.asList("Толян", "Коля"));
        DayTwelve.TaskFour.MusicBand bandB  = new DayTwelve.TaskFour.MusicBand(2004,"Космос-2003",
                Arrays.asList("Вася", "Майкл Джексон"));
        MusicBand.transferMembers(bandA,bandB);
        bandA.printMembers();
        bandB.printMembers();
    }
}
