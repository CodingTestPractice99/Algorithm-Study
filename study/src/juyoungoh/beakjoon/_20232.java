package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _20232 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, String> winners = new HashMap<>();
        winners.put(1995, "ITMO");
        winners.put(1996, "SPbSU");
        winners.put(1997, "SPbSU");
        winners.put(1998, "ITMO");
        winners.put(1999, "ITMO");
        winners.put(2000, "SPbSU");
        winners.put(2001, "ITMO");
        winners.put(2002, "ITMO");
        winners.put(2003, "ITMO");
        winners.put(2004, "ITMO");
        winners.put(2005, "ITMO");
        winners.put(2006, "PetrSU, ITMO");
        winners.put(2007, "SPbSU");
        winners.put(2008, "SPbSU");
        winners.put(2009, "ITMO");
        winners.put(2010, "ITMO");
        winners.put(2011, "ITMO");
        winners.put(2012, "ITMO");
        winners.put(2013, "SPbSU");
        winners.put(2014, "ITMO");
        winners.put(2015, "ITMO");
        winners.put(2016, "ITMO");
        winners.put(2017, "ITMO");
        winners.put(2018, "SPbSU");
        winners.put(2019, "ITMO");

        int input = Integer.parseInt(br.readLine());

        System.out.println(winners.get(input));
    }
}
