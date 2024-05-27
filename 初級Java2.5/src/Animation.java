public class Animation extends MyFrame{
    public void run() {
        int y = 100;
        int x = 30;
        int cnt = 0;
        while(cnt < 3) {
            while (x <= 170) {
                //画面を消す
                clear();
                //図形を表示する
                setColor(0, 128, 0);
                fillRect(x, y, 10, 100);
                x += 5;
                sleep(0.016);
            }
            while (x >= 30) {
                //画面を消す
                clear();
                //図形を表示する
                setColor(0, 128, 0);
                fillRect(x, y, 10, 100);
                x -= 5;
                sleep(0.016);
            }
            cnt++;
        }
    }
}
