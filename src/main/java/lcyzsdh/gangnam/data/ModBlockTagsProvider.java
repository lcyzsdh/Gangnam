package lcyzsdh.gangnam.data;

import lcyzsdh.gangnam.registry.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generator, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {
        this.addVanillaTags();
    }

    private void addVanillaTags(){

        tag(BlockTags.LOGS).add(
                ModBlocks.BAYBERRY_LOG.get()
        );
        tag(BlockTags.OVERWORLD_NATURAL_LOGS).add(
                ModBlocks.BAYBERRY_LOG.get()
        );
        tag(BlockTags.LOGS_THAT_BURN).add(
                ModBlocks.BAYBERRY_LOG.get()
        );
        tag(BlockTags.COMPLETES_FIND_TREE_TUTORIAL).add(
                ModBlocks.BAYBERRY_LOG.get()
        );
        tag(BlockTags.LEAVES).add(
                ModBlocks.BAYBERRY_LEAVES.get()
        );
    }
}
