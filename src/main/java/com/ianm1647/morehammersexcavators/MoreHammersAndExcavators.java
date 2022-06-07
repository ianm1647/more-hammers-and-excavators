package com.ianm1647.morehammersexcavators;

import com.ianm1647.morehammersexcavators.config.MoreHammersAndExcavatorsConfig;
import com.ianm1647.morehammersexcavators.registry.ItemRegistry;
import draylar.omegaconfig.OmegaConfig;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreHammersAndExcavators implements ModInitializer {
	public static final String MODID = "morehammersexcavators";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
	public static MoreHammersAndExcavatorsConfig CONFIG = OmegaConfig.register(MoreHammersAndExcavatorsConfig.class);
	public static final ItemGroup GROUP = FabricItemGroupBuilder.build(new Identifier(MODID, "group"), () -> new ItemStack(Items.DIAMOND_SWORD));

	@Override
	public void onInitialize() {
		ItemRegistry.registerHammers();
		ItemRegistry.registerExcavators();
	}
}
