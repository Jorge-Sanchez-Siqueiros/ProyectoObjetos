import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor
{
    private String image,first,second;
    private int difficulty;
    
    public Button(String s, int d){
        difficulty=d;
        setImage(s);
    }
    
    public void act()
    {
        handleMouseClicks();
    }
    
    private void handleMouseClicks(){
        if(Greenfoot.mousePressed(this)){
            clickedAction();
        }
        /*if(Greenfoot.mousePressed(this)){
            setImage(s);
        }
        else if(Greenfoot.mouseClicked(this)){
            setImage(first);
            clickedAction();
        }*/
    }
    
    public void clickedAction()
    {
        if(difficulty==1)
        {
            Dificultad.RadioBusqueda=80;
            Dificultad.velocidadX=1;
            Dificultad.velocidadY=1;
            Dificultad.vidaHeroe=10;
            Dificultad.nivelDificultad=1;
        }
        if(difficulty==2)
        {
            Dificultad.RadioBusqueda=100;
            Dificultad.velocidadX=2;
            Dificultad.velocidadY=1;
            Dificultad.vidaHeroe=6;
            Dificultad.nivelDificultad=2;
        }
        if(difficulty==3)
        {
            Dificultad.RadioBusqueda=130;
            Dificultad.velocidadX=1;
            Dificultad.velocidadY=2;
            Dificultad.vidaHeroe=2;
            Dificultad.nivelDificultad=3;
        }
        World world = new Sala_1(1);
        Greenfoot.setWorld(world);
    }
}