package utilz;

import main.Game;

public class Constants {
	public static class EnemyConstants {
	public static final int CRABBY = 0;

	public static final int IDLE = 0;
	public static final int RUNNING = 1;
	public static final int ATTACK = 2;
	public static final int HIT = 3;
	public static final int DEAD = 4;

	public static final int CRABBY_WIDTH_DEFAULT = 72;
	public static final int CRABBY_HEIGHT_DEFAULT = 32;

	public static final int CRABBY_WIDTH = (int) (CRABBY_WIDTH_DEFAULT * Game.SCALE);
	public static final int CRABBY_HEIGHT = (int) (CRABBY_HEIGHT_DEFAULT * Game.SCALE);

	//start of the sprite to the end of it 
	public static final int CRABBY_DRAWOFFSET_X = (int) (26 * Game.SCALE);
	public static final int CRABBY_DRAWOFFSET_Y = (int) (9 * Game.SCALE);
	
	
	public static int GetSpriteAmount(int enemy_type, int enemy_state) {

		switch (enemy_type) {
		case CRABBY:
			switch (enemy_state) {
			case IDLE:
				return 9;
			case RUNNING:
				return 6;
			case ATTACK:
				return 7;
			case HIT:
				return 4;
			case DEAD:
				return 5;
			}
		}

		return 0;

	}
	public static int GetMaxHealth(int enemy_type) {
		switch (enemy_type) {
		case CRABBY:
			return 10;
		default:
			return 1;
		}
	}

	public static int GetEnemyDmg(int enemy_type) {
		switch (enemy_type) {
		case CRABBY:
			return 1;
		default:
			return 0;
		}

	}
	}

	
	
	
	
	public static class Directions {
		public static final int LEFT = 0;
		public static final int UP = 1;
		public static final int RIGHT = 2;
		public static final int DOWN = 3;
	}
//each of the player constants will show us what column the image is at 
// the getspriteamount will return how many images it will have to iterate through
	public static class PlayerConstants {
		public static final int IDLE = 0;
		public static final int RUNNING = 1;
		public static final int JUMP = 3;
		public static final int FALLING = 4;
		public static final int GROUND = 9;
		
		public static final int ATTACK = 5;
		public static final int DEAD = 7;
		

		public static int GetSpriteAmount(int player_action) {
			switch (player_action) {
			case DEAD: 
				return 3;
			case RUNNING:
				return 3;
			case IDLE:
				return 2;
			
			case JUMP:
				return 0;
				
			case ATTACK:
			
				return 2;
			case GROUND:
				return 2;
			case FALLING:
			default:
				return 1;
			}
		}
	}

	
	
	
	
}