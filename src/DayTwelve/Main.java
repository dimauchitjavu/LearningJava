package DayTwelve;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Task 1*/
        List<String> autoMarks = new ArrayList<>();
        autoMarks.add("BMW");
        autoMarks.add("Жигули");
        autoMarks.add("Газель");
        autoMarks.add("Москвич");
        for (String i: autoMarks) {
            System.out.println(i);
        }
        System.out.println();
        autoMarks.add(2,"Шоломобиль");
        autoMarks.remove(0);
        for (String i: autoMarks) {
            System.out.println(i);
        }
        /*--Task 2--*/
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i <= 350; i+=2) {
            if(i == 32){
                i = 300;
            }
            evenNumbers.add(i);

        }
        for (Integer i: evenNumbers) {
            System.out.println(i);
        }
        /*--task3--*/
        List<MusicBand> bandList= new ArrayList<>();
        bandList.add(new MusicBand(2001,"Космос-2001"));
        bandList.add(new MusicBand(1990,"Чуваки из девяностых"));
        bandList.add(new MusicBand(2016, "Momoland"));
        bandList.add(new MusicBand(1994, "Foo Fighters"));
        bandList.add(new MusicBand(2007,"きのこ帝国"));
        bandList.add(new MusicBand(1967, "Филипп Киркоров"));
        bandList.add(new MusicBand(1821, "вымышленная группа"));
        bandList.add(new MusicBand(2020, "вымышленная группа1"));
        bandList.add(new MusicBand(2012, "вымышленная группа2"));
        System.out.println(bandList);
        System.out.println(groupsAfter2000(bandList));
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){

        List<MusicBand> bandList= new ArrayList<>();
        for (MusicBand band : bands) {
            if(band.getYear() > 2000){
                bandList.add(band);
            }
        }
        return bandList;
    }

}
