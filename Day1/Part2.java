import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Part2 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("input.txt", "r")) {
            String str;

            ArrayList<Integer> listMax = new ArrayList<Integer>();
            int max = 0;
            int sum = 0;

            while ((str = file.readLine()) != null) {
                listMax.add(sum);
                if (str.isEmpty()) {
                    if (sum > max) {
                        max = sum;
                    }
                    sum = 0;
                } else {
                    sum += Integer.parseInt(str);
                }
            }
            Integer[] arrMax = new Integer[listMax.size()];
            arrMax = listMax.toArray(arrMax);

            int first = 0;
            int second = 0;
            int third = 0;
            for (int i = 0; i < arrMax.length; i++) {
                if (arrMax[i] > first) {
                    third = second;
                    second = first;
                    first = arrMax[i];
                }
                else if (arrMax[i] > second) {
                    third = second;
                    second = arrMax[i];
                }
                else if (arrMax[i] > third) {
                    third = arrMax[i];
                }
            }
            System.out.println(first + second + third);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
