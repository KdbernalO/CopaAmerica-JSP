
package copaprueba;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Paises {
    
    public String nombre;
    public Image Bandera;
    public String Ruta;
    public int goles;
    
   
    public void bandera(String ruta){
        Bandera = new ImageIcon(getClass().getResource(ruta)).getImage();
    }

    public Paises(String nombre, String Ruta, int goles) {
        this.nombre = nombre;
        this.Ruta = Ruta;
        this.goles = goles;
    }
}
