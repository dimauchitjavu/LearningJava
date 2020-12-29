package DayTwelve.TaskFour;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private int year;
    private String name;
    private List<String> members;

    public MusicBand(int year, String name, List<String> members) {
        this.year = year;
        this.name = name;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "year found - " + year +
                ", name - " + name + '\'';
    }
    public static void transferMembers(MusicBand bandA, MusicBand bandB){
        List<String> newList = new ArrayList<>(bandA.getMembers());
        newList.addAll(bandB.getMembers());
        bandA.setMembers(newList);
        bandB.setMembers(new ArrayList<>());
    }
    public void printMembers(){
        System.out.println(members);
    }
}
