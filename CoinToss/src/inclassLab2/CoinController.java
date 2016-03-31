package inclassLab2;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CoinController {
	
    @FXML
    private Button btnToss;

    @FXML
    private ImageView imgCoin;

    Image imgHead = new Image("http://www.simplytaxesllc.com/wp-content/uploads/2012/03/Quarter-Head1.jpg");
    Image imgTails = new Image("http://file2.answcdn.com/answ-cld/image/upload/h_320,c_fill,g_face:center,q_60,f_jpg/v1400840447/ds1tt17eqr1vvzeygoeq.png");
    int toss;
    Random num = new Random();
    @FXML
    void tossCoin() {

    	toss = num.nextInt(2);
    	
    	if(toss == 0){
    		imgCoin.setImage(imgHead);
    	}
    	if(toss == 1){
    		imgCoin.setImage(imgTails);
    	}
    }
}
