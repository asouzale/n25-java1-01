import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Definição da classe BeeWorld.
 * 
 * @author Leticia 
 * @version 2025-06-04
 */
public class BeeWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,91,332);
        Abelha abelha = new Abelha();
        addObject(abelha,77,150);
        Mosca mosca = new Mosca();
        addObject(mosca,484,171);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,454,299);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,268,83);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,257,364);
        Mosca mosca5 = new Mosca();
        addObject(mosca5,584,15);
        mosca.setLocation(492,362);
        mosca2.setLocation(548,307);
        mosca4.setLocation(480,296);
        mosca3.setLocation(414,320);
        mosca5.setLocation(419,382);
        mosca3.setLocation(83,454);
        mosca5.setLocation(72,501);
        mosca.setLocation(75,548);
        mosca4.setLocation(120,487);
        mosca2.setLocation(120,539);
        abelha.setLocation(84,152);
        mosca4.setLocation(662,384);
        mosca3.setLocation(494,114);
        mosca5.setLocation(275,366);
        mosca2.setLocation(507,521);
    }
}
