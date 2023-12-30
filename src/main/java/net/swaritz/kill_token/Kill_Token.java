package net.swaritz.kill_token;

import net.fabricmc.api.ModInitializer;

import net.swaritz.kill_token.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Kill_Token implements ModInitializer {
	public  static  String MOD_ID="kill_token";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world! My first mod :)");
		ModItems.registerModItems();
	}
}