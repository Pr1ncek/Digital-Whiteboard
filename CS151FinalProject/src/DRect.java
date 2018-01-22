
import javafx.scene.shape.Rectangle;

public class DRect extends DShape implements ModelListener {

    private Rectangle rect;
    
    public DRect() {
        model = new DRectModel();
        rect = new Rectangle(model.getX(), model.getY(), model.getWidth(), model.getHeight());
    }
    
    public DRect(double x, double y, int width, int height) {
        model = new DRectModel();
        rect = new Rectangle(x, y, width, height);
    }

     
    public void draw() {
    	
        rect.setFill(Adapters.awtToFx(model.getColor()));
        rect.setX((double) model.getX());
        rect.setY((double) model.getY());
        rect.setWidth((double) model.getWidth());
        rect.setHeight((double) model.getHeight());
    }
 
    public Rectangle getShape() {
        return rect;
    }

}
