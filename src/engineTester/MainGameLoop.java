package engineTester;

import org.lwjgl.opengl.Display;
import renderEngine.DisplayManager;

/**
 * Created by nastya on 17/07/16.
 */
public class MainGameLoop {

    public static void main(String[] args) {
        DisplayManager.createDisplay();
        while(!Display.isCloseRequested()) {
            DisplayManager.updateDisplay();
        }
        DisplayManager.destroyDisplay();
    }
}
