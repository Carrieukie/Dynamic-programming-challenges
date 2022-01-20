import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CanConstructCombinations {
    public static void main(String[] args) {
        System.out.println(allConstruct("purple", new String[]{"pur", "ple", "le", "purp"}, new ArrayList<ArrayList<String>>()));
    }

    public static ArrayList<ArrayList<String>> allConstruct(String string, String[] array, ArrayList<ArrayList<String>> arrayLists) {
        if (string.length() == 0) return new ArrayList<>();
//        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        for (String st : array) {
            if (string.indexOf(st) == 0) {
                var suffix = string.substring(st.length());
                var suffixways = allConstruct(suffix,array,arrayLists);
                var numways = suffixways.stream().map(arr -> {
                    var arrClone = (ArrayList<String>) arr.clone();
                    arrClone.add(st);
                    return arrClone;
                }).collect(Collectors.toList());
                arrayLists.addAll(numways);
            }
        }

        return arrayLists;
    }
}
