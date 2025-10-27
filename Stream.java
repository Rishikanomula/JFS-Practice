import java.util.*;

class Stream {
    // Check if a number is prime
    public static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    // Check if a number is a 3-digit number
    public static boolean isThreeDigit(int x) {
        return x >= 100 && x <= 999;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> words = Arrays.asList("james","sujana","kylie","jake", "suhas", "suman","rishi", "sumith", "susan", "lanka", "sumukhi", "kalyani","sullyeon","subin","taehyun");
        System.out.println("Names that start with 'SU':");
        words.stream()
             .filter(x -> x.toLowerCase().startsWith("su"))
             .forEach(System.out::println);

        System.out.println("\nEnter number of elements:");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int sum = list.stream().mapToInt(Integer::intValue).sum();
        double average = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        int max = list.stream().mapToInt(Integer::intValue).max().orElse(Integer.MIN_VALUE);
        long evenCount = list.stream().filter(x -> x % 2 == 0).count();

        List<Integer> primes = list.stream().filter(Stream::isPrime).toList();
        List<Integer> threeDigits = list.stream().filter(Stream::isThreeDigit).toList();

        System.out.println("\nOriginal numbers: " + list);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
        System.out.println("Even count: " + evenCount);
        System.out.println("Prime numbers: " + primes);
        System.out.println("Three-digit numbers: " + threeDigits);
    }
}