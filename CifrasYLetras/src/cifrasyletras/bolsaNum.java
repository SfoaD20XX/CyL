package cifrasyletras;

import java.util.Random;

public class bolsaNum {
    private int let[];

    public bolsaNum() {
        let = new int[0];
    }

    public int getTam() {
        return let.length;
    }

    public void poner(int n) {
        int[] aux = new int[let.length + 1];
        for (int i = 0; i < getTam(); i++) {
            aux[i] = let[i];
        }
        let = aux;
        let[getTam() - 1] = n;
    }

    public int Random1() {
        Random ran = new Random();
        int ind = ran.nextInt(getTam());
        int[] aux = new int[getTam() - 1];
        int res = let[ind];
        for (int i = 0; i < ind; i++) {
            aux[i] = let[i];
        }
        for (int i = ind; i < aux.length; i++) {
            aux[i] = let[i + 1];
        }
        let = aux;
        return res;
    }

    @Override
    public String toString() {
        String res = "";
        if (getTam() > 0){
            res = "{";
        }
        for (int i = 0; i < (getTam() - 1); i++) {
            res = res + let[i] + ",";
        }
        if (getTam() > 0) {
            res = res + let[getTam() - 1] + "}";
        }
        return res;
    }
}