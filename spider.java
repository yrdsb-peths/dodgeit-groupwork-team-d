import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Spider extends Actor
{
    
    public void act()
    {
        move(-4);
        
        if(getX() <= 0)
        {
            resetSpider();
        }
        
        if(isTouching(Hero.class))
        {
            restart();
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

    public void restart()
    {
        Label gameEnd = new Label("Thanks for playing!" , 50);
        getWorld().addObject(gameEnd, 300, 200);
        
        GameOver skull = new GameOver();
        getWorld().addObject(skull, 300, 250);
        getWorld().removeObject(this);
        
    }
}
