import java.util.*;

public class Main {
    public static void main(String[] args) {
//first
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 !=0){
                System.out.print(nums.get(i));
            }
        }
        System.out.println("");
//second
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> set = new LinkedHashSet<>(nums2);
        List<Integer> nums2WithoutDuplicates = new ArrayList<>(set);
        for (int i = 0; i < nums2WithoutDuplicates.size(); i++) {
            if (nums2WithoutDuplicates.get(i)%2 == 0){
                Collections.sort(nums2WithoutDuplicates);
                System.out.print(nums2WithoutDuplicates.get(i));
            }
        }
        System.out.println(" ");
//third
        List<String> words = new ArrayList<>(List.of("a", "b", "c", "M", "a", "c"));
        Set<String> sortWords = new HashSet<>(words);
        System.out.println(sortWords);
//fourth
        Map<String, String> words2 = new HashMap<>();
        Set<String> set1 = new HashSet<>();
        String message = "word Word word";

        var arr = message.split(" ");
        for (int i = 0; i < arr.length; i++) {
            set1.add(arr[i]);
        }
        System.out.println(set1);

    }
}