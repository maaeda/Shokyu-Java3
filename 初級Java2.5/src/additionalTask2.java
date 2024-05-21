public class additionalTask2 extends MyFrame{
    public void run() {
        int x = 30;
        setColor(0,128,0);
        int i;
        for (i=0; i<9; i++) {
            fillRect(x,10,10,210-x);
            fillRect(x,250-x,10,x);
            x+=20;
        }
    }
}
