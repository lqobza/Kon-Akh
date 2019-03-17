
package GameState;

import Main.GamePanel;
import TileMap.Background;
import TileMap.TileMap;
import java.awt.Color;

import java.awt.Graphics2D;




public class Level1State extends GameState{
    
    private TileMap tileMap;
    private Background bg;
    
    
    public Level1State(GameStateManager gsm)
    {
        this.gsm=gsm;
        
        init();
        
    }
    
    public void init(){
        bg = new Background("/Res/Backgrounds/city3.jpg",1);         
        tileMap = new TileMap(50);
        tileMap.loadTiles("/Res/Tilesets/tiles50px.png");
        tileMap.loadMap("/Res/Maps/ezaz.map");
        tileMap.setPosition(0, 0);
       
    
    }
    public void update(){}
    public void draw(Graphics2D g){
     bg.draw(g);
    
    
    
    tileMap.draw(g);
    }
    public void keyPressed(int k) {}
    public void keyReleased(int k) {}
    
}
