/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aman Nautiyal
 */
import java.io.*;

public class Chutes {

    static boolean chutesEmpty(int arr[][], int l) {
        boolean x = true;
        for (int ar[] : arr) {
            if (ar[l] != -1) {
                x = false;
                break;
            }
        }
        return x;
    }

    static boolean chutesEqual(int arr[][], int l) {
        boolean x = true;
        int num = -2;
        for (int ar[] : arr) {
            if (num == -2 && ar[l] != -1) {
                num = ar[l];
            } else if (num != ar[l]) {
                x = false;
                break;
            }
        }
        return x;
    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        String str = Br.readLine();
        String tokens[] = str.split("[,]");
        int m = Integer.parseInt(tokens[0]);
        int n = Integer.parseInt(tokens[1]);
        int arr[][] = new int[m][n + 1];
        for (int i = 0; i < m; i++) {
            str = Br.readLine();
            tokens = str.split("[,]");
            for (int j = 0,k=n-1; j <= n; j++,k--) {
                if (j < n) {
                    arr[i][j] = Integer.parseInt(tokens[k]);
                } else {
                    arr[i][j] = -1;
                }
            }
        }
        int l, no, len,temp;
        String ans = "";
        while (!chutesEmpty(arr, 0)) {
            l = 0;
            /*for(int ar[]:arr)
            {
                for(int x:ar)
                    System.out.print(x+" ");
                System.out.println();
            }*/
            while (!chutesEmpty(arr, l) && chutesEqual(arr, l)) {
                l++;
            }
            temp = -2;
            no = -1;
            for (int i = 0; i < m; i++) {
                if (arr[i][l] == -1) {
                    continue;
                }
                if (temp == -2) {
                    temp = arr[i][l];
                    no = i;
                } else if (arr[i][l] > temp) {
                    temp = arr[i][l];
                    no = i;
                }
            }
            ans=ans+Integer.toString(arr[no][0]);
            for(int i=0;i<arr[no].length-1;i++)
                arr[no][i]=arr[no][i+1];
        }
        System.out.println(ans);
    }
}
