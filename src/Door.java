
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Door extends MapItem {
  boolean opened = false;
  boolean locked;
  public Door() { 
    ImageIcon ii = new ImageIcon("res/icons/dngn/doors/closed_door.png");
    image = ii.getImage(); 
  }
  
  public boolean open(){
    if(opened == false){
      opened = true;
      ImageIcon ii = new ImageIcon("res/icons/dngn/doors/open_door.png");
      image = ii.getImage(); 
    }
    return true;
  }
  
}
