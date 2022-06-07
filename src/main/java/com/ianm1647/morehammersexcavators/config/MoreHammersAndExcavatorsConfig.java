package com.ianm1647.morehammersexcavators.config;

import com.ianm1647.morehammersexcavators.MoreHammersAndExcavators;
import draylar.omegaconfig.api.Config;

public class MoreHammersAndExcavatorsConfig implements Config {
    public int dragonLootDurabilityMultiplier = 37;
    public float dragonBaseDamage = 5F;

    public int toolDurabilityMultiplier = 5;

    @Override
    public String getName() {
        return MoreHammersAndExcavators.MODID;
    }
}
