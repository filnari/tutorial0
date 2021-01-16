package org.filnari.tutorial0.setup;

import net.minecraft.world.World;

public class ServerProxy implements iProxy {

    @Override
    public void init() {

    }

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Only run this ");
    }
}
