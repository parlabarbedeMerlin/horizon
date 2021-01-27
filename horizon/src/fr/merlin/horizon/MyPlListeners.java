package fr.merlin.horizon;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MyPlListeners implements Listener {
	
	@EventHandler
	public void onBreak(BlockBreakEvent event) {
		Player player = event.getPlayer();
		Block block = event.getBlock();
		Material bs = block.getBlockData().getMaterial();
		
		
		
		
		ItemStack customesaphire = new ItemStack(Material.DIAMOND);
		ItemMeta cms = customesaphire.getItemMeta();
		cms.setDisplayName("§a[§9Saphir§a]");
		cms.addEnchant(Enchantment.MULTISHOT, 1, true);
		cms.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		customesaphire.setItemMeta(cms);
		
		
		
		ItemStack customerubi = new ItemStack(Material.DIAMOND);
		ItemMeta cmr = customerubi.getItemMeta();
		cmr.setDisplayName("§a[§cRubi§a]");
		cmr.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		cmr.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		customerubi.setItemMeta(cmr);
		
		
		
		ItemStack customeore = new ItemStack(Material.NETHERITE_SCRAP, 1);
		ItemMeta cm = customeore.getItemMeta();
		cm.setDisplayName("§a[§5Enderite Scrap§a]");
		cm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		cm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		customeore.setItemMeta(cm);
		
		
		
		ItemStack customeingt = new ItemStack(Material.NETHERITE_INGOT, 1);
		ItemMeta cmi = customeingt.getItemMeta();
		cmi.setDisplayName("§a[§5Enderite Ingot§a]");
		cmi.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		cmi.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		customeingt.setItemMeta(cmi);
		
		
		
		Random random = new Random();
		int ale = random.nextInt(10000);
		int ale2 = random.nextInt(400);	
		
		
		if (bs == Material.END_STONE ) {
			
			player.getInventory().addItem(new ItemStack(customeore));
			player.getInventory().addItem(new ItemStack(customeingt));
			
		}else if (((bs == Material.STONE) || (bs == Material.ANDESITE) || (bs == Material.DIORITE) || (bs == Material.GRANITE)) && (ale == 1)) {
			
			player.getInventory().addItem(new ItemStack(customesaphire));
			
		}else if (((bs == Material.STONE) || (bs == Material.ANDESITE) || (bs == Material.DIORITE) || (bs == Material.GRANITE)) && (ale2 == 1)) {
			
			player.getInventory().addItem(new ItemStack(customerubi));	
			
		}
	}
}