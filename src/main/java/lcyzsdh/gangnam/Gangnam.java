package lcyzsdh.gangnam;

import lcyzsdh.gangnam.init.CommonInit;
import lcyzsdh.gangnam.registry.ModBlocks;
import lcyzsdh.gangnam.registry.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;


@Mod(Gangnam.MOD_ID)
public class Gangnam {
    public static final String MOD_ID="gangnam";
    public static final Logger LOGGER= LogManager.getLogger();
    public static final CreativeModeTab CREATIVE_TAB=new CreativeModeTab(Gangnam.MOD_ID) {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BAYBERRY.get());
        }
    };
    public Gangnam(){
        final IEventBus modEventBus= FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(CommonInit::init);
        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
