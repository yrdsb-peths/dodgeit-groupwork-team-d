import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class spider extends Actor
{
    /**
     * Act - do whatever the car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-4);
        
        if(getX() <= 0)
        {
            resetSpider();
        }
    }
    
    public void resetSpider()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(600, 300);
        } else {
            setLocation(600, 150);
        }
    }
}
