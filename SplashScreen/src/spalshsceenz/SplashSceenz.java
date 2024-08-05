package spalshsceenz;

/**
 * @author Sudais Yousafzai
 */
public class SplashSceenz {

    public static void main(String[] args) {
        Splash splash = new Splash();
        splash.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(20);

                Splash.jLabel1.setText("" + i);
                Splash.jProgressBar1.setValue(i);
                if (i == 100) {
                    Welcome welcome = new Welcome();
                    splash.setVisible(false);
                    welcome.setVisible(true);
                }
            }
        } catch (Exception e) {

        }
    }
}
