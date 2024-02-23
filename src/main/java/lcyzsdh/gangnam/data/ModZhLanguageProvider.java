package lcyzsdh.gangnam.data;

import lcyzsdh.gangnam.Gangnam;
import lcyzsdh.gangnam.registry.ModBlocks;
import lcyzsdh.gangnam.registry.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModZhLanguageProvider extends LanguageProvider {
    public ModZhLanguageProvider(DataGenerator gen, String modid, String locale) {
        super(gen, modid, locale);
    }

    @Override
    protected void addTranslations() {

        this.add("itemGroup."+ Gangnam.MOD_ID,"江南");
        this.addItem(ModItems.BAYBERRY,"杨梅");
        this.addItem(ModItems.BAYBERRY_WINE,"杨梅烧酒");
        this.addItem(ModItems.BILUOCHUN,"碧螺春");
        this.addItem(ModItems.FLOUR,"面粉");
        this.addItem(ModItems.LONGJING,"龙井");

        this.addBlock(ModBlocks.BAYBERRY_LOG,"杨梅树原木");
        this.addBlock(ModBlocks.BAYBERRY_LEAVES,"杨梅树叶");


    }
}
