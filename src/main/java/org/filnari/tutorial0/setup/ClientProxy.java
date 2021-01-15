package org.filnari.tutorial0.setup;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

public class ClientProxy implements iProxy {

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
