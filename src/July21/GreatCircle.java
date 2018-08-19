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
public class GreatCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(Br.readLine());
        String str,tokens[];
        double latlong[][]=new double[n][2];
        double dist=0;
        double phi=0,phi1,phi2,dlambda;
        for(int i=0;i<n;i++)
        {
            str=Br.readLine();
            tokens=str.split("[,]");
            latlong[i][0]=Double.parseDouble(tokens[0].substring(0,(tokens[0].length()-1)));
            if(tokens[0].charAt(tokens[0].length()-1)=='S')
                latlong[i][0]=-latlong[i][0];
             latlong[i][1]=Double.parseDouble(tokens[1].substring(0,(tokens[1].length()-1)));
            if(tokens[1].charAt(tokens[1].length()-1)=='W')
                latlong[i][1]=-latlong[i][1];
            latlong[i][0]=Math.toRadians(latlong[i][0]);
            latlong[i][1]=Math.toRadians(latlong[i][1]);
            if(i==0)
                continue;            
            phi1=latlong[i-1][0];
            phi2=latlong[i][0];
            dlambda=Math.abs(latlong[i-1][1]-latlong[i][1]);
            phi=Math.acos(Math.sin(phi1)*Math.sin(phi2)+Math.cos(phi1)*Math.cos(phi2)*Math.cos(dlambda));
            /*System.out.println("phi1="+phi1);
            System.out.println("phi2="+phi2);
            System.out.println("dlambda="+dlambda);
            System.out.println("phi="+phi);
            System.out.println("dist="+6400*phi);*/
            dist+=(6400*phi);
        }
        System.out.println(Math.round(dist));
   }
    
}
