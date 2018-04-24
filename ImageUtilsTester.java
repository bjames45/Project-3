import java.awt.Color;



public class ImageUtilsTester extends ImageUtils {

	public static void main(String[] args) {
	
		
		
			ImageUtils imgUtils = new ImageUtils();
		
	
			Color[][] firstPic = imgUtils.loadImage("src/LennaCV.png");    
			
			
			imgUtils.addImage(firstPic, "Original Picture", 1);
		
			
		
			Color[][] blueShade = change1(firstPic);
			
				imgUtils.addImage(blueShade, "Blue Shade", 1 );
			
			
					imgUtils.display();
	}
	
			//shades blue 
		public static Color[][] change1(Color[][] img){    
			Color[][] pic= ImageUtils.cloneArray(img);
			for(int i=0; i < pic.length; i++) {
				for(int j=0;j< pic[i].length; j++) {
					Color pix = img[i][j];
					
					int Blue = pix.getBlue();
					
					
					
					int Blue1=Blue;
				
				
			pic[i][j]=new Color(Blue1);
				
			}
				}
			return pic;
			
		}
}
		
		
		
		