package dominio;
/**
 * Clase que implementa la calculadora de distancias
 */
public class CalculadoraDistancias{
    /**
     * Calcula la distancia de edició n, tal y como la expone
     * Jurafsky entre las cadenas ` s1` y ` s2`.
     */
    public static int calcularDistancia(String s1, String s2){
        /**
         * Creamos una matriz de tamaño (s1.length() + 1) x (s2.length() + 1) para almacenar las distancias
         */
        int[][] distanceTable = new int[s1.length() + 1][s2.length() + 1];

        /**
         * Inicializamos la primer fila
         */
        for (int j = 0; j < distanceTable[0].length; j++) {
            distanceTable[0][j] = j;
        }
        /**
         * Inicializamos la primer columna
         */
        for (int i = 0; i < distanceTable.length; i++) {
            distanceTable[i][0] = i;
        }

       /**
        * Llenamos la matriz con las distancias
        */
    for (int i = 1; i < distanceTable.length; i++) {
        /**
         * Recorremos la matriz de izquierda a derecha y de arriba hacía abajo
         */
        for (int j = 1; j < distanceTable[i].length; j++) {
            /**
             * Si los caracteres en la posición i-1 de s1 y j-1 de s2 son iguales, no hay operación necesaria
             */
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                distanceTable[i][j] = distanceTable[i - 1][j - 1]; 
                /**
                 * Si los caracteres son diferentes, se puede eliminar, insertar o reemplazar
                 */
            } else {
                int delete = distanceTable[i - 1][j] + 1;
                int insert = distanceTable[i][j - 1] + 1;
                int replace = distanceTable[i - 1][j - 1] + 2;
                /**
                 * Tomamos el mínimo de las tres operaciones
                 */
                distanceTable[i][j] = Math.min(delete, Math.min(insert, replace));
            }
        }
    }
    /**
     * La matriz queda de la siguiente forma:
     */
    return distanceTable[s1.length()][s2.length()]; // retorna la distancia entre las dos cadenas
}
}