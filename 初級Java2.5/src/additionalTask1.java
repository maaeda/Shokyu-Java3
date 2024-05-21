public class additionalTask1 extends MyFrame{
    public void run() {
        int x = 30;
        int y = x ;
        for (int i=0; i<9; i++) {
            setColor(x,x,x);
            fillRect(y,y,x,x);
            x+=20;
            y = (y+x)-20;
        }
    }
}