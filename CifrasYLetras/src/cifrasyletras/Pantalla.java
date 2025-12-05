package cifrasyletras;

public class Pantalla {
    
    public void menu(){
        System.out.println("\n\n\n\n");
        System.out.println("***************************************************");
        System.out.println("*                                                 *");
        System.out.println("*                  Cifras y Letras                *");
        System.out.println("*                                                 *");
        System.out.println("*            Adria Esteva y Aaron Sascha          *");
        System.out.println("*                                                 *");
        System.out.println("*                                                 *");
        System.out.println("*                                                 *");
        System.out.println("*            Programacion 1 - UIB 2025/26         *");
        System.out.println("*                                                 *");
        System.out.println("***************************************************");
        System.out.println("* (1) --> Jugar contra la maquina                 *");
        System.out.println("* (2) --> Opciones                                *");
        System.out.println("* (3) --> Salir                                   *");
        System.out.println("***************************************************");
        
        LT lt = new LT();
        int opc;
        
        System.out.print("Opcion: " );
        opc = lt.llegirSencer();
        
        switch(opc){
            case 1 -> Jugar();
            case 2 -> System.out.println("BIEN 2");
            case 3 -> System.out.println("Adeu!!");
            default -> System.out.println("Opció no vàlida!");
        }
    } 
    public void Jugar() {
        char nom[];
        LT lt = new LT();
        System.out.println("\n\n\n\n");
        System.out.println("***************************************************");
        System.out.println("*                                                 *");
        System.out.println("*                  Cifras y Letras                *");
        System.out.println("*                                                 *");
        System.out.println("*            Adria Esteva y Aaron Sascha          *");
        System.out.println("*                                                 *");
        System.out.println("*                                                 *");
        System.out.println("*            Programacion 1 - UIB 2025/26         *");
        System.out.println("*                                                 *");
        System.out.println("***************************************************");
        System.out.print("Nombre: ");
        nom = lt.llegirLiniaC();
        
        MyString cadena = new MyString(nom);
        
       System.out.println("\n\n\n\n");
       System.out.println("***************************************************");
       System.out.println("* Molt bé " + cadena.toString() + "                                *");
       System.out.println("*                                                 *");
       System.out.println("* Anem a jugar a Xifres I Lletres                 *");
       System.out.println("*                                                 *");
       System.out.println("* Elegeix l'opcio:                                *");
       System.out.println("***************************************************");
       System.out.println("* (1) --> Jugar                                   *");
       System.out.println("* (2) --> sortir al menu                          *");
       System.out.println("***************************************************");
       
        int opc;
        
        System.out.print("Opcion: " );
        opc = lt.llegirSencer();
        Numeros inicio = new Numeros();
        switch(opc) {
            case 1 -> inicio.Rondas(cadena);
            case 2 -> menu();
            default -> System.out.println("Opció no vàlida!");
        }
    }
}
