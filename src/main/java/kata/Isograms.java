package kata;

import java.util.Set;

public class Isograms {
    public static boolean  isIsogram(String str) {
        return str.length()==str.toLowerCase().chars().distinct().count();
    }
}
