package de.yellowphoenix18.versionapi;

import org.bukkit.plugin.java.JavaPlugin;

import de.yellowphoenix18.versionapi.utils.Pluginutils;

public class VersionAPI extends JavaPlugin {
	
	public static VersionAPI m;
	
	public void onEnable() {
		m = this;
		Pluginutils.setUp();
	}
	
	public void onDisable() {
		
	}

}
