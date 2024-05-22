package gamestates;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import main.Game;
import utilz.LoadSave;

public class Menu extends State implements Statemethods {

	private BufferedImage backgroundImg;
	private int menuX,menuY,menuWidth,menuHeight;
	
	public Menu(Game game) {
		super(game);
		loadBackGround();
	}


		
	
	private void loadBackGround() {
		// TODO Auto-generated method stub
		backgroundImg = LoadSave.GetSpriteAtlas(LoadSave.MENU_BACKGROUND);
	}




	@Override
	public void update() {

	}

	@Override
	public void draw(Graphics g) {

		//g.srawImage(backgroundImgPink, )
	//	g.drawImage(backgroundImg, menuX, menuY, 100, 100, null);
		g.drawImage(backgroundImg, 0, 0, 1700, 950, null);
		g.setColor(Color.black);
	
		g.drawString("MENU", game.GAME_WIDTH/2, 200);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER)
			Gamestate.state = Gamestate.PLAYING;

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}