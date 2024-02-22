package lcyzsdh.gangnam.data;

import lcyzsdh.gangnam.registry.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //Item models
        this.basicItem(ModItems.BAYBERRY.get());
        this.basicItem(ModItems.BAYBERRY_WINE.get());
        this.basicItem(ModItems.FLOUR.get());
        this.basicItem(ModItems.LONGJING.get());
        this.basicItem(ModItems.BILUOCHUN.get());

    }
}
