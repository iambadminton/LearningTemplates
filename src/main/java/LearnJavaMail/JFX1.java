package LearnJavaMail;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.File;
import java.io.IOException;


public class JFX1 extends Application {
    Stage window;
    AddressBookReader addressBookReader;



    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Сделать рассылку");
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(12);

        Label addressbookLabel = new Label("Адресная книга");
        GridPane.setConstraints(addressbookLabel, 0, 0);
        TextField addressbookInput = new TextField("Укажите адресную книгу");
        GridPane.setConstraints(addressbookInput, 1, 0);

        FileChooser addressbookChooser = new FileChooser();
        addressbookChooser.setTitle("Открыть папку");
        addressbookChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Excel files", "*.xlsx"),
                new FileChooser.ExtensionFilter("Excel files 97-2003", "*.xls"));
        //File addressBook = addressbookChooser.

        DirectoryChooser folderChooser = new DirectoryChooser();
        folderChooser.setTitle("Выбрать папку для загрузки");
        folderChooser.setInitialDirectory(folderChooser.getInitialDirectory());

        Button fileChooserButton = new Button("Выбрать файл");
        fileChooserButton.setOnAction(event -> {File file= addressbookChooser.showOpenDialog(primaryStage);addressbookInput.setText(file.getPath().toString());});
        /*root.setCenter(fileChooserButton);*/
        GridPane.setConstraints(fileChooserButton, 2, 0);

        Label directoryLabel = new Label("Папка с файлами");
        GridPane.setConstraints(directoryLabel, 0, 1);

        TextField folderInput = new TextField();
        folderInput.setPromptText("Укажите папку с файлами");
        GridPane.setConstraints(folderInput, 1, 1);

        Button folderChooserButton = new Button("Выбрать папку с файлами");
        folderChooserButton.setOnAction(event -> {File file = folderChooser.showDialog(primaryStage); folderInput.setText(file.getPath().toString());});
        /*root.setCenter(fileChooserButton);*/
        GridPane.setConstraints(folderChooserButton, 2, 1);


        Label themeLabel = new Label("Тема письма");
        GridPane.setConstraints(themeLabel, 0, 2);

        TextField ageInput = new TextField();
        ageInput.setPromptText("Укажите тему письма");
        GridPane.setConstraints(ageInput, 1, 2);

        Button loginButton = new Button("Сделать рассылку");
        loginButton.setOnAction(e -> {
            try {
                doMailing(addressbookInput, folderInput);
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (InvalidFormatException e1) {
                e1.printStackTrace();
            }
        });

        GridPane.setConstraints(loginButton, 1, 3);

        ProgressBar generalProgressBar = new ProgressBar(0);
        generalProgressBar.setMaxSize(500, 10);
        GridPane.setConstraints(generalProgressBar, 0, 5, 4, 1);
        ProgressIndicator indicator = new ProgressIndicator();

        gridPane.getChildren().addAll(addressbookInput, addressbookLabel, folderInput, directoryLabel, loginButton, ageInput, themeLabel, fileChooserButton, generalProgressBar, folderChooserButton);

        Scene scene = new Scene(gridPane, 550, 300);

        primaryStage.setResizable(false);
        window.setScene(scene);


        window.show();


    }

    private void doMailing(TextField addressBook, TextField folder) throws IOException, InvalidFormatException {
        AddressBookReader addressBookReader = new AddressBookReader(addressBook.getText());
        addressBookReader.read();
        for(PersonInfo personInfo: addressBookReader.list) {
            System.out.println(personInfo.getEmail());
        }

    }



}

