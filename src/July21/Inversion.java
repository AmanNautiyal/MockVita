/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package July21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Aman Nautiyal
 */
public class Inversion {
    public static void main(String args[]) throws IOException
    {
     BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));   
     int n=Integer.parseInt(Br.readLine());
     int num;
     int derived[]=new int[n];
     String bin,str=Br.readLine();
     Arrays.fill(derived, 0);
     String tokens[]=str.split("[,]");
     for(int i=0;i<n;i++)
     {
         num=Integer.parseInt(tokens[i]);
         bin=Integer.toBinaryString(num);
         for(int j=0;j<bin.length();j++)
             if(bin.charAt(j)=='1')
                 derived[i]++;
     }
     int inversions=0;
     for(int i=0;i<n-1;i++)
     {
         for(int j=i+1;j<n;j++)
         {
             if(derived[i]>derived[j])
                 inversions++;
         }
     }
     System.out.println(inversions);
    }
}
