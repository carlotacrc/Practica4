package dominio;
public class CalculadoraDistancias{
    /**
     * Calcula la distancia de edició n, tal y como la expone
     * Jurafsky entre las cadenas ` s1` y ` s2`.
     */
    public static int calcularDistancia(String s1, String s2){
        // creamos la matriz que tendrá las distancias con el tamaño de los strings
        int[][] distanceTable = new int[s1.length() + 1][s2.length() + 1];

        //inicializamos la primera fila
        for (int j = 0; j < distanceTable[0].length; j++) {
            distanceTable[0][j] = j;
        }
        //inicializamos la primer columna
        for (int i = 0; i < distanceTable.length; i++) {
            distanceTable[i][0] = i;
        }

       // calcular las distancias
    for (int i = 1; i < distanceTable.length; i++) {
        for (int j = 1; j < distanceTable[i].length; j++) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                distanceTable[i][j] = distanceTable[i - 1][j - 1]; // no hay operación necesaria
            } else {
                int delete = distanceTable[i - 1][j] + 1;
                int insert = distanceTable[i][j - 1] + 1;
                int replace = distanceTable[i - 1][j - 1] + 2;
                distanceTable[i][j] = Math.min(delete, Math.min(insert, replace)); // toma el mínimo entre eliminar, insertar o reemplazar
            }
        }
    }

    return distanceTable[s1.length()][s2.length()]; // retorna la distancia entre las dos cadenas
}
}