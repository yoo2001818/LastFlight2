package com.lastflight.lastflight;

import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.lastflight.lastflight.components.PositionComponent;
import com.lastflight.lastflight.components.RenderComponent;
import com.lastflight.lastflight.systems.MoveSystem;
import com.lastflight.lastflight.systems.RenderSystem;

public class LastFlight extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	
	Engine engine;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		
		engine = new Engine();
		
		engine.addSystem(new RenderSystem(batch));
		engine.addSystem(new MoveSystem());
		
		Entity entity = new Entity();
		entity.add(new RenderComponent(new Texture("badlogic.jpg")));
		entity.add(new PositionComponent(0, 0));
		engine.addEntity(entity);
	
	}

	@Override
	public void render () {
		System.out.println("render");
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		engine.update(0);
		batch.end();
	}
}
