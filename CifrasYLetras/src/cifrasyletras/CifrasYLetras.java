/*

Juego de Cifras y Letras
------------------------



*/
package cifrasyletras;

public class CifrasYLetras {
    
    public static void main(String[] args) {
        (new CifrasYLetras()).start();
    }
    
    private void start() {
        Pantalla pant = new Pantalla();
        pant.menu();
    } 
    
}
