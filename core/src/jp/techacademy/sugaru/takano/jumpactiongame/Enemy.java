package jp.techacademy.sugaru.takano.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;

public class Enemy extends GameObject{
    public static final float ENEMY_WIDTH = 1.0f;
    public static final float ENEMY_HEIGHT = 1.0f;

    public Enemy(Texture texture,int srcX,int srcY,int srcWidth,int srcHeight){
        super(texture,srcX,srcY,srcWidth,srcHeight);
        setSize(ENEMY_WIDTH,ENEMY_HEIGHT);
    }
}
