import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class View {
  TextField textField;
  Button button;
  BorderPane borderPane;
  HBox hbox;
  VBox vbox;

  public View(Model model){
    this.borderPane =  new BorderPane();
    this.hbox = new HBox();
    this.vbox = new VBox();
    this.button = new Button("2");
    this.textField = new TextField();

    this.getChildren().addAll(borderPane,hbox,vbox,button,textField);
  }

}
