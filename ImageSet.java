package Image;
import java.awt.Image;
import java.util.TreeMap;
public class ImageSet {

	/**
	 * 区切り文字
	 */
	public static final String DELIMITER = ",";
	/**
	 * ループを表す文字
	 */
	public static final String LOOP_TEXT ="LOOP";
	//カウンター
	private long count = 0;
	//描画する画像
	private Image image;
	
	private TreeMap<Long,Image> list = new TreeMap<Long,Image>();
	
	
}
