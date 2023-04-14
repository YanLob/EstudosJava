package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

//        Set<String> listaAprovados = new HashSet<>();
        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luka");
        listaAprovados.add("Pedro");

        System.out.println(listaAprovados);

        for (String canditados: listaAprovados){
            System.out.println(canditados);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

//        nums.get(1); Não é possivel acessar pelo índice

        System.out.println(nums);

        for (Integer conjunto: nums){
            System.out.println(conjunto);
        }

    }
}
