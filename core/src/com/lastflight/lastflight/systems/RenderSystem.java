package com.lastflight.lastflight.systems;

import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.Family;
import com.badlogic.ashley.systems.IntervalIteratingSystem;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.lastflight.lastflight.components.PositionComponent;
import com.lastflight.lastflight.components.RenderComponent;

public class RenderSystem extends IntervalIteratingSystem {
	
	Engine engine;
	
	SpriteBatch batch;
	
	public RenderSystem(SpriteBatch batch) {
		super(Family.getFor(RenderComponent.class, PositionComponent.class), 0);
		this.batch = batch;
	}

	@Override
	protected void processEntity(Entity entity) {
		RenderComponent comp = (RenderComponent)(entity.getComponent(RenderComponent.class));
		PositionComponent pos = (PositionComponent)(entity.getComponent(PositionComponent.class));
		batch.draw(comp.texture, (float)pos.x, (float)pos.y);
	}
}
