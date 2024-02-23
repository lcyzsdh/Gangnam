package lcyzsdh.gangnam.data;

import lcyzsdh.gangnam.Gangnam;
import lcyzsdh.gangnam.registry.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }

    private String getItemName(Item item){

        return ForgeRegistries.ITEMS.getKey(item).getPath();
    }
    private void blockItem(Item item){
        String itemName=getItemName(item);
        withExistingParent(itemName,new ResourceLocation(Gangnam.MOD_ID,"block/"+itemName));
    }

    @Override
    protected void registerModels() {

        //Item models
        this.basicItem(ModItems.BAYBERRY.get());
        this.basicItem(ModItems.BAYBERRY_WINE.get());
        //this.basicItem(ModItems.FLOUR.get());
        this.basicItem(ModItems.LONGJING.get());
        this.basicItem(ModItems.BILUOCHUN.get());

        //Block item models
        this.blockItem(ModItems.BAYBERRY_LOG.get());
        this.blockItem(ModItems.BAYBERRY_LEAVES.get());
    }
}
