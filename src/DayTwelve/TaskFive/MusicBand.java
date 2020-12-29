package DayTwelve.TaskFive;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private int year;
    private String name;
    private List<MusicArtist> members;

    public MusicBand(int year, String name, List<MusicArtist> members) {
        this.year = year;
        this.name = name;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "year found - " + year +
                ", name - " + name + '\'';
    }
    public static void transferMembers(MusicBand bandA, MusicBand bandB){
        List<MusicArtist> newList = new ArrayList<>(bandA.getMembers());
        newList.addAll(bandB.getMembers());
        bandA.setMembers(newList);
        bandB.setMembers(new ArrayList<>());
    }
    public void printMembers(){
        System.out.println("Состав группы " + this.name);
        for(MusicArtist i : members) {
            System.out.println(i.getName() + ", " + i.getAge() + "; ");
        }
    }
}
