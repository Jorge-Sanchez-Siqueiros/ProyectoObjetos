import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * genera un halo de luz al rededor de cierta ubicacion 
 */
public class HaloTile extends NoColliderTile
{
    private int existe=1;
    private Heroe heroe = null;
   /**
    * Le modifica la transparencia y escala su tamaño
      */
    public HaloTile()
    {
        setImage("circulo_naranja.png");
        getImage().setTransparency(0);
        getImage().scale(60,50);
    }
    /**
     * verifica si hay un heroe en el mundo para empezar a seguirlo
       */
    public void act()
    {
        World mundo = getWorld();
        List<Heroe> heroe = (List<Heroe>)mundo.getObjects(Heroe.class); 
        if(heroe.size()>0)
        {
            setLocation(heroe.get(0).getX(),heroe.get(0).getY());
        }
    }
}
