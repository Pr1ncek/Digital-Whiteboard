import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Shape;

public class DOval extends DShape implements ModelListener {


    private Ellipse oval;


    public DOval() {
        oval = new Ellipse();
        model = new DOvalModel();
    }

    
    public void draw() {
        oval.setFill(Adapters.awtToFx(model.getColor()));
        
	double x = ( (DOvalModel) model).getXCenter();
	double y = ( (DOvalModel) model).getYCenter();
	double xRadius = ( (DOvalModel) model).getXRadius();
	double yRadius = ( (DOvalModel) model).getYRadius();
	oval.setCenterX(x);
	oval.setCenterY(y);
	oval.setRadiusX(xRadius);
	oval.setRadiusY(yRadius);				   
    }

    public Shape getShape() {
        return oval;
    }
    
}
