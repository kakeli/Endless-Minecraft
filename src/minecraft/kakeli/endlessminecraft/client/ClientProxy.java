package kakeli.endlessminecraft.client;

import net.minecraftforge.client.MinecraftForgeClient;
import kakeli.endlessminecraft.CommonProxy;

public class ClientProxy extends CommonProxy {
        
        @Override
        public void registerRenderers() {
                MinecraftForgeClient.preloadTexture(ITEMS_PNG);
                MinecraftForgeClient.preloadTexture(BLOCK_PNG);
        }
        
}