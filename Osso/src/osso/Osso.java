
package osso;

import java.util.Random;


public class Osso {

    
    public static void main(String[] args) {
       Random die = new Random();
        int c1 = die.nextInt();
        if (c1<0) c1*=-1;
        c1%=7;
        c1++;
   
        int c2 = die.nextInt();
        if (c2<0) c2*=-1;
        c2%=7;
        c2++;

        int cTotal = (c1 + c2); // sum of the dice rolled

        System.out.println("Computer rolled a " + c1 + " and a " + c2 + ".");

        int h1 = die.nextInt();
        if (h1<0) h1*=-1;
        h1%=7;
        h1++;
        
        
        int h2 = die.nextInt();
        if (h2<0) h2*=-1;
        h2%=7;
        h2++;
        
        int hTotal = (h1 + h2);

        
        
        System.out.println("You rolled a " + h1 + " and a " + h2 + ".");

        int computerMax = (c1 > c2)?c1 : c2;
        int humanMax = (h1 > h2)?h1 : h2;
        
        
        int winner = 0;
        if (hTotal > cTotal) winner = 1;
        if (hTotal < cTotal) winner = 2;
        if ((hTotal==cTotal) && (humanMax > computerMax)) winner = 1;
        if ((hTotal==cTotal) && (humanMax < computerMax)) winner = 2;
        


        
        boolean computerDoubles = (c1 == c2);
        boolean humanDoubles = (h1 == h2);
        if (computerDoubles && !humanDoubles) winner = 2;
        if (humanDoubles && !computerDoubles) winner = 1;
        if (humanDoubles && computerDoubles && c1 > h1) winner = 1;
        if (humanDoubles && computerDoubles && h1 > c1) winner = 2;
        
        if (c1 ==7 && c2 == 1 || c1 == 1 && c2 == 7) winner = 2;
        if (h1 ==7 && h2 == 1 || h1 == 1 && h2 == 7) winner = 1;

        switch (winner) {
            case 1 : 
        System.out.println("Congratulations, you beat me.");
                            break;
            case 2 : 
        System.out.println("Haha. I win!");
                            break;                
            default : 
        System.out.println("We tied");
                            break;                
        }
        
                
        
                
        
        
        
    
        
                
        
        
    }
    }
    


