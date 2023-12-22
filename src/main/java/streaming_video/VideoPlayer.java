package streaming_video;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class VideoPlayer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage)  {
        WebView webView = new WebView();
        webView.getEngine().load("http://www.youtube.com/embed/flDjU_u35U0?autoplay=1");
        webView.setPrefSize(640, 390);
        stage.setScene(new Scene(webView));
        stage.show();

    }
}
