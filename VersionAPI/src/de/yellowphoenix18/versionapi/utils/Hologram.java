package de.yellowphoenix18.versionapi.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import de.yellowphoenix18.versionapi.VersionAPI;
import de.yellowphoenix18.versionapi.versions.Version_1_10_R1;
import de.yellowphoenix18.versionapi.versions.Version_1_11_R1;
import de.yellowphoenix18.versionapi.versions.Version_1_8_R1;
import de.yellowphoenix18.versionapi.versions.Version_1_8_R2;
import de.yellowphoenix18.versionapi.versions.Version_1_8_R3;
import de.yellowphoenix18.versionapi.versions.Version_1_9_R1;
import de.yellowphoenix18.versionapi.versions.Version_1_9_R2;

public class Hologram {
	 
    private int holo = 0;
    private String[] Text;
    private Location location;
    private double DISTANCE = 0.25D;
    int count;

    public Hologram(String[] Text, Location location) {
            this.Text = Text;
            this.location = location;
            this.holo = Pluginutils.holo_int;
            Pluginutils.holo_int++;
            create();
    }

   
    public void showPlayerTemp(final Player p,int Time){
        showPlayer(p);
            Bukkit.getScheduler().runTaskLater(VersionAPI.m, new Runnable() {
                    public void run() {
                    hidePlayer(p);
                    }
            }, Time);
    }
   
   
    public void showAllTemp(int Time){
            showAll();
            Bukkit.getScheduler().runTaskLater(VersionAPI.m, new Runnable() {
                    public void run() {
                    hideAll();
                    }
            }, Time);
    }
   
    public void showPlayer(Player p) {
		if(Pluginutils.version.equalsIgnoreCase("v1_8_R1")) {
			Version_1_8_R1.HoloshowPlayer(p, holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_8_R2")) {
			Version_1_8_R2.HoloshowPlayer(p, holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_8_R3")) {
			Version_1_8_R3.HoloshowPlayer(p, holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_9_R1")) {
			Version_1_9_R1.HoloshowPlayer(p, holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_9_R2")) {
			Version_1_9_R2.HoloshowPlayer(p, holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_10_R1")) {
			Version_1_10_R1.HoloshowPlayer(p, holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_11_R1")) {
			Version_1_11_R1.HoloshowPlayer(p, holo);
		}
    }

    public void hidePlayer(Player p) {
		if(Pluginutils.version.equalsIgnoreCase("v1_8_R1")) {
			Version_1_8_R1.HolohidePlayer(p, holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_8_R2")) {
			Version_1_8_R2.HolohidePlayer(p, holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_8_R3")) {
			Version_1_8_R3.HolohidePlayer(p, holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_9_R1")) {
			Version_1_9_R1.HolohidePlayer(p, holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_9_R2")) {
			Version_1_9_R2.HolohidePlayer(p, holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_10_R1")) {
			Version_1_10_R1.HolohidePlayer(p, holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_11_R1")) {
			Version_1_11_R1.HolohidePlayer(p, holo);
		}
    }

    public void showAll() {
		if(Pluginutils.version.equalsIgnoreCase("v1_8_R1")) {
			Version_1_8_R1.HoloshowAll(holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_8_R2")) {
			Version_1_8_R2.HoloshowAll(holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_8_R3")) {
			Version_1_8_R3.HoloshowAll(holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_9_R1")) {
			Version_1_9_R1.HoloshowAll(holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_9_R2")) {
			Version_1_9_R2.HoloshowAll(holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_10_R1")) {
			Version_1_10_R1.HoloshowAll(holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_11_R1")) {
			Version_1_11_R1.HoloshowAll(holo);
		}
    }

    public void hideAll() {
		if(Pluginutils.version.equalsIgnoreCase("v1_8_R1")) {
			Version_1_8_R1.HolohideAll(holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_8_R2")) {
			Version_1_8_R2.HolohideAll(holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_8_R3")) {
			Version_1_8_R3.HolohideAll(holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_9_R1")) {
			Version_1_9_R1.HolohideAll(holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_9_R2")) {
			Version_1_9_R2.HolohideAll(holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_10_R1")) {
			Version_1_10_R1.HolohideAll(holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_11_R1")) {
			Version_1_10_R1.HolohideAll(holo);
		}
    }

    private void create() {
		if(Pluginutils.version.equalsIgnoreCase("v1_8_R1")) {
			Version_1_8_R1.create(Text, location, DISTANCE, holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_8_R2")) {
			Version_1_8_R2.create(Text, location, DISTANCE, holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_8_R3")) {
			Version_1_8_R3.create(Text, location, DISTANCE, holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_9_R1")) {
			Version_1_9_R1.create(Text, location, DISTANCE, holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_9_R2")) {
			Version_1_9_R2.create(Text, location, DISTANCE, holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_10_R1")) {
			Version_1_10_R1.create(Text, location, DISTANCE, holo);
		} else if(Pluginutils.version.equalsIgnoreCase("v1_11_R1")) {
			Version_1_11_R1.create(Text, location, DISTANCE, holo);
		}
    }
}
