package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import control.GameController;


public class MainAreaPanel extends GamePanel{
	public static final String HOF = "HALL_OF_FAME";
	public static final String BOARD = "GAME_BOARD";
		
	HallOfFame hallOfFame;
	JPanel gameBoard;
	CardLayout cards;
	
	public MainAreaPanel(GameController gc) {
		super(gc);
		
		this.cards= new CardLayout();
		this.setLayout(this.cards);
		this.setPreferredSize(new Dimension(MainWindow.WIDTH - 2 * MainWindow.PLAYER_WIDTH, MainWindow.HEIGHT - MainWindow.TOP_HEIGHT));
		this.setBackground(Color.WHITE);
		this.setBorder(new LineBorder(Color.GRAY,1,true));
		
		hallOfFame = new HallOfFame(this.gc);
		
		gameBoard = new GameBoard(this.gc);
		
		
		this.add(HOF,hallOfFame);
		this.add(BOARD,gameBoard);
	}
	
	
	public void showCard(String s) {		
		cards.show(this, s);		
	}




	public JPanel getGameBoard() {
		return gameBoard;
	}


	public void setGameBoard(JPanel gameBoard) {
		this.gameBoard = gameBoard;
	}
	
	
	
}
