//currency change

import java.util.*;
public class day22 {
    public static void main(String[] args) {
        int amount=8368;
        currency(amount);
    }
    public static void currency(int amount){
        int notes[] = new int[]{500,200,100,50,20,10,5,2,1};
        int notecount[] = new int[9];
        for(int i=0;i<9;i++){
            if(amount>=notes[i]){
                notecount[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }
        for (int i = 0; i < 9; i++) {
            if (notecount[i] != 0) {
                System.out.println(notes[i] + " : "
                    + notecount[i]);
            }
        }
    }
}
