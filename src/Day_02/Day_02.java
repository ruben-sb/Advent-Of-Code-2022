package Day_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Day_02 {

    public static void main(String[] args) throws IOException {

        String linea;
        ArrayList<String> lista = new ArrayList<>();
        int total=0, total2=0;

        BufferedReader br = new BufferedReader(new FileReader("Day_02_input.txt"));

        do {
            linea = br.readLine();
            if (linea != null) linea = linea.replaceAll(" ", "");
            if (linea != null) lista.add(linea);
        }
        while(linea!=null);

        br.close();


        for(String valor:lista){
           total += devuelveValores(valor);
           total2 += devuelveValoresparte2(valor);
        }

        System.out.println(total);
        System.out.println(total2);


    }

    public static int devuelveValores (String entrada) {

        switch (entrada) {
            case "AX":
                return 4;
            case "AY":
                return 8;
            case "AZ":
                return 3;
            case "BX":
                return 1;
            case "BY":
                return 5;
            case "BZ":
                return 9;
            case "CX":
                return 7;
            case "CY":
                return 2;
            case "CZ":
                return 6;
            default:
                return 0;

        }
    }
        public static int devuelveValoresparte2 (String entrada){

            switch (entrada){
                case "AX":
                    return 3;
                case "AY":
                    return 4;
                case "AZ":
                    return 8;
                case "BX":
                    return 1;
                case "BY":
                    return 5;
                case "BZ":
                    return 9;
                case "CX":
                    return 2;
                case "CY":
                    return 6;
                case "CZ":
                    return 7;
                default:
                    return 0;

            }
    }
}
