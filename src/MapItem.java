
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public abstract class MapItem {
  
  boolean seen = false;
  Image image;
  public MapItem() { 
    /* YOUR CONSTRUCTOR CODE HERE*/
  }
  
  public Image getImage(){
    return image;
  }
}
