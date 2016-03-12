package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class AfterSchoolGame extends ApplicationAdapter {
	
	Hero player;
	SpriteBatch generalBatch;
	@Override
	public void create () {
		generalBatch = new SpriteBatch();
		player = new Hero(generalBatch);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(100, 100, 100, 100);
		player.render();
	} //hi hello wassup
}
