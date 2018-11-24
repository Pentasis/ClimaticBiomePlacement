package jaredbgreat.climaticbiome.generation.biome.biomes;

import jaredbgreat.climaticbiome.generation.biome.BiomeList;
import jaredbgreat.climaticbiome.generation.biome.IBiomeSpecifier;
import jaredbgreat.climaticbiome.generation.biome.LeafBiome;
import jaredbgreat.climaticbiome.generation.biome.NoiseDoubleBiome;
import jaredbgreat.climaticbiome.generation.generator.ChunkTile;

public class GetDesert extends BiomeList {
	private static GetDesert desert;
	private GetDesert() {
		super();
	}
	
	public void init() {
		this.addItem(new LeafBiome(2),   6);
		this.addItem(new LeafBiome(17),  3);
		this.addItem(new LeafBiome(130), 1);
		this.addItem(new NoiseDoubleBiome(39, 4,  37), 2);
		this.addItem(new NoiseDoubleBiome(39, 4,  38), 2);
		this.addItem(new NoiseDoubleBiome(167, 4,165), 1);
	}
	
	
	public static GetDesert getDesert() {
		if(desert == null) {
			desert = new GetDesert();
		}
		return desert;
	}

}