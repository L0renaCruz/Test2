import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Test2 {
    static ArrayList <String> canciones = new ArrayList<String>();
    static String mensaje = "armemos tu playlist ";

    public static void agregar(){
        do{
            canciones.add(JOptionPane.showInputDialog("Ingresa una cancion"));
        }while(JOptionPane.showConfirmDialog(null, "Quieres agregar otra cancion?", null, 0)== 0);
    }
    public static void preguntar(){
        do{
            JOptionPane.showMessageDialog(null, mensaje);
            mensaje = "continuemos armando tu playlist";
            agregar();
            do{
                switch(Integer.parseInt(JOptionPane.showInputDialog
                ("¿Que deseas hacer?\n 1 = Agregar nueva cancion\n 2 = Ver canciones guardadas\n 3 = Eliminar una cancion o limpiar playlist"))){
                    case 1 -> agregar();
                    case 2 -> impresion();
                    case 3 -> eliminar();
                    default -> JOptionPane.showMessageDialog(null, "Debes elegir uno de los simbolos, intenta despues");
                }
            }while(JOptionPane.showConfirmDialog(null, "Correcto!\nDeseas volver al menú de opciones que tienes?", null, 0)== 0);
            
        }while(JOptionPane.showConfirmDialog(null, "Quieres salir?", null, 0)== 0);
    }
    public static void eliminar() {
        switch(Integer.parseInt(JOptionPane.showInputDialog("Elije una opcion:\n 1 = Eliminar una cancion\n  2 = limpiar playlist"))){
            case 1 -> remover(Integer.parseInt(JOptionPane.showInputDialog(canciones + "\nEn que numero esta la cancion que deseas eliminar?"))-1);
            case 2 -> canciones.clear();
            default -> JOptionPane.showMessageDialog(null, "Debes ingresar un numero, vuelve a intentar despues.");
        }
    }

    public static void remover(int posicion) {
        if(JOptionPane.showConfirmDialog(null, "si eliminas estas canción no la veras despues" + canciones.get(posicion) + "?", null, 0)== 0){
            canciones.remove(posicion);
        }else{
            JOptionPane.showMessageDialog(null, "Ok!!!");
        }
    }
    public static void impresion() {
        JOptionPane.showMessageDialog(null, canciones);
    }


    public static void main(String[] args) {
        preguntar();
    
    }
}
