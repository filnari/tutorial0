package org.filnari.tutorial0.setup;

import net.minecraft.world.World;

public class ServerProxy implements iProxy {

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Only run this on the client!");
    }
}
