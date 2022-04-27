import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class TileWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class TileWorld extends World
{
    static Actor hero;
    private int xOffset = 0;  
    private int SWIDTH = 600;//Ancho de pantalla 
    private int SHEIGHT = 400;//Alto de pantalla
    protected int TWIDTH = 25;//Ancho de tile  
    protected int THEIGHT = 25;//Alto de tile
    private int spawnX;
    private int spawnY;
    PortalTile salaArriba, salaAbajo, salaIzquierda, salaDerecha;
    private  String[][] WORLD;
    private Counter ingCount;

    /**
     * Constructor for objects of class TileWorld.
     * 
     */
    public TileWorld(String tiles[][], int sX, int sY,Counter ingCount)
    {    
        super(600, 400, 1, true);
        spawnX = sX;
        spawnY = sY;
        this.ingCount = ingCount;
        this.WORLD = tiles;
        createWorldFromTiles();     
        prepare();
    }
    
    private void createWorldFromTiles() {    
        for( int i=0; i < WORLD.length; i++ ) {      
            for( int j=0; j < SWIDTH/TWIDTH; j++ ) {        
                addActorAtTileLocation(WORLD[i][j], j, i);      
            }    
        }  
    }
    
    public void addActorAtTileLocation(String c, int x, int y){
        Actor tile = new NoColliderTile(); 
        //Actor tallo = new MiniShadowTile();
        switch(c) { 
            case "p01":
                tile.setImage("path_1.png");      
                break;
            case "p02":
                tile.setImage("path_2.png");      
                break;
            case "p03":
                tile.setImage("path_3.png");      
                break;
            case "p04":
                tile.setImage("path_4.png");      
                break;
            case "p05":
                tile.setImage("path_5.png");      
                break;
            case "p06":
                tile.setImage("path_6.png");      
                break;
            case "p07":
                tile.setImage("path_7.png");      
                break;
            case "p08":
                tile.setImage("path_8.png");      
                break;
            case "p09":
                tile.setImage("path_9.png");      
                break;
            case "p10":
                tile.setImage("path_10.png");      
                break;
            case "p11":
                tile.setImage("path_11.png");      
                break;
            case "p12":
                tile.setImage("path_12.png");      
                break;
            case "g01":
                tile.setImage("grass_1.png");      
                break;
            case "g02":
                tile.setImage("grass_2.png");      
                break;
            case "g03":
                tile.setImage("grass_3.png");      
                break;
            case "g04":
                tile.setImage("grass_4.png");      
                break; 
            case "M01":
                tile = new ColliderTile();
                tile.setImage("Muro.png");      
                break; 
            case "G01" :
                tile = new HidingTile();
                tile.setImage("tall_grass.png");
            }    
            if( tile != null)  
                addObject(tile, 12+x*TWIDTH, 12+y*THEIGHT);  
                //addObject(tallo,12+x*TWIDTH, 12+y*THEIGHT);
    }
    
    protected Counter getCounter(){
        return this.ingCount;
    }
    
    private void prepare() { 
        hero = new Heroe(6,2,"principal_enfrente.gif");
        addObject(hero,spawnX,spawnY);  
        hero = new Heroe(10,2,"principal_enfrente.gif");
        Actor ingrediente = new Ingrediente("objeto.png");
        addObject(hero,spawnX,spawnY);
        addObject(ingrediente,300,250);
        addObject(ingCount,100,40);

        //HaloTile haloTile = new HaloTile();
        //addObject(haloTile,spawnX - 8,spawnY + 5);
    }
}
