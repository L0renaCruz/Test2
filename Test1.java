import java.util.ArrayList;

public class Test1{
    public static void main(String[] args) {

        //add -> agregar (datos)
        // get -> te devuelve un valor dentro del arreglo(ArrayList)
        // size -> sirve para ver la logitud del ArrayList
        // remove -> remover o elimar(Todo lo que esta a la derecha se recorrera a la izquierda)
        // set -> Sirve para actualizar valores del ArrayList
        // clear -> todo se eliminara (Todo se va a chupar limon)
        //int numeros [] = {1};

        ArrayList<String> canciones = new ArrayList<String>();
        canciones.add("no se");
        System.out.println(canciones);

        canciones.add("una pieza que no se baila");
        System.out.println(canciones);

        System.out.println(canciones.get(1));
        System.out.println(canciones.size());
        System.out.println(canciones.remove(0));

        System.out.println(canciones.get(0));
        
        canciones.add("el queria una cancion");
        canciones.add("se fue la luz");
        canciones.add("las que no tienen papá");
        System.out.println(canciones);
        canciones.set(2, "alma enamorada");
        System.out.println(canciones);

        canciones.clear();

    }

}