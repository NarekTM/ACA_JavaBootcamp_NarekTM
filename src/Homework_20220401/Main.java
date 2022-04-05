package Homework_20220401;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the string you want to count the occurrences in each line: ");
        String searchLine = scanner.nextLine().toLowerCase();
        scanner.close();

        try {
            occursOfStringInEachLine(searchLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void occursOfStringInEachLine(String searchLine) throws IOException {
        File readFile = new File("src\\Homework_20220401\\resources\\ReadFile.txt");
        Scanner fileScanner = new Scanner(readFile);

        File writeFile = new File("src\\Homework_20220401\\resources\\WriteFile.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(writeFile));

        int lineNumber = 1;
        int count = 0;
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();

            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNext()) {
                String word = lineScanner.next().toLowerCase();
                if (word.equals(searchLine) ||
                        (word.contains(searchLine) && word.length() == 6 &&
                                (word.charAt(5) < 'a' || word.charAt(5) > 'z') &&
                                (word.charAt(5) < 'A' || word.charAt(5) > 'Z'))) {
                    count++;
                }
            }
            lineScanner.close();

            writer.write("Line " + lineNumber + " - " + count);
            writer.newLine();
            lineNumber++;
            count = 0;
        }
        writer.close();
        fileScanner.close();
    }

}
