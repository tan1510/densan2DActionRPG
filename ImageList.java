package Image;

import character.image.CharacterImageNames;
import character.image.ImageSet;

public class ImageList {
	private static final String FILE_NAME = "imageData";
	
	private ImageSet[] images;

	
	public ImageList(String characterName) {
		this.characterName = characterName;
		CharacterImageNames[] cins = CharacterImageNames.values();
		images = new ImageSet[cins.length];

}
