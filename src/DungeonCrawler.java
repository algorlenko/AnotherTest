

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;

public class DungeonCrawler extends JPanel {
  
  Board board = new Board(40,20);
  //MapItem wall1 = new Wall();
  public DungeonCrawler() {
    addKeyListener(new KeyListener() {
      @Override
      public void keyTyped(KeyEvent e) {
      }
      
      @Override
      public void keyReleased(KeyEvent e) {
        
      }
      
      @Override
      public void keyPressed(KeyEvent e) {
        
      }
    });
    setFocusable(true);
    setPreferredSize(new Dimension(1280, 640));
  }
  
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    doDrawing(g);
  }
  
  private void doDrawing(Graphics g) {
    
    Graphics2D g2d = (Graphics2D) g;
    //MapItem
    //g2d.drawImage(wall1.getImage(), 0, 0, this);
    board.drawBoard(g, this.getSize());
  }
  
  public static void main(String[] args) throws InterruptedException {
    JFrame frame = new JFrame("Dungeon Crawler");
    DungeonCrawler game = new DungeonCrawler();
    frame.add(game);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    while (true) {
      game.repaint();
      //System.out.println(frame.getSize());
      Thread.sleep(500);
    }
  }
}