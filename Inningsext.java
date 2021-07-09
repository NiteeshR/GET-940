import java.io.*;
import java.util.*;

public class Inningsext 
{
	public static void main(String args[]) 
	{
        System.out.println("Innings Info:- ");
        int totalruns = 0;
        int zeroes = 0;
        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int sixes = 0;
        float strikerate = 0;
        float avg = 0;
        int[] runs = new int[500];
        int t = 0;
        int tc = 0;
        int mb = 0;
        for (int j = 0; j < 5; j++) {
            System.out.println("Enter the balls played in match " + (j + 1));
            Scanner sc = new Scanner(System.in);
            mb = sc.nextInt();
            t = t + mb;
            for (int i = 0; i < mb; i++) {
                tc++;
                runs[tc] = (int) (Math.random() * 7) + 0;
            }
            tc++;
            runs[tc] = 9;
        }

        for (int i = 0; i < tc - 1; i++) {
            if (runs[i] != 9) {
                totalruns = totalruns + runs[i];
                if (runs[i] == 0) {
                    zeroes++;
                } else if (runs[i] == 1) {
                    ones++;
                } else if (runs[i] == 2) {
                    twos++;
                } else if (runs[i] == 3) {
                    threes++;
                } else if (runs[i] == 4) {
                    fours++;
                } else {
                    if (runs[i] == 6) {
                        sixes++;
                    }
                }
            }
        }

        float temp = totalruns;
        avg = temp / 5;
        strikerate = (temp / t) * 100;

        System.out.println("Batsman details");
        System.out.println("Runs on each ball : ");
        for (int i = 0; i < tc - 1; i++) {
            if (runs[i] != 9) {
                System.out.print(runs[i] + "  ");
            }
        }
        System.out.println("Average    : " + avg);
        System.out.println("Total Runs : " + totalruns);
        System.out.println("Ones       : " + ones);
        System.out.println("Twos       : " + twos);
        System.out.println("Threes     : " + threes);
        System.out.println("Fours      : " + fours);
        System.out.println("Sixes      : " + sixes);
        System.out.println("Strike Rate : " + strikerate);
    }
}
