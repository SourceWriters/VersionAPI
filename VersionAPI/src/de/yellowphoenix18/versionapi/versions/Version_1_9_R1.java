package de.yellowphoenix18.versionapi.versions;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_9_R1.CraftServer;
import org.bukkit.craftbukkit.v1_9_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_9_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import de.yellowphoenix18.versionapi.VersionAPI;
import net.minecraft.server.v1_9_R1.EntityArmorStand;
import net.minecraft.server.v1_9_R1.EntityPlayer;
import net.minecraft.server.v1_9_R1.PacketPlayInClientCommand;
import net.minecraft.server.v1_9_R1.PacketPlayOutEntityDestroy;
import net.minecraft.server.v1_9_R1.PacketPlayOutSpawnEntityLiving;
import net.minecraft.server.v1_9_R1.PacketPlayInClientCommand.EnumClientCommand;
import net.minecraft.server.v1_9_R1.IChatBaseComponent;
import net.minecraft.server.v1_9_R1.PacketPlayOutChat;
import net.minecraft.server.v1_9_R1.PacketPlayOutPlayerListHeaderFooter;
import net.minecraft.server.v1_9_R1.PacketPlayOutTitle;
import net.minecraft.server.v1_9_R1.PlayerConnection;
import net.minecraft.server.v1_9_R1.PacketPlayOutTitle.EnumTitleAction;

public class Version_1_9_R1 {
	
	public static HashMap<Integer, List<EntityArmorStand>> all_ents = new HashMap<Integer, List<EntityArmorStand>>();
	
	public static void respawn(Player p) {
		Bukkit.getScheduler().scheduleSyncDelayedTask(VersionAPI.m, new Runnable() {
			@Override
			public void run() {
				PacketPlayInClientCommand packet = new PacketPlayInClientCommand(EnumClientCommand.PERFORM_RESPAWN);
				((CraftPlayer)p).getHandle().playerConnection.a(packet);						
			}					
		}, 1);
	}
	
	public static void changeMOTD(String motd) {
		((CraftServer)Bukkit.getServer()).getServer().setMotd(motd);
	}
	
	public static int getPing(Player p) { 
		CraftPlayer cp = (CraftPlayer) p; 
		EntityPlayer ep = cp.getHandle(); 
		return ep.ping;
	}     
	
	/*###############
	 *    Hologram
	  ############### */
    public static void HoloshowPlayer(Player p, int id) {
		List<EntityArmorStand> entitylist = all_ents.get(id);
            for (EntityArmorStand armor : entitylist) {
                    PacketPlayOutSpawnEntityLiving packet = new PacketPlayOutSpawnEntityLiving(armor);
                    ((CraftPlayer) p).getHandle().playerConnection.sendPacket(packet);
            }
    }

    public static void HolohidePlayer(Player p, int id) {
		List<EntityArmorStand> entitylist = all_ents.get(id);
            for (EntityArmorStand armor : entitylist) {
                    PacketPlayOutEntityDestroy packet = new PacketPlayOutEntityDestroy(armor.getId());
                    ((CraftPlayer) p).getHandle().playerConnection.sendPacket(packet);

            }
    }

    public static void HoloshowAll(int id) {
    		List<EntityArmorStand> entitylist = all_ents.get(id);
            for (Player player : Bukkit.getOnlinePlayers()) {
                    for (EntityArmorStand armor : entitylist) {
                            PacketPlayOutSpawnEntityLiving packet = new PacketPlayOutSpawnEntityLiving(armor);
                            ((CraftPlayer) player).getHandle().playerConnection.sendPacket(packet);
                    }
            }
    }
    
    public static void HolohideAll(int id) {
		List<EntityArmorStand> entitylist = all_ents.get(id);
            for (Player player : Bukkit.getOnlinePlayers()) {
                    for (EntityArmorStand armor : entitylist) {
                            PacketPlayOutEntityDestroy packet = new PacketPlayOutEntityDestroy(armor.getId());
                            ((CraftPlayer) player).getHandle().playerConnection.sendPacket(packet);
                    }
            }
    }
    
    public static void create(String[] txt, Location loc, double distance, int id) {
    	List<EntityArmorStand> entitylist = new ArrayList<EntityArmorStand>();
    	if(all_ents.containsKey(id)) {
    		entitylist = all_ents.get(id);
    	}
            for (String Text : txt) {
                    EntityArmorStand entity = new EntityArmorStand(((CraftWorld) loc.getWorld()).getHandle(),loc.getX(), loc.getY(),loc.getZ());
                    entity.setCustomName(Text);
                    entity.setCustomNameVisible(true);
                    entity.setInvisible(true);
                    entity.setGravity(false);
                    
                    entitylist.add(entity);
                    loc.subtract(0, distance, 0);
            }
            all_ents.put(id, entitylist);
    }
	
	/* #########
	 * TitleAPI
	   ######### */
	public static void sendTitle(Player player, Integer fadeIn, Integer stay, Integer fadeOut, String title, String subtitle) {
        PlayerConnection connection = ((CraftPlayer)player).getHandle().playerConnection;

        PacketPlayOutTitle packetPlayOutTimes = new PacketPlayOutTitle(EnumTitleAction.TIMES, null, fadeIn.intValue(), stay.intValue(), fadeOut.intValue());
        connection.sendPacket(packetPlayOutTimes);
        if (subtitle != null) {
            IChatBaseComponent titleSub = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + subtitle + "\"}");
            PacketPlayOutTitle packetPlayOutSubTitle = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.SUBTITLE, titleSub);
            connection.sendPacket(packetPlayOutSubTitle);
        }
        if (title != null) {
            IChatBaseComponent titleMain = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + title + "\"}");
            PacketPlayOutTitle packetPlayOutTitle = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TITLE, titleMain);
            connection.sendPacket(packetPlayOutTitle);
        }
    }


    public static void sendActionBar(Player p, String msg) {
        IChatBaseComponent cbc = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + msg + "\"}");
        PacketPlayOutChat ppoc = new PacketPlayOutChat(cbc, (byte)2);
        ((CraftPlayer)p).getHandle().playerConnection.sendPacket(ppoc);
    }


    public static void sendHeaderAndFooter(Player p, String head, String foot) {
        PlayerConnection connection = ((CraftPlayer)p).getHandle().playerConnection;
        IChatBaseComponent header = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + head + "\"}");
        IChatBaseComponent footer = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + foot + "\"}");
        PacketPlayOutPlayerListHeaderFooter packet = new PacketPlayOutPlayerListHeaderFooter();
        try {
            Field headerField = packet.getClass().getDeclaredField("a");
            headerField.setAccessible(true);
            headerField.set(packet, header);
            headerField.setAccessible(!headerField.isAccessible());


            Field footerField = packet.getClass().getDeclaredField("b");
            footerField.setAccessible(true);
            footerField.set(packet, footer);
            footerField.setAccessible(!footerField.isAccessible());
        } catch (Exception e) {
            e.printStackTrace();
        }
        connection.sendPacket(packet);
    }
}
