package com.faraazs.myfirstmod.item;

import com.faraazs.myfirstmod.MyFirstMod;
import com.faraazs.myfirstmod.block.BlockRegistry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MyFirstMod.MODID);

	public static final RegistryObject<Item> ITEM_COIN = ITEMS.register(ItemType.ITEM_COIN, () -> new Item(new Item.Properties().group(ItemGroup.MISC)));

	// Block Items
	public static final RegistryObject<Item> ITEM_COIN_BLOCK = ITEMS.register(ItemType.ITEM_COIN_BLOCK, () -> new BlockItem(BlockRegistry.COIN_BLOCK.get(), new Item.Properties().group(ItemGroup.MISC)));
}
