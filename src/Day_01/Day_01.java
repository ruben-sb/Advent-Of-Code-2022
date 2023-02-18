package Day_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Day_01 {

    public static void main(String[] args) throws IOException {

        String lectura;
        int suma = 0;

        ArrayList<Integer> lista = new ArrayList<>();

        FileReader fr = new FileReader("Day_01_input.txt");

        BufferedReader br = new BufferedReader(fr);

        do {

            do {
                lectura = br.readLine();
                if (lectura!=null && !lectura.equals("") ) suma += Integer.parseInt(lectura);
            } while (lectura!=null && !lectura.equals("") );

            lista.add(suma);
            suma = 0;

        }while (lectura!=null);

        br.close();

        lista.sort(Collections.reverseOrder());

        System.out.println(lista);

        System.out.println(lista.get(0));
        System.out.println(lista.get(0) + lista.get(1) + lista.get(2));


    }
}
