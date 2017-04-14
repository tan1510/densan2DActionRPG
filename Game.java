
import Scene.Title;
import densan.s.game.manager.GameManager;


public class Game {

	public static void main(String args[]){
		GameManager gm = GameManager.getInstance();
		//作りたい画面サイズにする
		gm.createFrame(640, 480);
		//個々の引数はGameクラスを継承したミニゲームの名前のクラスを入れる
		//今はTestMiniGame
		gm.setUpdatable(new Title());
	}
}
