import java.util.*;
import java.io.*;

public class Innings 
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
        int[] runs = new int[30];

        for (int i = 0; i < runs.length; i++) 
        {
            runs[i] = (int) (Math.random() * 7) + 0;
        }

        for (int i = 0; i < runs.length; i++) 
        {
            totalruns = totalruns + runs[i];
            if (runs[i] == 0) 
            {
                zeroes++;
            } 
            else if (runs[i] == 1) 
            {
                ones++;
            } 
            else if (runs[i] == 2) 
            {
                twos++;
            } 
            else if (runs[i] == 3) 
            {
                threes++;
            } 
            else if (runs[i] == 4) 
            {
                fours++;
            } else 
            {
                if (runs[i] == 6) 
                {
                    sixes++;
                }
            }
        }

        float temp = totalruns;
        strikerate = (temp / 30) * 100;

        System.out.println("Batsman details");
        System.out.println("Runs on each ball : ");
        for (int i = 0; i < runs.length; i++) 
        {
            System.out.print(runs[i] + "  ");
        }
        System.out.println("Total Runs : " + totalruns);
        System.out.println("Zeroes     : " + zeroes);
        System.out.println("Ones       : " + ones);
        System.out.println("Twos       : " + twos);
        System.out.println("Threes     : " + threes);
        System.out.println("Fours      : " + fours);
        System.out.println("Sixes      : " + sixes);
        System.out.println("Strike Rate : " + strikerate);
    }
}
