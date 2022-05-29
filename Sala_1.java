import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sala_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sala_1 extends TileWorld
{
    //private Actor halo;
    /**
     * Constructor for objects of class Sala_1.
     * 
     */
    public Sala_1(int d)
    {
        super(ListaDeMundoTiles.TilesMundo1(), 100, 300,new Counter("Ingredientes:"),d);   
        salaArriba = new PortalTile(0);
        addObject(salaArriba,300,1);
        salaDerecha = new PortalTile(1);
        addObject(salaDerecha,600,200);
        salaIzquierda = new PortalTile(1);
        addObject(salaIzquierda,1,150);
    }
    
    public Sala_1(int spawnX, int spawnY,Counter count)
    {
        super(ListaDeMundoTiles.TilesMundo1(), spawnX, spawnY,count,0);   
        salaArriba = new PortalTile(0);
        addObject(salaArriba,300,1);
        salaDerecha = new PortalTile(1);
        addObject(salaDerecha,600,200);
        salaIzquierda = new PortalTile(1);
        addObject(salaIzquierda,1,150);
    }

    public void act(){
        if(this.getObjects(Heroe.class).isEmpty()!=true){
            if(salaArriba.isHeroOn()){
                World world = new Sala_0(300,390,super.getCounter(),false);
                Greenfoot.setWorld(world);
            } 
            if(salaDerecha.isHeroOn()){
                World world = new Sala_2(10,150,super.getCounter());
                Greenfoot.setWorld(world);
            } 
            if(salaIzquierda.isHeroOn()){       
                World world = new sala_5(570,200,super.getCounter());
                Greenfoot.setWorld(world);
            }
        }
        
    }
    
    @Override
    public void prepareIndividual() 
    { 
        Actor ingrediente = new Ingrediente("objeto.png");
        addObject(ingrediente,300,250);
        Actor enemigo1 = new Enemy(ListaDeSprites.enemigo1,200,1,0,100,100);
        Actor enemigo2 = new Enemy(ListaDeSprites.pirata,200,0,1,500,100);
        addObject(enemigo1,100,100);
        addObject(enemigo2,500,100);
    }
}

