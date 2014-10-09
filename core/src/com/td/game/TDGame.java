package com.td.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TDGame extends ApplicationAdapter {
	
	SpriteBatch spriteBatch;
    BitmapFont font;
    CharSequence str = "Hello World!";
	
	@Override
	public void create () {        
        spriteBatch = new SpriteBatch();
        font = new BitmapFont();
	}

	@Override
	public void render () {
		spriteBatch.begin();
        font.draw(spriteBatch, str, 10, 20);
        spriteBatch.end();
	}
}
