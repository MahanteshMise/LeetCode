import java.util.*;
class Pair{
    private String key;
    private Integer value;

    public Pair(String key,int value){
        this.key = key;
        this.value = value;
    }
    public String getKey(){
        return key;
    }
    public Integer getValue(){
        return value;
    }
}
class TimeMap {
    private Map<String,List<Pair>> map;
    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(new Pair(value,timestamp));
    }

    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }
        List<Pair> list = map.get(key);
        int left = 0, right = list.size()-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            Pair pair = list.get(mid);
            if(pair.getValue()<=timestamp){
                if(mid == list.size()-1 || list.get(mid+1).getValue()>timestamp){
                    return pair.getKey();
                }
                else{
                    left = mid+1;
                }
            }else{
                right = mid-1;
            }
        }
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
