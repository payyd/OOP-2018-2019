package ie.dit;

import java.util.ArrayList;
import processing.core.PVector;

public class AIShip
{
    private PVector pos;
    private PVector forward;
    private float speed;
    private float size;
    private YASC yasc;

    private float rotation;

    private ArrayList<PVector> waypoints = new ArrayList<PVector>(); 

    public AIShip(YASC yasc, float x, float y, float speed, float size)
    {
        this.yasc = yasc;
        pos = new PVector(x, y);
        forward = new PVector(0, -1);
        this.speed = speed;
        this.size = size;

        for(int i = 0 ; i < 5 ; i ++)
        {
            waypoints.add(new PVector(yasc.random(0, yasc.width), yasc.random(0, yasc.height)));
        }
    }

    public void render()
    {
        yasc.pushMatrix();
        yasc.translate(pos.x, pos.y);
        yasc.rotate(rotation);
        
        float halfSize = size / 2;
        yasc.line(- halfSize, halfSize, 0, - halfSize);
        yasc.line(0, - halfSize
        , halfSize, halfSize);

        yasc.line(halfSize, halfSize
            ,0, 0);
        yasc.line(0, 0, -halfSize, halfSize);
        yasc.popMatrix();
    }

    public void update()
    {
        forward.x = (float) Math.sin(rotation);
        forward.y = - (float) Math.cos(rotation);
        if (yasc.checkKey('w'))
        {
            pos.x += forward.x;
            pos.y += forward.y;
        }

        if (yasc.checkKey('s'))
        {
            pos.x -= forward.x;
            pos.y -= forward.y;
        }

        if (yasc.checkKey('a'))
        {
            rotation -= 0.1f;
        }

        if (yasc.checkKey('d'))
        {
            rotation += 0.1f;
        }
    }


    /**
     * @return the pos
     */
    public PVector getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(PVector pos) {
        this.pos = pos;
    }

    /**
     * @return the speed
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(float speed) {
        this.speed = speed;
    }

    /**
     * @return the size
     */
    public float getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    

	/**
	 * @return the yasc
	 */
	public YASC getYasc() {
		return yasc;
	}

	/**
	 * @param yasc the yasc to set
	 */
	public void setYasc(YASC yasc) {
		this.yasc = yasc;
    }
    public void setSize(float size) {
        this.size = size;
    }

    
}