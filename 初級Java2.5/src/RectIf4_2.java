public class RectIf4_2 extends MyFrame{
    public void run() {
        int x = 30;
        setColor(0,128,0);
        int i;
        for (i=0; i<9; i++) {
            fillRect(x,100,10,x);
            x+=20;
        }
    }
}
