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
public class BugCrawl {

    /**
     * @param args the command line arguments
     */
   static String nextState(String currentstate,char com)
    {
     String ret="";
     switch(currentstate)
     {
         case "1U":
             if(com=='F')
                 ret="6S";
             else if(com=='B')
                 ret="6N";
             else if(com=='L')
                 ret="6E";
             else if(com=='R')
                 ret="6W";
             break;
         case "1D":
             if(com=='F')
                 ret="3S";
             else if(com=='B')
                 ret="3N";
             else if(com=='L')
                 ret="3W";
             else if(com=='R')
                 ret="3E";
             break;
         case "1W":
             if(com=='F')
                 ret="2S";
             else if(com=='B')
                 ret="2N";
             else if(com=='L')
                 ret="2U";
             else if(com=='R')
                 ret="2D";
             break;    
         case "1E":
             if(com=='F')
                 ret="5S";
             else if(com=='B')
                 ret="5N";
             else if(com=='L')
                 ret="5U";
             else if(com=='R')
                 ret="5D";
             break;
          case "4U":
             if(com=='F')
                 ret="6N";
             else if(com=='B')
                 ret="6S";
             else if(com=='L')
                 ret="6W";
             else if(com=='R')
                 ret="6E";
             break;
         case "4D":
             if(com=='F')
                 ret="3N";
             else if(com=='B')
                 ret="3S";
             else if(com=='L')
                 ret="3E";
             else if(com=='R')
                 ret="3W";
             break;
         case "4W":
             if(com=='F')
                 ret="2N";
             else if(com=='B')
                 ret="2S";
             else if(com=='L')
                 ret="2D";
             else if(com=='R')
                 ret="2U";
             break;    
         case "4E":
             if(com=='F')
                 ret="5N";
             else if(com=='B')
                 ret="5S";
             else if(com=='L')
                 ret="5D";
             else if(com=='R')
                 ret="5U";
             break;
         case "2U":
             if(com=='F')
                 ret="6E";
             else if(com=='B')
                 ret="6W";
             else if(com=='L')
                 ret="6N";
             else if(com=='R')
                 ret="6S";
             break;
         case "2D":
             if(com=='F')
                 ret="3E";
             else if(com=='B')
                 ret="3W";
             else if(com=='L')
                 ret="3S";
             else if(com=='R')
                 ret="3N";
             break;
         case "2N":
             if(com=='F')
                 ret="1E";
             else if(com=='B')
                 ret="1W";
             else if(com=='L')
                 ret="1D";
             else if(com=='R')
                 ret="1U";
             break;    
         case "2S":
             if(com=='F')
                 ret="4E";
             else if(com=='B')
                 ret="4W";
             else if(com=='L')
                 ret="4U";
             else if(com=='R')
                 ret="4D";
             break;
         case "5U":
             if(com=='F')
                 ret="6W";
             else if(com=='B')
                 ret="6E";
             else if(com=='L')
                 ret="6S";
             else if(com=='R')
                 ret="6N";
             break;
         case "5D":
             if(com=='F')
                 ret="3W";
             else if(com=='B')
                 ret="3E";
             else if(com=='L')
                 ret="3N";
             else if(com=='R')
                 ret="3S";
             break;
         case "5N":
             if(com=='F')
                 ret="1W";
             else if(com=='B')
                 ret="1E";
             else if(com=='L')
                 ret="1U";
             else if(com=='R')
                 ret="1D";
             break;    
         case "5S":
             if(com=='F')
                 ret="4W";
             else if(com=='B')
                 ret="4E";
             else if(com=='L')
                 ret="4D";
             else if(com=='R')
                 ret="4U";
             break;
         case "3N":
             if(com=='F')
                 ret="1U";
             else if(com=='B')
                 ret="1D";
             else if(com=='L')
                 ret="1E";
             else if(com=='R')
                 ret="1W";
             break;
         case "3S":
             if(com=='F')
                 ret="4U";
             else if(com=='B')
                 ret="4D";
             else if(com=='L')
                 ret="4W";
             else if(com=='R')
                 ret="4E";
             break;
         case "3E":
             if(com=='F')
                 ret="5U";
             else if(com=='B')
                 ret="5D";
             else if(com=='L')
                 ret="5N";
             else if(com=='R')
                 ret="5S";
             break;    
         case "3W":
             if(com=='F')
                 ret="2U";
             else if(com=='B')
                 ret="2D";
             else if(com=='L')
                 ret="2N";
             else if(com=='R')
                 ret="2S";
             break;
         case "6N":
             if(com=='F')
                 ret="1D";
             else if(com=='B')
                 ret="1U";
             else if(com=='L')
                 ret="1W";
             else if(com=='R')
                 ret="1E";
             break;
         case "6S":
             if(com=='F')
                 ret="4D";
             else if(com=='B')
                 ret="4U";
             else if(com=='L')
                 ret="4E";
             else if(com=='R')
                 ret="4W";
             break;
         case "6E":
             if(com=='F')
                 ret="5D";
             else if(com=='B')
                 ret="5U";
             else if(com=='L')
                 ret="5S";
             else if(com=='R')
                 ret="5N";
             break;    
         case "6W":
             if(com=='F')
                 ret="2D";
             else if(com=='B')
                 ret="2U";
             else if(com=='L')
                 ret="2S";
             else if(com=='R')
                 ret="2N";
             break;
     }
     return ret;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        String state=Br.readLine();
        String commands=Br.readLine();
        for(int i=commands.length()-1;i>=0;i--)
        {
            state=nextState(state, commands.charAt(i));
        }
        System.out.println(state);
    }
    
}
