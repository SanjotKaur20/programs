import java.util.HashMap;

public class HshMap {
    public static void main(String[] args) {
        HashMap<String,String> capitalCities=new HashMap<>();
        capitalCities.put("Punjab","Chandigarh");
        capitalCities.put("Rajasthan","Jaipur");
        capitalCities.put("Maharashtra","Mumbai");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("Punjab"));
        capitalCities.remove("Rajasthan");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("Rajasthan"));
        System.out.println(capitalCities.size());
        capitalCities.clear();
        System.out.println(capitalCities);
    }
}
