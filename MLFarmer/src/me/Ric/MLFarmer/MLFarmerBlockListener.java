package me.Ric.MLFarmer;


import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockListener;

public class MLFarmerBlockListener extends BlockListener{
	MLFarmer plugin;

	public MLFarmerBlockListener(MLFarmer instance) {
		this.plugin = instance;
	}
    public void onBlockBreak(BlockBreakEvent event) {
        Block block = event.getBlock();
        if (block.getType() == Material.DIAMOND_ORE) {
        	Player player = event.getPlayer();
        }
 	}

    public void onBlockPlace(BlockBreakEvent event) {
        Block block = event.getBlock();
        if (block.getType() == Material.DIAMOND_ORE) {
        	Player player = event.getPlayer();
        }
 	}

}
