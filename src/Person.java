import java.util.HashMap;

public abstract class Person {


    public int sumNumbers(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }

    public String findCapital(String country) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Bulgaria", "Sofia");  //Put elements in Map
        map.put("Belarus", "Minsk");
        map.put("Albania", "Tirana");
        map.put("Austria", "Vienna");
        String capital = map.get(country);
        return capital;
    }

    public abstract void drink();


}

