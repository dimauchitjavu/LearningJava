package DayTwelve.TaskFive;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MusicArtist> membersA = new ArrayList<>();
        List<MusicArtist> membersB = new ArrayList<>();

        membersA.add(new MusicArtist("Толян", 32));
        membersA.add(new MusicArtist("Вася", 43));

        membersB.add(new MusicArtist("Коля", 38));
        membersB.add(new MusicArtist("Майкл Джексон", 61));

        MusicBand bandA  = new MusicBand(2001,"Космос-2001", membersA);
        MusicBand bandB  = new MusicBand(2004,"Космос-2003",membersB);
        MusicBand.transferMembers(bandA,bandB);
        bandA.printMembers();
        bandB.printMembers();
    }
}
