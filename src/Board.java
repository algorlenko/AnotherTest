
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.util.Random;

public class Board {
  
  MapItem levelPlan[][];
  MapItem roomFixtures[];
  MapItem loot[];
  int  tileWidth, tileHeight;
  public Board(int width, int height){
    tileWidth = width;
    tileHeight = height;
    levelPlan = new MapItem[tileWidth][tileHeight];
    initializeLevel();
  }
  
  private void initializeLevel(){
    for(int i=0; i<tileWidth; i++){
      for(int j=0; j<tileHeight; j++){
        Random rand = new Random();
        int n = rand.nextInt(10) + 1;
        if(n==1) levelPlan[i][j] = new Wall();
        if(n==2) levelPlan[i][j] = new CorridorFloor();
        if(n==3) levelPlan[i][j] = new Door();
        if(n==5) levelPlan[i][j] = new RoomFloor();
      }
    }
  }
  
  public void drawBoard(Graphics g, Dimension dimension) {
    
    Graphics2D g2d = (Graphics2D) g;
    int tileDisplayWidth = ((int)dimension.getWidth())/tileWidth;
    int tileDisplayHeight = ((int)dimension.getHeight())/tileHeight;
    MapItem wall1 = new Wall();
    for(int i=0; i<tileWidth; i++){
      for(int j=0; j<tileHeight; j++){
        if( levelPlan[i][j] != null ) g2d.drawImage(levelPlan[i][j].getImage(), tileDisplayWidth*i, tileDisplayHeight*j, tileDisplayWidth, tileDisplayHeight, null);
      }
    }
    
  }
}
