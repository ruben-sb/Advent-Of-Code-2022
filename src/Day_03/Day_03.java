package Day_03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Day_03 {

    public static void main(String[] args) throws IOException {

        String linea;
        int suma = 0;
        boolean repetido = false;

        ArrayList<String> lista_entrada = new ArrayList<>();
        ArrayList<String> primeros_terminos = new ArrayList<>();
        ArrayList<String> segundos_terminos = new ArrayList<>();
        ArrayList<Character> lista_repetidos = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("Day_03_input.txt"));

        do {
            linea = br.readLine();
            if (linea != null) lista_entrada.add(linea);
        } while (linea != null);

        for (String s : lista_entrada) {
            primeros_terminos.add(s.substring(0, s.length() / 2));
            segundos_terminos.add(s.substring(s.length() / 2));
        }

        for (int i = 0; i < primeros_terminos.size(); i++) {

            for (int j = 0; j < segundos_terminos.get(i).length(); j++) {

                for (int z = 0; z < primeros_terminos.get(i).length(); z++) {

                    if (primeros_terminos.get(i).charAt(z) == segundos_terminos.get(i).charAt(j)) {

                        if (!repetido) {
                            lista_repetidos.add(segundos_terminos.get(i).charAt(j));
                            repetido = true;
                        }

                    }
                }
            }

            repetido = false;
        }


        for (Character caracter : lista_repetidos) {
            suma += conversionAValores(caracter);
        }

        System.out.println(suma);

        //Parte 2

        br.close();
    }


    public static int conversionAValores(char caracter) {

        if ((int) caracter >= 65 && (int) caracter <= 90) caracter = (char) (caracter - 38);
        if ((int) caracter >= 97 && (int) caracter <= 122) caracter = (char) (caracter - 96);

        return caracter;

    }
}
