import java.util.Vector;

public class DisplayFaceVector extends DisplayFace {
    public void run() {
        Vector<Face> faces = new Vector<Face>();
        faces.add(new Face(50,50,1,0));
        faces.add(new Face(50,200,2,0));
        faces.add(new Face(50,350,3,0));
        faces.add(new Face(50,500,4,0));
        faces.add(new Face(50,650,5,0));
        for (int i = 0; i < 30; i++) {
            clear();
            for (int j = 0; j < faces.size(); j++) {
                faces.get(j).draw(this);
                faces.get(j).move();
            }
            sleep(0.01);
        }
    }
}
