package Collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(2, "Ricardo");
        usuarios.put(9, "Richarlison");
        usuarios.put(4, "Rebecca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println();

        System.out.println(usuarios.containsKey(9));
        System.out.println(usuarios.containsValue("Richarlison"));

        System.out.println();

        System.out.println(usuarios.get(9));
        System.out.println(usuarios.remove(1));
        System.out.println(usuarios.remove(4, "Gui"));

        System.out.println();

        for (int chaves: usuarios.keySet()){
            System.out.println(chaves);
        }

        for (String valor: usuarios.values()){
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + " - ");
            System.out.println(registro.getValue());
        }
    }
}
