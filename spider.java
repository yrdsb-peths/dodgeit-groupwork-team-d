import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class spider extends Actor
{
    public void act()
    {
        move(-10);
        
        if(getX() <= 0)
        {
            resetSpider();
        }
        
        if(isTouching(Hero.class))
        {
            Label gameEnd = new Label("Thanks for playing!",50);
            getWorld().addObject(gameEnd, 300, 350);
            
            gameOver skull = new gameOver();
            getWorld().addObject(skull, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetSpider()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(600, 100);
        } else {
            setLocation(600, 300);
        }
    }

}
