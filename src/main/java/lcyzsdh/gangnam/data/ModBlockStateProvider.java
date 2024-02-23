package lcyzsdh.gangnam.data;

import lcyzsdh.gangnam.registry.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        super(gen, modid, exFileHelper);
    }

    //register block's states and models together
    @Override
    protected void registerStatesAndModels() {

        this.logBlock((RotatedPillarBlock) ModBlocks.BAYBERRY_LOG.get());
        ConfiguredModel tmodel=new ConfiguredModel(this.models().singleTexture("bayberry_leaves",mcLoc("leaves"),"all",blockTexture(ModBlocks.BAYBERRY_LEAVES.get())));
        this.getVariantBuilder(ModBlocks.BAYBERRY_LEAVES.get())
                .partialState().setModels(tmodel);
    }
}
