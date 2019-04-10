package ie.dit;

import processing.core.PApplet;

public class YASC extends PApplet
{
    AIShip s;
    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    public void keyReleased()
    {
        keys[keyCode] = false;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    
    public void settings()
    {
        size(800, 800);

    }

    public void setup()
    {
        s = new AIShip(this, width / 2, height / 2, 5, 50);
    }

    public void draw()
    {
        background(255);
        s.render();
        s.update();
    }


}