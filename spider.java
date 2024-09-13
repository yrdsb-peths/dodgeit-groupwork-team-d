import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class spider extends Actor
{
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
