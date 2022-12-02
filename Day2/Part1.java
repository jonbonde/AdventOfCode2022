import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;

public class Part1 {
    public static void main(String[] args) {
        Map<String, Integer> regler = Map.of(
        "A X", 3 + 1,
        "A Y", 6 + 2,
        "A Z", 0 + 3,

        "B X", 0 + 1,
        "B Y", 3 + 2,
        "B Z", 6 + 3,

        "C X", 6 + 1,
        "C Y", 0 + 2,
        "C Z", 3 + 3);

        try (RandomAccessFile file = new RandomAccessFile("C:/Users/jhdan/OneDrive/IT og informasjonssystemer/Java/AdventOfCode/Day2/input.txt", "r")) {
            String str;

            int sum = 0;

            while ((str = file.readLine()) != null) {
                sum += regler.get(str);
            }
            System.out.println(sum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}