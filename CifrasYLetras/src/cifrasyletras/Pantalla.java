package cifrasyletras;

public class Pantalla {

    Menu men = new Menu();
    Partida part = new Partida();
    LT lt = new LT();

    public void panta() {
        Character opc = ' ';
        while (opc != 's') {
            men.menu_inici();
            opc = lt.llegirCaracter();

            if (opc == null) {
                opc = ' ';
            }
            if ((opc != '1') && (opc != 's') && (opc != '2')) {
                System.err.println("Error!");
            } else {
                if (opc == '1') {
                    Jugar();
                    return;
                } else {
                    if (opc == '2') {
                        men.menu_Estadisticas();
                        return;
                    }
                }
            }
        }
    }

    public void Jugar() {
        Character opc = ' ';
        while (opc != 's') {
            men.menu_Jugar();
            opc = lt.llegirCaracter();

            if (opc == null) {
                opc = ' ';
            }
            if (opc != '1' && opc != 's') {
                System.err.println("Error!");
            } else {
                if (opc == '1') {
                    part.inicio_Ronda();
                    return;
                }
            }
        }
        panta();
    }
}
