package Video7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HW2 {
    public static void main(String[] args) {

        HashMap<String, String> personMap = new HashMap<String, String>();
        personMap.put("Ivanov", "Ivan");
        personMap.put("Petrenko", "Petro");
        personMap.put("Martuniuk", "Marta");
        personMap.put("Kushma", "Leonid");
        personMap.put("Vasulkiv", "Vasil");
        personMap.put("Dmutriv", "Dmutro");
        personMap.put("Hachik", "Rustam");
        personMap.put("Gudimov", "Orest");
        personMap.put("Kononov", "Ivan");
        personMap.put("Noname", "Pavlo");
        System.out.println(personMap);
        System.out.println(IsTwoPerson(personMap));

        System.out.println(DelPerson(personMap, "Pavlo"));


    }

    public static boolean IsTwoPerson(HashMap<String, String> name) {
        Set<String> temporary = new HashSet<String>();
        temporary.addAll(name.values());
        return name.size() == temporary.size() ?false : true ;
    }

    public static boolean DelPerson(HashMap<String, String> name, String delName) {

        name.values().remove(delName);
        System.out.println(name);
        return true;
}

}


