import java.io.IOException;
import java.io.RandomAccessFile;

public class Part1 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("input.txt", "r")) {
            String str;

            int fullyContains = 0;
            
            while ((str = file.readLine()) != null) {
                String[] pair = str.split(",");
                String[] venstreStr = pair[0].split("-");
                String[] hoyreStr = pair[1].split("-");

                int[] venstre = {Integer.parseInt(venstreStr[0]), Integer.parseInt(venstreStr[1])};
                int[] hoyre = {Integer.parseInt(hoyreStr[0]), Integer.parseInt(hoyreStr[1])};
                
                if ((venstre[0] <= hoyre[0] && venstre[1] >= hoyre[1]) || (venstre[0] >= hoyre[0] && venstre[1] <= hoyre[1])) {
                    fullyContains += 1;
                }
            }
            System.out.println(fullyContains);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}