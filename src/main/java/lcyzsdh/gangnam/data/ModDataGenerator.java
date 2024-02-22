package lcyzsdh.gangnam.data;

import lcyzsdh.gangnam.Gangnam;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gangnam.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator=event.getGenerator();
        ExistingFileHelper fileHelper=event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new ModZhLanguageProvider(generator,Gangnam.MOD_ID,"zh_cn"));
        generator.addProvider(event.includeClient(),new ModItemModelProvider(generator,Gangnam.MOD_ID,fileHelper));
        //generator.addProvider(event.includeClient(), new ModBlockStateProvider(generator,Gangnam.MOD_ID,fileHelper));
        //generator.addProvider();
    }
}
