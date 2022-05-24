//Print the number of each character occurenes in a given string
import java.util.Map;
import java.util.HashMap;
class OccurenceOfCharInName {
    static void characterCount(String name)
    {
        HashMap<Character, Integer> charCountMap
            = new HashMap<Character, Integer>();
        char[] nameArray = name.toCharArray();
        for (char singleChar : nameArray) {
            if (charCountMap.containsKey(singleChar)) {
                charCountMap.put(singleChar, charCountMap.get(singleChar) + 1);
            }
            else {
                charCountMap.put(singleChar, 1);
            }
        }
        for (Map.Entry eachEntryInMap : charCountMap.entrySet()) {
            System.out.println(eachEntryInMap.getKey() + ": " + eachEntryInMap.getValue());
        }
    }
    public static void main(String[] args)
    {
        String name = "Sreekanth";
        characterCount(name);
    }
}
