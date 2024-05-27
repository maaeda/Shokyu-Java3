public class Animation extends MyFrame{
    public void run() {
        int y = 100;
        int crry =y;
        int x = 30;
        int cnt = 2;
        while(true) {
            while (x <= 200) {
                //画面を消す
                clear();
                //図形を表示する
                setColor(0, 128, 0);
                fillRect(x, y, 10, 100);
                x += 5;
                sleep(0.016);
            }
            while (y <= crry+100) {
                //画面を消す
                clear();
                //図形を表示する
                setColor(0, 128, 0);
                fillRect(x, y, 10, 100);
                y += 5;
                sleep(0.016);
            }
            crry+=100;
            while (x >= 30) {
                //画面を消す
                clear();
                //図形を表示する
                setColor(0, 128, 0);
                fillRect(x, y, 10, 100);
                x -= 5;
                sleep(0.016);
            }
            while (y <= crry+100) {
                //画面を消す
                clear();
                //図形を表示する
                setColor(0, 128, 0);
                fillRect(x, y, 10, 100);
                y += 5;
                sleep(0.016);
            }
            crry+=100;
        }
    }
}
