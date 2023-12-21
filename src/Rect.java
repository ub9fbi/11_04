import java.awt.*;

public class Rect extends Figure{

    @Override
    public boolean isQuadrato() {
        return super.isQuadrato();
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(x1,x2,y1,y2);
    }
}
