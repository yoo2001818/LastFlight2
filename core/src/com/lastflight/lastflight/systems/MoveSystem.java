package com.lastflight.lastflight.systems;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.Family;
import com.badlogic.ashley.systems.IntervalIteratingSystem;
import com.lastflight.lastflight.components.PositionComponent;

public class MoveSystem extends IntervalIteratingSystem {

	public MoveSystem() {
		super(Family.getFor(PositionComponent.class), 0);
	}
	
	@Override
	protected void processEntity(Entity entity) {
		PositionComponent comp = (PositionComponent)(entity.getComponent(PositionComponent.class));
		comp.x += 1;
	}

}
