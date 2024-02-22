package lcyzsdh.gangnam.registry;

import lcyzsdh.gangnam.Gangnam;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS=DeferredRegister.create(ForgeRegistries.BLOCKS, Gangnam.MOD_ID);

   // public static final RegistryObject<Block> BAYBERRY_LOG=BLOCKS.register("bayberry_log",()->new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));//TODO:add rotated block.
    //public static final RegistryObject<Block> BAYBERRY_LEAVES=BLOCKS.register("bayberry_leaves",()->new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LEAVES)));


}
