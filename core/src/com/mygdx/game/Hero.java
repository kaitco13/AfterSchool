package com.mygdx.game;

//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Hero {
	private Sprite sprite;
	private Texture img;
	private SpriteBatch batch;
	public Hero(SpriteBatch batch){
		img = new Texture("Image.jpg");
		sprite = new Sprite(img,0,0,64,64);
		sprite.setPosition(240, 120);
		this.batch = batch;
	}
	public void render() {
		batch.begin();
		sprite.draw(batch);
		batch.end();
	}

}
