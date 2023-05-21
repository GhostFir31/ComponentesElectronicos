/**
 *
 * @author molguin
 */
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class CanvasImagen extends Canvas {

   private BufferedImage image;

   public CanvasImagen(String imagen) {
  	try {
     	// Cargar la imagen desde el archivo PNG
     	image = ImageIO.read(new File(imagen));
        
  	} catch (Exception e) {
     	e.printStackTrace();
  	}
   }

   public void paint(Graphics g) {
  	// Dibujar la imagen en el objeto Canvas
  	g.drawImage(image, 10, 10, 50,50, this);
   }

}
