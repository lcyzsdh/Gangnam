package lcyzsdh.gangnam.registry;

import lcyzsdh.gangnam.Gangnam;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS=DeferredRegister.create(ForgeRegistries.BLOCKS, Gangnam.MOD_ID);

    private static RotatedPillarBlock log(MaterialColor pTopColor, MaterialColor pBarkColor) {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, (pState) -> {
            return pState.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? pTopColor : pBarkColor;
        }).strength(2.0F).sound(SoundType.WOOD));
    }


    private static boolean never(BlockState state, BlockGetter getter, BlockPos pos) {
        return false;
    }
    private static LeavesBlock leaves(){
        return new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().noOcclusion().isViewBlocking(ModBlocks::never));
    }//TODO:from vanilla

    public static final RegistryObject<Block> BAYBERRY_LOG=BLOCKS.register("bayberry_log",()->log(MaterialColor.DIRT, MaterialColor.PODZOL));
    public static final RegistryObject<Block> BAYBERRY_LEAVES=BLOCKS.register("bayberry_leaves",ModBlocks::leaves);
    //public static final RegistryObject<Block> BAMBOO_SHELF=BLOCKS.register("bamboo_shelf", BambooShelf::new);
}
