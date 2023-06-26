package tk.jandev.crystalspeed;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Crystalspeed implements ModInitializer {
    
    public static final Logger LOGGER = LoggerFactory.getLogger("Crystal Zero Delay");
    @Override
    public void onInitialize() {
        LOGGER.info("Initialized successfully!");
    }
}
