package Player;


import Image.ImageList;
import densan.s.game.drawing.Drawer;
import densan.s.game.object.GameObjectBase;

public class Player extends GameObjectBase{
/**
 * プレイヤー　の横サイズ
 */
	private static int PLAYER_WIDTH= 50;
	
	/**
	 * プレイヤーの　縦サイズ
	 */
	private static int PLAYER_HEIGHT = 50;
	
	/**
	 *  体力
	 */
	private int hp = 100;
	/**
	 * プレイヤーの状態
	 */
//	private State state;

	/**
	 * キャラの画像のセット
	 */
	private ImageList imageSet;
	
	/**
 * コンストラクタ
 * @param x　プレイヤーのX座標
 * @param y  プレイヤーのY座標
 */
	public Player(double x, double y) {
		super(x, y, PLAYER_WIDTH, PLAYER_HEIGHT);
		// TODO 自動生成されたコンストラクター・スタブ
	}



	@Override
	public void update() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void draw(Drawer d) {
		// TODO 自動生成されたメソッド・スタブ
		
	}}
