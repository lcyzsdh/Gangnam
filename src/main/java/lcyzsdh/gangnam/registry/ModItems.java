package lcyzsdh.gangnam.registry;

import lcyzsdh.gangnam.Gangnam;
import lcyzsdh.gangnam.utils.ModFoodValues;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
public class ModItems {
    public static final DeferredRegister<Item> ITEMS=DeferredRegister.create(ForgeRegistries.ITEMS, Gangnam.MOD_ID);

    private static Item.Properties normalItem(){
        return new Item.Properties().tab(Gangnam.CREATIVE_TAB);
    }

    private static Item.Properties foodItem(FoodProperties foodProperties){
        return new Item.Properties().food(foodProperties).tab(Gangnam.CREATIVE_TAB);
    }

    //items
    public static final RegistryObject<Item> BAYBERRY=ITEMS.register("bayberry",()->new Item(normalItem()));
    public static final RegistryObject<Item> BAYBERRY_WINE=ITEMS.register("bayberry_wine",()->new Item(foodItem(ModFoodValues.BAYBERRY_WINE)));
    public static final RegistryObject<Item> FLOUR= ITEMS.register("flour",()->new Item(normalItem()));
    public static final RegistryObject<Item> LONGJING=ITEMS.register("longjing",()->new Item(normalItem()));
    public static final RegistryObject<Item> BILUOCHUN=ITEMS.register("biluochun",()->new Item(normalItem()));
    public static final RegistryObject<Item> CHINA_BOWL=ITEMS.register("china_bowl",()->new Item(normalItem()));
    //public static final RegistryObject<Item> CHINA_VASE=ITEMS.register("china_vase",()->new Item(normalItem()));
    public static final RegistryObject<Item> CHOPSTICKS=ITEMS.register("chopsticks",()->new Item(normalItem()));
    public static final RegistryObject<Item> PORK_BALL=ITEMS.register("pork_ball",()->new Item(normalItem()));
    public static final RegistryObject<Item> RAW_PORK_BALL=ITEMS.register("raw_pork_ball",()->new Item(normalItem()));
    public static final RegistryObject<Item> BEEF_BALL=ITEMS.register("beef_ball",()->new Item(normalItem()));
    public static final RegistryObject<Item> RAW_BEEF_BALL=ITEMS.register("raw_beef_ball",()->new Item(normalItem()));
    public static final RegistryObject<Item> DRIED_FISH=ITEMS.register("dried_fish",()->new Item(normalItem()));

    //blocks
    public static final RegistryObject<Item> BAYBERRY_LOG=ITEMS.register("bayberry_log",()->new BlockItem(ModBlocks.BAYBERRY_LOG.get(),normalItem()));
    public static final RegistryObject<Item> BAYBERRY_LEAVES=ITEMS.register("bayberry_leaves",()->new BlockItem(ModBlocks.BAYBERRY_LEAVES.get(),normalItem()));
}
