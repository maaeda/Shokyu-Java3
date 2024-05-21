public class RectIf4_3 extends MyFrame{
    public void run() {
        int x = 30;
        int i;
        for (i=0; i<9; i++) {
            setColor(x,x,x);
            fillRect(x,100,10,100);
            x+=20;
        }
    }
}
