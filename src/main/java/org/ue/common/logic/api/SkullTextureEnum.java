package org.ue.common.logic.api;

public enum SkullTextureEnum {

	PLUS("http://textures.minecraft.net/texture/9a2d891c6ae9f6baa040d736ab84d48344bb6b70d7f1a280dd12cbac4d777"),
	MINUS("http://textures.minecraft.net/texture/935e4e26eafc11b52c11668e1d6634e7d1d0d21c411cb085f9394268eb4cdfba"),
	SLOTFILLED("http://textures.minecraft.net/texture/9e42f682e430b55b61204a6f8b76d5227d278ed9ec4d98bda4a7a4830a4b6"),
	K_OFF("http://textures.minecraft.net/texture/e883b5beb4e601c3cbf50505c8bd552e81b996076312cffe27b3cc1a29e3"),
	TEN("http://textures.minecraft.net/texture/b0cf9794fbc089dab037141f67875ab37fadd12f3b92dba7dd2288f1e98836"),
	TWENTY("http://textures.minecraft.net/texture/f7b29a1bb25b2ad8ff3a7a38228189c9461f457a4da98dae29384c5c25d85"),
	BUY("http://textures.minecraft.net/texture/e5da4847272582265bdaca367237c96122b139f4e597fbc6667d3fb75fea7cf6"),
	SELL("http://textures.minecraft.net/texture/abae89e92ac362635ba3e9fb7c12b7ddd9b38adb11df8aa1aff3e51ac428a4"),
	K_ON("http://textures.minecraft.net/texture/d42a4802b6b2deb49cfbb4b7e267e2f9ad45da24c73286f97bef91d21616496"),
	SLOTEMPTY("http://textures.minecraft.net/texture/b55d5019c8d55bcb9dc3494ccc3419757f89c3384cf3c9abec3f18831f35b0"),
	
	ONE("http://textures.minecraft.net/texture/d2a6f0e84daefc8b21aa99415b16ed5fdaa6d8dc0c3cd591f49ca832b575"),
	TWO("http://textures.minecraft.net/texture/96fab991d083993cb83e4bcf44a0b6cefac647d4189ee9cb823e9cc1571e38"),
	THREE("http://textures.minecraft.net/texture/cd319b9343f17a35636bcbc26b819625a9333de3736111f2e932827c8e749"),
	FOUR("http://textures.minecraft.net/texture/d198d56216156114265973c258f57fc79d246bb65e3c77bbe8312ee35db6"),
	FIVE("http://textures.minecraft.net/texture/7fb91bb97749d6a6eed4449d23aea284dc4de6c3818eea5c7e149ddda6f7c9"),
	SIX("http://textures.minecraft.net/texture/7fb91bb97749d6a6eed4449d23aea284dc4de6c3818eea5c7e149ddda6f7c9"),
	SEVEN("http://textures.minecraft.net/texture/9e198fd831cb61f3927f21cf8a7463af5ea3c7e43bd3e8ec7d2948631cce879"),
	
	ONE_GOLD("http://textures.minecraft.net/texture/d55fc2c1bae8e08d3e426c17c455d2ff9342286dffa3c7c23f4bd365e0c3fe"),
	TWO_GOLD("http://textures.minecraft.net/texture/dc61b04e12a879767b3b72d69627f29a83bdeb6220f5dc7bea2eb2529d5b097"),
	THREE_GOLD("http://textures.minecraft.net/texture/6823f77558ca6060b6dc6a4d4b1d86c1a5bee7081677bbc336ccb92fbd3ee"),
	FOUR_GOLD("http://textures.minecraft.net/texture/91b9c4d6f7208b1424f8595bfc1b85ccaaee2c5b9b41e0f564d4e0aca959"),
	FIVE_GOLD("http://textures.minecraft.net/texture/bc1415973b42f8286f948e2140992b9a29d80965593b14553d644f4feafb7"),
	SIX_GOLD("http://textures.minecraft.net/texture/16f5fbfbc8944a50777113798e9fe3aeac2e39648947b70cc103deb6c9e8661");

	private final String value;

	SkullTextureEnum(String string) {
		value = string;
	}

	/**
	 * Returns the texture adress.
	 * 
	 * @return string
	 */
	public String getValue() {
		return value;
	}
}
