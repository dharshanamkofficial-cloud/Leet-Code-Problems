import java.util.*;

class UndergroundSystem {

    Map<Integer, Object[]> in = new HashMap<>();
    Map<String, int[]> trips = new HashMap<>();

    public void checkIn(int id, String s, int t) {
        in.put(id, new Object[]{s, t});
    }

    public void checkOut(int id, String s, int t) {
        Object[] x = in.remove(id);
        String route = x[0] + "-" + s;

        trips.putIfAbsent(route, new int[2]);
        int[] a = trips.get(route);

        a[0] += t - (int)x[1];
        a[1]++;
    }

    public double getAverageTime(String start, String end) {
        int[] a = trips.get(start + "-" + end);
        return (double)a[0] / a[1];
    }
}
