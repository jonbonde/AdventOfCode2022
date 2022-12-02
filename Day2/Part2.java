import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;

public class Part2 {
    public static void main(String[] args) {
        Map<String, Integer> regler = Map.of(
        "A X", 0 + 3,
        "A Y", 3 + 1,
        "A Z", 6 + 2,

        "B X", 0 + 1,
        "B Y", 3 + 2,
        "B Z", 6 + 3,

        "C X", 0 + 2,
        "C Y", 3 + 3,
        "C Z", 6 + 1);

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