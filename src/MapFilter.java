import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapFilter {

    /**
     * Takes a provided TreeMap, removes entries where the
     * (i) key is a multiple of keyFilter
     * AND
     * (ii) the value contains the valueFilter character,
     * then returns the resulting TreeMap.
     * If applying the key and value filters does not remove any entries, then
     * the provided map must be returned.
     * @param keyFilter filter to be applied to the map entry keys. Must not be 0.
     * @param valueFilter filter to be applied to the map entry values
     * @return resulting map when filters are applied to provided map
     */
    public static TreeMap<Integer, String> filterTreeMap(
            TreeMap<Integer, String> map, int keyFilter, char valueFilter) {
        ArrayList<Integer> keyList = new ArrayList<>(map.keySet());
        for (int key: keyList) {
            if (key % keyFilter == 0
                    && map.get(key).indexOf(valueFilter) != -1) {
                map.remove(key);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "this");
        map.put(2, "might");
        map.put(3, "be");
        map.put(4, "interesting");
        map.put(5, "text");
        System.out.println(filterTreeMap(map,2, 's'));
    }
}