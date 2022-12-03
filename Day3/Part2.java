import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;

public class Part2 {
    public static String smallest(String words[]) {
        if (words == null || words.length < 1) {
            return "";
        }
        String smallest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("input.txt", "r")) {
            String str;

            ArrayList<String> rucksackList = new ArrayList<String>();
            ArrayList<String> sammeList = new ArrayList<String>();
            ArrayList<Integer> prioriteringerList = new ArrayList<Integer>();

            while ((str = file.readLine()) != null) {
                rucksackList.add(str);
            }
            String[] sekker = new String[3];
            for (int i = 0, j = 1, k = 2; k < rucksackList.size(); i += 3, j += 3, k += 3) {
                sekker[0] = rucksackList.get(i);
                sekker[1] = rucksackList.get(j);
                sekker[2] = rucksackList.get(k);
                String kortest = smallest(sekker);

                for (int l = 0; l < kortest.length(); l++) {
                    String bokstav = "" + kortest.charAt(l);
                    if (sekker[0].contains(bokstav) && sekker[1].contains(bokstav) && sekker[2].contains(bokstav)) {
                        sammeList.add(bokstav);
                        System.out.println(sekker[0] + "\n" + sekker[1] + "\n" + sekker[2]);
                        break;
                    }
                }
            }

            String[] sammeArr = new String[sammeList.size()];
            sammeArr = sammeList.toArray(sammeArr);

            for (int i = 0; i < sammeArr.length; i++) {
                switch (sammeArr[i]) {
                    case "a":
                        prioriteringerList.add(1);
                        break;
                    case "b":
                        prioriteringerList.add(2);
                        break;
                    case "c":
                        prioriteringerList.add(3);
                        break;
                    case "d":
                        prioriteringerList.add(4);
                        break;
                    case "e":
                        prioriteringerList.add(5);
                        break;
                    case "f":
                        prioriteringerList.add(6);
                        break;
                    case "g":
                        prioriteringerList.add(7);
                        break;
                    case "h":
                        prioriteringerList.add(8);
                        break;
                    case "i":
                        prioriteringerList.add(9);
                        break;
                    case "j":
                        prioriteringerList.add(10);
                        break;
                    case "k":
                        prioriteringerList.add(11);
                        break;
                    case "l":
                        prioriteringerList.add(12);
                        break;
                    case "m":
                        prioriteringerList.add(13);
                        break;
                    case "n":
                        prioriteringerList.add(14);
                        break;
                    case "o":
                        prioriteringerList.add(15);
                        break;
                    case "p":
                        prioriteringerList.add(16);
                        break;
                    case "q":
                        prioriteringerList.add(17);
                        break;
                    case "r":
                        prioriteringerList.add(18);
                        break;
                    case "s":
                        prioriteringerList.add(19);
                        break;
                    case "t":
                        prioriteringerList.add(20);
                        break;
                    case "u":
                        prioriteringerList.add(21);
                        break;
                    case "v":
                        prioriteringerList.add(22);
                        break;
                    case "w":
                        prioriteringerList.add(23);
                        break;
                    case "x":
                        prioriteringerList.add(24);
                        break;
                    case "y":
                        prioriteringerList.add(25);
                        break;
                    case "z":
                        prioriteringerList.add(26);
                        break;
                    case "A":
                        prioriteringerList.add(27);
                        break;
                    case "B":
                        prioriteringerList.add(28);
                        break;
                    case "C":
                        prioriteringerList.add(29);
                        break;
                    case "D":
                        prioriteringerList.add(30);
                        break;
                    case "E":
                        prioriteringerList.add(31);
                        break;
                    case "F":
                        prioriteringerList.add(32);
                        break;
                    case "G":
                        prioriteringerList.add(33);
                        break;
                    case "H":
                        prioriteringerList.add(34);
                        break;
                    case "I":
                        prioriteringerList.add(35);
                        break;
                    case "J":
                        prioriteringerList.add(36);
                        break;
                    case "K":
                        prioriteringerList.add(37);
                        break;
                    case "L":
                        prioriteringerList.add(38);
                        break;
                    case "M":
                        prioriteringerList.add(39);
                        break;
                    case "N":
                        prioriteringerList.add(40);
                        break;
                    case "O":
                        prioriteringerList.add(41);
                        break;
                    case "P":
                        prioriteringerList.add(42);
                        break;
                    case "Q":
                        prioriteringerList.add(43);
                        break;
                    case "R":
                        prioriteringerList.add(44);
                        break;
                    case "S":
                        prioriteringerList.add(45);
                        break;
                    case "T":
                        prioriteringerList.add(46);
                        break;
                    case "U":
                        prioriteringerList.add(47);
                        break;
                    case "V":
                        prioriteringerList.add(48);
                        break;
                    case "W":
                        prioriteringerList.add(49);
                        break;
                    case "X":
                        prioriteringerList.add(50);
                        break;
                    case "Y":
                        prioriteringerList.add(51);
                        break;
                    case "Z":
                        prioriteringerList.add(52);
                        break;
                    default:
                        break;
                }
            }
            Integer[] prioriteringerArr = new Integer[prioriteringerList.size()];
            prioriteringerArr = prioriteringerList.toArray(prioriteringerArr);

            int sum = 0;
            for (int i = 0; i < prioriteringerArr.length; i++) {
                sum += prioriteringerArr[i];
            }
            System.out.println(Arrays.toString(sammeArr));
            System.out.println(prioriteringerList);
            System.out.println(sum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}