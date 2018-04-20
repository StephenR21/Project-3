import java.awt.Color;

public class Project3 {

	public static void main(String[] args) {
		
        ImageUtils utils = new ImageUtils();
		
		Color[][] OGImage = utils.loadImage("Filepath");
		utils.addImage(OGImage, "Original Image");
		
		Color[][] Color = Color(OGImage);
		utils.addImage(Color, "Color");
		utils.display();
		
	}
	
	public static Color[][] Color(Color[][] image) {
		Color[][] Color = ImageUtils.cloneArray(image);

		for (int i = 85; i < Color.length; i++) {
			for (int j = 0; j < Color[i].length; j++) {
				Color R = Color[i][j];
				int FG = R.getGreen();
				int FB = R.getBlue()/15;
				int FR = R.getRed()/15;
				
				Color[i][j] = new Color(FG, FB, FR);
				
			}
		}
		for (int i = 170; i < Color.length; i++) {
			for (int j = 0; j < Color[i].length; j++) {
				Color R = Color[i][j];
				int SG = R.getGreen();
			    int SB = R.getBlue()/15;
				int SR = R.getRed();
				
				Color[i][j] = new Color(SG, SB, SR);
				
			}}
		for (int i = 255; i < Color.length; i++) {
			for (int j = 0; j < Color[i].length; j++) {
				Color R = Color[i][j];
				int TG = R.getGreen()/10;
				int TB = R.getBlue();
				int TR = R.getRed()/5;
				
				Color[i][j] = new Color(TG, TB, TR);
			}}
		for (int i = 340; i < Color.length; i++) {
			for (int j = 0; j < Color[i].length; j++) {
				Color R = Color[i][j];
				int EG = R.getGreen()/2;
				int EB = R.getBlue()/5;
				int ER = R.getRed();
				
				Color[i][j] = new Color(EG, EB, ER);
			}}
		for (int i = 425; i < Color.length; i++) {
			for (int j = 0; j < Color[i].length; j++) {
				Color R = Color[i][j];
				int QG = R.getGreen()/2;
				int QB = R.getBlue()/5;
				int QR = R.getRed();
				
				Color[i][j] = new Color(QG, QB, QR);
			}}
		for (int i = 510; i < Color.length; i++) {
			for (int j = 0; j < Color[i].length; j++) {
				Color R = Color[i][j];
				int WG = R.getGreen()/2;
				int WB = R.getBlue()/5;
				int WR = R.getRed();
				
				Color[i][j] = new Color(WG, WB, WR);
			}}
		for (int i = 0; i < Color.length; i++) {
			for (int j = 85; j < Color[i].length; j++) {
				Color R = Color[i][j];
				int ZG = R.getGreen();
				int ZB = R.getBlue();
				int ZR = R.getRed();
				
				Color[i][j] = new Color(ZG, ZB, ZR);
			}}
		for (int i = 0; i < Color.length; i++) {
			for (int j = 170; j < Color[i].length; j++) {
				Color R = Color[i][j];
				int EG = R.getGreen();
				int EB = R.getBlue();
				int ER = R.getRed();
				
				Color[i][j] = new Color(EG, EB, ER);
			}}
		for (int i = 0; i < Color.length; i++) {
			for (int j = 255; j < Color[i].length; j++) {
				Color R = Color[i][j];
				int EG = R.getGreen()/2;
				int EB = R.getBlue();
				int ER = R.getRed();
				
				Color[i][j] = new Color(EG, EB, ER);
			}}
		for (int i = 0; i < Color.length; i++) {
			for (int j = 340; j < Color[i].length; j++) {
				Color R = Color[i][j];
				int EG = R.getGreen();
				int EB = R.getBlue();
				int ER = R.getRed()/2;
				
				Color[i][j] = new Color(EG, EB, ER);
			}}
		for (int i = 0; i < Color.length; i++) {
			for (int j = 425; j < Color[i].length; j++) {
				Color R = Color[i][j];
				int EG = R.getGreen()/2;
				int EB = R.getBlue();
				int ER = R.getRed()/5;
				
				Color[i][j] = new Color(EG, EB, ER);
			}}
		for (int i = 0; i < Color.length; i++) {
			for (int j = 510; j < Color[i].length; j++) {
				Color R = Color[i][j];
				int EG = R.getGreen()/2;
				int EB = R.getBlue()/5;
				int ER = R.getRed()/10;
				
				Color[i][j] = new Color(EG, EB, ER);
			}}
		return Color;
}	}