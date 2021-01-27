package fr.merlin.horizon;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new MyPlListeners(), this);
	}
	
	@Override
	public void onDisable() {
		System.out.println("\u001B[31m"+"[WARN] le plugin "+"\u001B[32m"+" Hrizon"+"\u001B[31m"+" est off");
	}

}
