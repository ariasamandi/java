import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
class Hashmatique{
    public HashMap tracklist(){
        HashMap<String, String> tracklist = new HashMap<String, String>();
        tracklist.put("track1", "plug walk");
        tracklist.put("track2", "lovely");
        tracklist.put("track3", "wish");
        tracklist.put("track4", "hell song");
        tracklist.get("track1");
        Set<String> keys = tracklist.keySet();
        for(String key: keys){
            System.out.println(key);
            System.out.println(tracklist.get(key));
        }
        return tracklist;
    }
}