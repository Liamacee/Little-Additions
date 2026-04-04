package net.liamacee.littleadditions;

import java.util.List;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.ModConfigSpec;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Neo's config APIs
public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();


    public static final ModConfigSpec.IntValue TINY_COAL_BURN_TIME = BUILDER
            .comment("How long does the Tiny Coal burn (In Ticks)")
            .defineInRange("tinyCoalBurnTime", 200, 0, Integer.MAX_VALUE);
    public static final ModConfigSpec.IntValue TINY_CHARCOAL_BURN_TIME = BUILDER
            .comment("How long does the Tiny Charcoal burn (In Ticks)")
            .defineInRange("tinyCharcoalBurnTime", 200, 0, Integer.MAX_VALUE);

    static final ModConfigSpec SPEC = BUILDER.build();
}
