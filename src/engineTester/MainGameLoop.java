package engineTester;

import org.lwjgl.opengl.Display;
import renderEngine.DisplayManager;
import renderEngine.Loader;
import renderEngine.RawModel;
import renderEngine.Renderer;

/**
 * Created by nastya on 17/07/16.
 */
public class MainGameLoop {

    public static void main(String[] args) {
        DisplayManager.createDisplay();
        Loader loader = new Loader();
        Renderer renderer = new Renderer();

        float[] vertices = { // first triangle
                            -0.5f, 0.5f, 0f,
                             -0.5f, -0.5f, 0f,
                             0.5f, -0.5f, 0f,
                             // second triangle
                             0.5f, -0.5f, 0f,
                             0.5f, 0.5f, 0f,
                             -0.5f, 0.5f, 0f};

        RawModel model = loader.loadToVAO(vertices);



        while(!Display.isCloseRequested()) {
            DisplayManager.updateDisplay();
            renderer.prepare();
            renderer.render(model);
        }
        loader.cleanUp();
        DisplayManager.destroyDisplay();
    }
}
