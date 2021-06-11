
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javax.swing.JOptionPane;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
public class App2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {

        
        FlowPane root = new FlowPane();
        Label labelA = new Label( "A");
        Label labelB = new Label( "B");
        Label labelC = new Label( "D");
        Label labelD = new Label( "C");
        Label labelFinal = new Label( "");
    
        TextField textFielA = new TextField();
        TextField textFielB = new TextField();
        TextField textFielC = new TextField();
        TextField textFielD = new TextField();
        
        Button btn = new Button();
        
       
        root.getChildren().addAll(labelA,textFielA,labelB,textFielB,labelC,textFielC,labelD,textFielD,labelFinal);
        root.getChildren().add(btn);
        
        
        primaryStage.setTitle("Java!");
        
      
        btn.setText("Calculation");
       
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                int A = Integer.parseInt(textFielA.getText());
                int B = Integer.parseInt(textFielB.getText());
                int C = Integer.parseInt(textFielC.getText());
                int D = Integer.parseInt(textFielD.getText());
                if(A<B&&C>A&&C<B)labelFinal.setText("Yes");
                else
                if(A>B&&C<A&&C>B)labelFinal.setText("Yes");
                else
                if(A<B&&D>A&&D<B)labelFinal.setText("Yes");
                else
                if(A>B&&D<A&&D>B)labelFinal.setText("Yes");
                else
                labelFinal.setText("No");
                
            }
        
    });
        
        
        
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
