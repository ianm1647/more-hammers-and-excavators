package com.ianm1647.morehammersexcavators.item;

import com.ianm1647.morehammersexcavators.MoreHammersAndExcavators;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

public enum ToolMaterials implements ToolMaterial {
    //additionaladditions
    ROSE_GOLD(2, 900, 9.0F, 2.0F, 17,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    GILDED_NETHERITE(4, 2000, 9.0F, 2.0F, 24,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    //betterend
    THALLASIUM(2, 320, 7.0F, 1.5F, 12,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("betterend", "thallasium_ingot")))),
    TERMINITE(3, 1230, 8.5F, 3.0F, 14,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("betterend", "terminite_ingot")))),
    AETERNIUM(5, 2196, 10.0F, 4.5F, 18,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("betterend", "aeternium_ingot")))),

    //byg
    PENDORITE(5, 2500, 10.0F, 4.0F, 15,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("byg", "pendorite_ingot")))),

    //dragon loot
    DRAGON(5, 67*MoreHammersAndExcavators.CONFIG.dragonLootDurabilityMultiplier, 12.0F,
            MoreHammersAndExcavators.CONFIG.dragonBaseDamage, 20,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("drgaonloot", "dragon_scale")))),

    //enderite
    ENDERITE(4, 4096, 15.0F, 2.0F, 17,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("enderitemod", "enderite_ingot")))),

    //mythic metals
    ADAMANTITE(4, 1024, 7.0F, 5F, 16,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "adamantine_ingot")))),
    AQUARIUM(2, 455, 6.5F, 2.0F, 12,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "aquarium_ingot")))),
    BANGLUM(2, 260, 11.0F, 2.0F, 1,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "banglum_ingot")))),
    LEGENDARY_BANGLUM(3, 1040, 12.0F, 4.0F, 2,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "banglum_chunk")))),
    BRONZE(2, 624, 6.0F, 2.5F, 14,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "bronze_ingot")))),
    CARMOT(3, 730, 11.5F, 2.0F, 42,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "carmot_ingot")))),
    CELESTIUM(5, 2270, 16.9F, 6.0F, 26,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "celestium_ingot")))),
    COPPER(1, 125, 5.0F, 1.0F, 8,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    DURASTEEL(3, 800, 7.0F, 3.5F, 12,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "durasteel_ingot")))),
    HALLOWED(4, 1629, 12.0F, 5.0F, 20,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "hallowed_ingot")))),
    KYBER(3, 889, 7.0F, 2.5F, 20,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "kyber_ingot")))),
    METALLURGIUM(5, 3000, 15.0F, 8.0F, 30,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "metallurgium_ingot")))),
    MYTHRIL(4, 1024, 13.0F, 3.0F, 22,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "mythril_ingot")))),
    ORICHALCUM(4, 2048, 6.0F, 4.0F, 16,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "orichalcum_ingot")))),
    OSMIUM(3, 584, 7.0F, 2.0F, 13,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "osmium_ingot")))),
    PALLADIUM(4, 1234, 8.0F, 3.5F, 16,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "palladium_ingot")))),
    PROMETHEUM(3, 1572, 6.0F, 4.0F, 15,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "prometheum_ingot")))),
    QUADRILLUM(2, 321, 5.0F, 2.5F, 8,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "quadrillum_ingot")))),
    RUNITE(3, 1337, 8.9F, 3.3F, 17,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "runite_ingot")))),
    STAR_PLATINUM(3, 1300, 9.0F, 4.0F, 18,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "star_platinum")))),
    STORMYX(3, 1305, 8.0F, 3.5F, 20,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "stormyx_ingot"))));

    private final int miningLevel;
    private final int durability;
    private final float blockBreakSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ToolMaterials(int miningLevel, int durability, float blockBreakSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
        this.miningLevel = miningLevel;
        this.durability = durability;
        this.blockBreakSpeed = blockBreakSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    public int getDurability() {
        return this.durability * MoreHammersAndExcavators.CONFIG.toolDurabilityMultiplier;
    }

    public float getMiningSpeedMultiplier() {
        return this.blockBreakSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
