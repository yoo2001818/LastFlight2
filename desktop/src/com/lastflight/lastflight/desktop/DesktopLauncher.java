package com.lastflight.lastflight.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.lastflight.lastflight.LastFlight;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "마지막 비행";
		config.useGL30 = false;
		config.width = 1280;
		config.height = 720;
		new LwjglApplication(new LastFlight(), config);
	}
}
