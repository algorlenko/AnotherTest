
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Wall extends MapItem {
  
  public Wall() { 
        ImageIcon ii = new ImageIcon("resources/icons/dngn/wall/crystal_wall00.png");
        image = ii.getImage(); 
  }  
}
