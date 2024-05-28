public class Car {
    int x,y,vx,vy;
    public Car(int x,int y,int vx,int vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }

    public void draw(MyFrame frame){
        frame.fillRect(x+25,y-50,100,50);
        frame.fillRect(x-25,y,200,50);
        frame.fillOval(x,y+50,50,50);
        frame.fillOval(x+100,y+50,50,50);
    }
}
