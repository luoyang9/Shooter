package xyz.charliezhang.shooter.entity.wave;

/**
 * Created by Charlie on 2015-11-24.
 */
public class WaveEnemy
{
    private int enemyCode;
    private float x;
    private float y;
    private float dx;
    private float dy;
    private int stop;
    private int delay;

    public WaveEnemy()
    {

    }

    public void setEnemyCode(int enemyCode) {this.enemyCode = enemyCode;}
    public void setX(float x) {this.x = x;}
    public void setY(float y) {this.y = y;}
    public void setDx(float dx) {this.dx = dx;}
    public void setDy(float dy) {this.dy = dy;}
    public void setStop(int stop) {this.stop = stop;}
    public void setDelay(int delay) {this.delay = delay;}

    public int getEnemyCode(){return enemyCode;}
    public float getX(){return x;}
    public float getY(){return y;}
    public float getDx(){return dx;}
    public float getDy(){return dy;}
    public int getStop(){return stop;}
    public int getDelay() {return delay;}
}