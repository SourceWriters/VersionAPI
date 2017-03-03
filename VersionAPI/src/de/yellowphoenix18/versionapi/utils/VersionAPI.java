package de.yellowphoenix18.versionapi.utils;

import org.bukkit.entity.Player;

import de.yellowphoenix18.versionapi.versions.Version_1_10_R1;
import de.yellowphoenix18.versionapi.versions.Version_1_11_R1;
import de.yellowphoenix18.versionapi.versions.Version_1_8_R1;
import de.yellowphoenix18.versionapi.versions.Version_1_8_R2;
import de.yellowphoenix18.versionapi.versions.Version_1_8_R3;
import de.yellowphoenix18.versionapi.versions.Version_1_9_R1;
import de.yellowphoenix18.versionapi.versions.Version_1_9_R2;

public class VersionAPI {
	
	public static void sendTitle(Player player, Integer fadeIn, Integer stay, Integer fadeOut, String title, String subtitle) {
		if(Pluginutils.version.equalsIgnoreCase("v1_8_R1")) {
			Version_1_8_R1.sendTitle(player, fadeIn, stay, fadeOut, title, subtitle);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_8_R2")) {
			Version_1_8_R2.sendTitle(player, fadeIn, stay, fadeOut, title, subtitle);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_8_R3")) {
			Version_1_8_R3.sendTitle(player, fadeIn, stay, fadeOut, title, subtitle);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_9_R1")) {
			Version_1_9_R1.sendTitle(player, fadeIn, stay, fadeOut, title, subtitle);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_9_R2")) {
			Version_1_9_R2.sendTitle(player, fadeIn, stay, fadeOut, title, subtitle);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_10_R1")) {
			Version_1_10_R1.sendTitle(player, fadeIn, stay, fadeOut, title, subtitle);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_11_R1")) {
			Version_1_11_R1.sendTitle(player, fadeIn, stay, fadeOut, title, subtitle);
		}
    }


    public static void sendActionBar(Player p, String msg) {
		if(Pluginutils.version.equalsIgnoreCase("v1_8_R1")) {
			Version_1_8_R1.sendActionBar(p, msg);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_8_R2")) {
			Version_1_8_R2.sendActionBar(p, msg);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_8_R3")) {
			Version_1_8_R3.sendActionBar(p, msg);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_9_R1")) {
			Version_1_9_R1.sendActionBar(p, msg);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_9_R2")) {
			Version_1_9_R2.sendActionBar(p, msg);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_10_R1")) {
			Version_1_10_R1.sendActionBar(p, msg);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_11_R1")) {
			Version_1_11_R1.sendActionBar(p, msg);
		}
    }


    public static void sendHeaderAndFooter(Player p, String head, String foot) {
		if(Pluginutils.version.equalsIgnoreCase("v1_8_R1")) {
			Version_1_8_R1.sendHeaderAndFooter(p, head, foot);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_8_R2")) {
			Version_1_8_R2.sendHeaderAndFooter(p, head, foot);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_8_R3")) {
			Version_1_8_R3.sendHeaderAndFooter(p, head, foot);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_9_R1")) {
			Version_1_9_R1.sendHeaderAndFooter(p, head, foot);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_9_R2")) {
			Version_1_9_R2.sendHeaderAndFooter(p, head, foot);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_10_R1")) {
			Version_1_10_R1.sendHeaderAndFooter(p, head, foot);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_11_R1")) {
			Version_1_11_R1.sendHeaderAndFooter(p, head, foot);
		}
    }
	
	public static void respawn(Player p) {
		if(Pluginutils.version.equalsIgnoreCase("v1_8_R1")) {
			Version_1_8_R1.respawn(p);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_8_R2")) {
			Version_1_8_R2.respawn(p);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_8_R3")) {
			Version_1_8_R3.respawn(p);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_9_R1")) {
			Version_1_9_R1.respawn(p);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_9_R2")) {
			Version_1_9_R2.respawn(p);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_10_R1")) {
			Version_1_10_R1.respawn(p);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_11_R1")) {
			Version_1_11_R1.respawn(p);
		}
    }
	
	public static void setMotd(String motd) {
		if(Pluginutils.version.equalsIgnoreCase("v1_8_R1")) {
			Version_1_8_R1.changeMOTD(motd);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_8_R2")) {
			Version_1_8_R2.changeMOTD(motd);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_8_R3")) {
			Version_1_8_R3.changeMOTD(motd);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_9_R1")) {
			Version_1_9_R1.changeMOTD(motd);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_9_R2")) {
			Version_1_9_R2.changeMOTD(motd);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_10_R1")) {
			Version_1_10_R1.changeMOTD(motd);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_11_R1")) {
			Version_1_11_R1.changeMOTD(motd);
		}
    }

}
