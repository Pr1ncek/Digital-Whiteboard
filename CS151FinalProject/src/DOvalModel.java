
public class DOvalModel extends DShapeModel {

    
    
    public double getXCenter() {
	return (double)( ( getX() + (getX() + getWidth()) ) / 2 );
    }

    
    public double getYCenter() {
	return (double)( ( getY() + (getY() + getHeight()) ) / 2);
    }

 
    public double getXRadius() {	
	return (double)( getWidth() / 2 );
    }


    
    public double getYRadius() {
	return (double)( getHeight() / 2);
    }

}
