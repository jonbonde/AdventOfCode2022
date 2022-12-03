import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Part1 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("input.txt", "r")) {
            String str;

            ArrayList<String> sammeList = new ArrayList<String>();
            ArrayList<Integer> prioriteringerList = new ArrayList<Integer>();

            while ((str = file.readLine()) != null) {
                String[] compartment = { str.substring(0, str.length() / 2), str.substring(str.length() / 2) };

                for (int i = 0; i < compartment[1].length(); i++) {
                    if (compartment[0].contains("" + compartment[1].charAt(i))) {
                        sammeList.add("" + compartment[1].charAt(i));
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

            System.out.println(sum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}