import java.util.*;

public class Main {
    private static final List<Integer> nums;

    static {
        nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 10, 11));
    }

    private static final List<String> words;

    static {
        words = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три", "четыре", "четыре", "четырнадцать"));
    }

    public static void main(String[] args) {

        task1();

        task2();

        task3();

        task4();
    }

    public static void task1() {

        System.out.println("Задание 1");

        for (int num : nums) {

            if (num % 2 == 1) {

                // or num% 2 != 0

                System.out.print(num + " ");

            }

        }
        System.out.println();

    }


    public static void task2() {

        System.out.println("Задание 2");

        Collections.sort(nums);

        int uniqNum = Integer.MIN_VALUE;


        for (Integer num : nums) {

            if (num % 2 == 0 & num != uniqNum) {

                uniqNum = num;

                System.out.print(num + " ");

            }

        }

        System.out.println();

    }

    public static void task3() {

        System.out.println("Задание 3");

        Set<String> uniqueWords = new HashSet<>(words);

        System.out.println(uniqueWords);

    }

    public static void task4() {

        System.out.println("Задание 4");
        Map<String, Integer> wordsMap = new HashMap<>();
        //    Set<String> uniqueWords = new HashSet<>(words);
        for (String word : words) {
            if (wordsMap.containsKey(word)) {
                int count = wordsMap.get(word) + 1;
                wordsMap.put(word, count);
            } else {
                wordsMap.put(word, 1);
            }
        }
        System.out.println(wordsMap);

    }
}