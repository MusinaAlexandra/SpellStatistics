package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String str = scanner.next();
	spellStatistics(str);
    }

    public static void spellStatistics(String line) {
        line = line.replace('.', ' ');
        line = line.toLowerCase();
        char[] chars = line.toCharArray();
        int size = chars.length;
        Map<Character, Integer> stat = new HashMap<>();
        for (char i = 'a'; i <= 'z'; i++) {
            stat.put(i, 0);
        }
        for (char ch:chars) {
            int cc = stat.get(ch) + 1;
            stat.remove(ch);
            stat.put(ch, cc);
        }
        for (char k : stat.keySet()) {
            System.out.println(k + " statistic is " + ((double)stat.get(k) / size * 100) + " %");
        }
    }
}
