
package cifrasyletras;


public class Numeros {
    public void Rondas(MyString nom){
        int rondas;
        LT lt = new LT();
       System.out.println("\n\n\n\n\n\n");
       System.out.println("*******************************************************");
       System.out.print("*Introduce cuántas rondas quieres jugar (número par): ");
       rondas = lt.llegirSencer();
       
       

       System.out.println("\n\n\n\n\n\n");
        System.out.println("Ronda 1 de " + rondas + " : Numeros");
        System.out.println("\n");
        System.out.println("Turno de: " + nom.toString());
        System.out.println("\n");
        System.out.println("************************************");
        System.out.println("Los numeros son: ");
        System.out.println("************************************");
    }
}



