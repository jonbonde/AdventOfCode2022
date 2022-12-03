import java.io.IOException;
import java.io.RandomAccessFile;

public class Part1 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("input.txt", "r")) {
            String str;

            int max = 0;
            int sum = 0;

            while ((str = file.readLine()) != null) {
                if (str.isEmpty()) {
                    if (sum > max) {
                        max = sum;
                    }
                    sum = 0;
                } else {
                    sum += Integer.parseInt(str);
                }
            }
            System.out.println(max);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}