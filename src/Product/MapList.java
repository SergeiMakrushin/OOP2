package Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MapList {
    private static Map<String, List<Integer>> song = new HashMap<>();

    private static Map<String, Integer> newSong = new HashMap<>();

    public static void putNewSong() {
        for (Map.Entry<String, List<Integer>> entry : song.entrySet()) {
            String key = entry.getKey();
            List<Integer> value = entry.getValue();
            Integer sum = 0;
            for (Integer integer : value
            ) {
                sum += integer;
            }
            newSong.put(key, sum);
        }
        System.out.println("newSong = " + newSong);
    }


    public static Map<String, Integer> getNewSong() {
        return newSong;
    }

    public static Map<String, List<Integer>> getSong() {
        return song;
    }

    public static void putMap(String a, List<Integer> b) {
        song.put(a, b);
    }


    public static void oddList(List<Integer> b) {
        Random random = new Random();
        while (b.size() < 3) {
            b.add(random.nextInt(1000) + 1);
        }
    }

}
