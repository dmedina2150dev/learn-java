
public class Variables {
    public static void main(String[] args) {
        // Variable de Referencia (String, Integer, Boolean)
        String saludar = "Hola mundo desde Java";
        Integer edad = 20;
        
        System.out.println(saludar);

        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        // Variable Primitivo (int, boolean, char)
        int numero = 101;
        System.out.println("numero = " + numero);

        boolean valor = true;
        int numero3 = 90;
        
        if (valor) {
            System.out.println("numero = " + numero);
            // esta solo se puede utilizar en el contexto entre las llaves { }
            int numero2 = 20;
            System.out.println("numero2 = " + numero2);
            numero3 = 13;
        }

        System.out.println("numero3 = " + numero3);

        // Nueva forma de definir variables
        var numero4 = 0.9;
        System.out.println("numero4 = " + numero4);
        
        
        String nombre;
        nombre = "Andres";
        
        
        if (numero > 10) {
            nombre = "Juan";
        }

        System.out.println("nombre = " + nombre);


//        int class = 5;
    }
}