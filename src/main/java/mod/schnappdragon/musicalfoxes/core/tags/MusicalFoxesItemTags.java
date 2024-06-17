package mod.schnappdragon.musicalfoxes.core.tags;

import mod.schnappdragon.musicalfoxes.core.MusicalFoxes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class MusicalFoxesItemTags {
    public static final TagKey<Item> FOX_CAN_PLAY = makeTag("fox_can_play");

    private static TagKey<Item> makeTag(String id) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath(MusicalFoxes.MODID, id));
    }
}