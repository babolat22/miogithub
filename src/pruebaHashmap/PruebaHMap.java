package pruebaHashmap;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

/**
 *
 * @author juanj
 */
public class PruebaHMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           String auto= "No es una palabra de la RAE";   
        Map<String, String> dic = new TreeMap<>();  // llave  // valor
        dic.put("alopecia", "Ausencia o caída del pelo en las zonas que lo poseen");
        dic.put("escrutinio", "Recuento de los votos de una elección");
        dic.put("edificio", "Edificio para habitar. Una casa de al menos 4 plantas");
                
        System.out.println("" + dic.get("alopecia"));
        System.out.println("" + dic.get("democracia"));
        System.out.println(""+ dic.getOrDefault("rareza", auto));
        System.out.println(""+ dic.getOrDefault("escrutinio", "No es una palabra de la RAE"));
       
        
        Map<String, Integer> telefonitos = new HashMap<>();
        telefonitos.put("Renzo", null);
        telefonitos.put("Profe", 266478666);
        //telefonitos.putIfAbsent("Juana");
        telefonitos.putIfAbsent("Renzo", 999999999);
        System.out.println("" + telefonitos.get("Profe"));
        System.out.println("" + telefonitos.get("Renzo"));
        
//si hago map.getOrDefault ("key1", nuevo Object ()), incluso si el objeto está presente para key1 en el mapa, 
// new Object() igual se crea.      Aunque el método no lo devuelve, todavía lo crea. Por ejemplo,
        Map<String, Personaje> map = new HashMap<String, Personaje>();
        Personaje imp = new Personaje("timon");
        map.put("1", imp);
        System.out.println(map.getOrDefault("3", new Personaje("Pumnba"))); // puede ser un msj u otra cosa
        
    }

    public PruebaHMap() {
    }
    
}