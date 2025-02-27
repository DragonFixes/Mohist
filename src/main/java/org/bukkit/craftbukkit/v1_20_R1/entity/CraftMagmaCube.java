package org.bukkit.craftbukkit.v1_20_R1.entity;

import org.bukkit.craftbukkit.v1_20_R1.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.MagmaCube;

public class CraftMagmaCube extends CraftSlime implements MagmaCube {

    public CraftMagmaCube(CraftServer server, net.minecraft.world.entity.monster.MagmaCube entity) {
        super(server, entity);
    }

    @Override
    public net.minecraft.world.entity.monster.MagmaCube getHandle() {
        return (net.minecraft.world.entity.monster.MagmaCube) entity;
    }

    @Override
    public String toString() {
        return "CraftMagmaCube";
    }
}
