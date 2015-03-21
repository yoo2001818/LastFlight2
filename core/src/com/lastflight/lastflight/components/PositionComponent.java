package com.lastflight.lastflight.components;

import com.badlogic.ashley.core.Component;

public class PositionComponent extends Component {
	public double x = 0;
	public double y = 0;
	
	public PositionComponent(double x, double y) {
		this.x = x;
		this.y = y;
	}
}
