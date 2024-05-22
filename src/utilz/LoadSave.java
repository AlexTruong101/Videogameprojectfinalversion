package utilz;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import entities.Crabby;
import main.Game;
import static utilz.Constants.EnemyConstants.CRABBY;

public class LoadSave {
//this will allow us to access the game assets
	public static final String PLAYER_ATLAS = "ninjamegazord.png";
	public static final String LEVEL_ATLAS = "outsideyuh.png";
	//public static final String LEVEL_ONE_DATA = "levelu.png";
	public static final String LEVEL_ONE_DATA = "level_one_data_long.png";
	//public static final String LEVEL_ONE_DATA = "videotestie.png";
	public static final String MENU_BACKGROUND = "powermenunow.png";
	public static final String PLAYING_BG_IMG = "back.jpg";
	public static final String CRABBY_SPRITE = "crabby_sprite.png";
	public static final String STATUS_BAR = "health_power_bar.png";
	
	
	
	public static BufferedImage GetSpriteAtlas(String fileName) {
		BufferedImage img = null;
		InputStream is = LoadSave.class.getResourceAsStream("/" + fileName);
		try {
			img = ImageIO.read(is);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return img;
	}

	public static ArrayList<Crabby> GetCrabs() {
		BufferedImage img = GetSpriteAtlas(LEVEL_ONE_DATA);
		ArrayList<Crabby> list = new ArrayList<>();
		for (int j = 0; j < img.getHeight(); j++)
			for (int i = 0; i < img.getWidth(); i++) {
				Color color = new Color(img.getRGB(i, j));//checks for color and then adds the enemy sprite
				int value = color.getGreen();
				if (value == CRABBY)
					list.add(new Crabby(i * Game.TILES_SIZE, j * Game.TILES_SIZE));
			}
		return list;

	}
	
	
	
	public static int[][] GetLevelData() {
		
		BufferedImage img = GetSpriteAtlas(LEVEL_ONE_DATA);
		int[][] lvlData = new int[img.getHeight()][img.getWidth()];
		
		for (int j = 0; j < img.getHeight(); j++)
			for (int i = 0; i < img.getWidth(); i++) {
				Color color = new Color(img.getRGB(i, j));
				int value = color.getRed();
				if (value >= 48)
					value = 0;
				lvlData[j][i] = value;
			}
		return lvlData;

	}
}