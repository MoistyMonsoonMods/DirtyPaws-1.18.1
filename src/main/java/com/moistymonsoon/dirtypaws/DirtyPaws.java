package com.moistymonsoon.dirtypaws;

import com.moistymonsoon.dirtypaws.core.init.BlockInit;
import com.moistymonsoon.dirtypaws.core.init.EntityInit;
import com.moistymonsoon.dirtypaws.core.init.ItemInit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DirtyPaws.MODID )
public class DirtyPaws {
	public static final String MODID = "dirtypaws";
	
	public DirtyPaws() {
		var bus = FMLJavaModLoadingContext.get().getModEventBus();

		BlockInit.BLOCKS.register(bus);
		ItemInit.ITEMS.register(bus);
		EntityInit.ENTITIES.register(bus);
	}
}
