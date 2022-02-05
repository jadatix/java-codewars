package kata;
import java.util.ArrayList;

class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        return stops.stream().mapToInt(stop -> stop[0]-stop[1] ).sum();
    }
}