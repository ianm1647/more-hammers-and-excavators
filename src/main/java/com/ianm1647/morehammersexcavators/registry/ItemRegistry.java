package com.ianm1647.morehammersexcavators.registry;

import com.ianm1647.morehammersexcavators.MoreHammersAndExcavators;
import com.ianm1647.morehammersexcavators.item.ModExcavatorItem;
import com.ianm1647.morehammersexcavators.item.ModHammerItem;
import com.ianm1647.morehammersexcavators.item.ToolMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    private static final ItemGroup group = MoreHammersAndExcavators.GROUP;

    public static void registerHammers() {
       //if (FabricLoader.getInstance().isModLoaded("vanilla-hammers")) {
            if (FabricLoader.getInstance().isModLoaded("additionaladditions")) {
                hammerItem("rose_gold", ToolMaterials.ROSE_GOLD);
                fireproofHammerItem("gilded_netherite", ToolMaterials.GILDED_NETHERITE);
            }

            if (FabricLoader.getInstance().isModLoaded("betterend")) {
                hammerItem("thallasium", ToolMaterials.THALLASIUM);
                hammerItem("terminite", ToolMaterials.TERMINITE);
                fireproofHammerItem("aeternium", ToolMaterials.AETERNIUM);
            }

            if (FabricLoader.getInstance().isModLoaded("byg")) {
                hammerItem("pendorite", ToolMaterials.PENDORITE);
            }

            if (FabricLoader.getInstance().isModLoaded("dragonloot")) {
                fireproofHammerItem("dragon", ToolMaterials.DRAGON);
            }

            if (FabricLoader.getInstance().isModLoaded("enderitemod")) {
                fireproofHammerItem("enderite", ToolMaterials.ENDERITE);
            }

            //if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {
                hammerItem("adamantite", ToolMaterials.ADAMANTITE);
                hammerItem("aquarium", ToolMaterials.AQUARIUM);
                hammerItem("banglum", ToolMaterials.BANGLUM);
                hammerItem("bronze", ToolMaterials.BRONZE);
                hammerItem("carmot", ToolMaterials.CARMOT);
                hammerItem("celestium", ToolMaterials.CELESTIUM);
                hammerItem("copper", ToolMaterials.COPPER);
                hammerItem("durasteel", ToolMaterials.DURASTEEL);
                hammerItem("hallowed", ToolMaterials.HALLOWED);
                hammerItem("kyber", ToolMaterials.KYBER);
                hammerItem("legendary_banglum", ToolMaterials.LEGENDARY_BANGLUM);
                hammerItem("metallurgium", ToolMaterials.METALLURGIUM);
                hammerItem("mythril", ToolMaterials.MYTHRIL);
                hammerItem("orichalcum", ToolMaterials.ORICHALCUM);
                hammerItem("osmium", ToolMaterials.OSMIUM);
                fireproofHammerItem("palladium", ToolMaterials.PALLADIUM);
                hammerItem("prometheum", ToolMaterials.PROMETHEUM);
                hammerItem("quadrillum", ToolMaterials.QUADRILLUM);
                hammerItem("runite", ToolMaterials.RUNITE);
                hammerItem("star_platinum", ToolMaterials.STAR_PLATINUM);
                hammerItem("stormyx", ToolMaterials.STORMYX);
            //}
         //}
    }

    public static void registerExcavators() {
        //if (FabricLoader.getInstance().isModLoaded("vanillaexcavators")) {
            if (FabricLoader.getInstance().isModLoaded("additionaladditions")) {
                excavatorItem("rose_gold", ToolMaterials.ROSE_GOLD);
                fireproofExcavatorItem("gilded_netherite", ToolMaterials.GILDED_NETHERITE);
            }

            if (FabricLoader.getInstance().isModLoaded("betterend")) {
                excavatorItem("thallasium", ToolMaterials.THALLASIUM);
                excavatorItem("terminite", ToolMaterials.TERMINITE);
                fireproofExcavatorItem("aeternium", ToolMaterials.AETERNIUM);
            }

            if (FabricLoader.getInstance().isModLoaded("byg")) {
                excavatorItem("pendorite", ToolMaterials.PENDORITE);
            }

            if (FabricLoader.getInstance().isModLoaded("dragonloot")) {
                fireproofExcavatorItem("dragon", ToolMaterials.DRAGON);
            }

            if (FabricLoader.getInstance().isModLoaded("enderitemod")) {
                fireproofExcavatorItem("enderite", ToolMaterials.ENDERITE);
            }

            //if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {
                excavatorItem("adamantite", ToolMaterials.ADAMANTITE);
                excavatorItem("aquarium", ToolMaterials.AQUARIUM);
                excavatorItem("banglum", ToolMaterials.BANGLUM);
                excavatorItem("bronze", ToolMaterials.BRONZE);
                excavatorItem("carmot", ToolMaterials.CARMOT);
                excavatorItem("celestium", ToolMaterials.CELESTIUM);
                excavatorItem("copper", ToolMaterials.COPPER);
                excavatorItem("durasteel", ToolMaterials.DURASTEEL);
                excavatorItem("hallowed", ToolMaterials.HALLOWED);
                excavatorItem("kyber", ToolMaterials.KYBER);
                excavatorItem("legendary_banglum", ToolMaterials.LEGENDARY_BANGLUM);
                excavatorItem("metallurgium", ToolMaterials.METALLURGIUM);
                excavatorItem("mythril", ToolMaterials.MYTHRIL);
                excavatorItem("orichalcum", ToolMaterials.ORICHALCUM);
                excavatorItem("osmium", ToolMaterials.OSMIUM);
                fireproofExcavatorItem("palladium", ToolMaterials.PALLADIUM);
                excavatorItem("prometheum", ToolMaterials.PROMETHEUM);
                excavatorItem("quadrillum", ToolMaterials.QUADRILLUM);
                excavatorItem("runite", ToolMaterials.RUNITE);
                excavatorItem("star_platinum", ToolMaterials.STAR_PLATINUM);
                excavatorItem("stormyx", ToolMaterials.STORMYX);
            //}
        //}
    }

    private static void hammerItem(String name, ToolMaterial material) {
        Registry.register(Registry.ITEM, new Identifier(MoreHammersAndExcavators.MODID, name + "_hammer"),
                new ModHammerItem(material, new FabricItemSettings().group(group)));
    }

    private static void fireproofHammerItem(String name, ToolMaterial material) {
        Registry.register(Registry.ITEM, new Identifier(MoreHammersAndExcavators.MODID, name + "_hammer"),
                new ModHammerItem(material, new FabricItemSettings().group(group).fireproof()));
    }

    private static void excavatorItem(String name, ToolMaterial material) {
        Registry.register(Registry.ITEM, new Identifier(MoreHammersAndExcavators.MODID, name + "_excavator"),
                new ModExcavatorItem(material, new FabricItemSettings().group(group)));
    }

    private static void fireproofExcavatorItem(String name, ToolMaterial material) {
        Registry.register(Registry.ITEM, new Identifier(MoreHammersAndExcavators.MODID, name + "_excavator"),
                new ModExcavatorItem(material, new FabricItemSettings().group(group).fireproof()));
    }
}
