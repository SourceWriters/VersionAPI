package de.yellowphoenix18.versionapi.utils;

import org.bukkit.Bukkit;

import de.yellowphoenix18.versionapi.VersionAPI;

public class Pluginutils {
	
	public static int holo_int = 0;
	public static String version = "";
	
	public static void setUp() {
		version = getServerVersion();
		if(!version.equalsIgnoreCase("v1_8_R1") && !version.equalsIgnoreCase("v1_8_R2") && !version.equalsIgnoreCase("v1_8_R3") && !version.equalsIgnoreCase("v1_9_R1") &&
		   !version.equalsIgnoreCase("v1_9_R2") && !version.equalsIgnoreCase("v1_10_R1") && !version.equalsIgnoreCase("v1_11_R1")) {
			System.out.println("[VersionAPI] Your Spigot-Version is not supported, disabling VersionAPI...");
			Bukkit.getPluginManager().disablePlugin(VersionAPI.m);
		}
	}
	
	public static String getServerVersion() {
		String version = Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3];
		return version;
	}

}
