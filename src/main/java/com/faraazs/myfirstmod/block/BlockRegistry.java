package com.faraazs.myfirstmod.block;

import com.faraazs.myfirstmod.MyFirstMod;
import com.faraazs.myfirstmod.block.types.CoinBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MyFirstMod.MODID);
	public static final RegistryObject<Block> COIN_BLOCK = BLOCKS.register(BlockType.BLOCK_COIN, CoinBlock::new);
}
