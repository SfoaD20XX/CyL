package cifrasyletras;

public class MyString {
    
    private char let[];  
    private int tam;     

    public MyString() {
        let = new char[10];
        tam = 0;
    }
    
    public MyString(char[] txt) {
        let = txt;
        tam = txt.length;
    }

    public void addC(char c) {
        if (tam == let.length) {
            char aux[] = new char[let.length + 10]; 
            for (int i = 0; i < tam; i++) {
                aux[i] = let[i]; 
            }
            let = aux; 
        }
        let[tam++] = c; 
    }

    public void add(MyString ca) {
        for (int i = 0; i < ca.tam; i++) {
            addC(ca.let[i]);
        }
    }

    @Override
    public String toString() {
        String res = new String();
        for (int i = 0; i < tam; i++) {
            res = res + let[i];
        }
        return res;
    }

    public char get(int i) {
        char res = 0;
        if ((i >= 0) && (i < tam)) {
            res = let[i];
        }
        return res;
    }
    
    public int getTam() {
        return tam;
    }
}