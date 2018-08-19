/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package July21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Aman Nautiyal
 */
public class FinSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        String str= Br.readLine();
        String tokens[]= str.split("[,]");
        int n=Integer.parseInt(tokens[0]);
        int p=Integer.parseInt(tokens[1]);
        str=Br.readLine();
        tokens= str.split("[,]");
        int  arr[]=new int[n];
        for(int i=0;i<n;i++)
          arr[i]=Integer.parseInt(tokens[i]);
        long num=0;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                   if ((arr[i]+arr[j]+arr[k])%p==0)
                       num++;
                }
            }
        }
        System.out.println(num%1009);
    }

}
