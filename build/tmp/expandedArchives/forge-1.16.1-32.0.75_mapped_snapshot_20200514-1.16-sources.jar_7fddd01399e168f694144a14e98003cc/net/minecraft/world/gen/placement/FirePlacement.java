package net.minecraft.world.gen.placement;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;
import net.minecraft.util.math.BlockPos;

public class FirePlacement extends SimplePlacement<FrequencyConfig> {
   public FirePlacement(Codec<FrequencyConfig> p_i232101_1_) {
      super(p_i232101_1_);
   }

   public Stream<BlockPos> getPositions(Random random, FrequencyConfig p_212852_2_, BlockPos pos) {
      List<BlockPos> list = Lists.newArrayList();

      for(int i = 0; i < random.nextInt(random.nextInt(p_212852_2_.count) + 1) + 1; ++i) {
         int j = random.nextInt(16) + pos.getX();
         int k = random.nextInt(16) + pos.getZ();
         int l = random.nextInt(120) + 4;
         list.add(new BlockPos(j, l, k));
      }

      return list.stream();
   }
}