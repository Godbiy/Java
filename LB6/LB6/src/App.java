
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
public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {

        int Page = 0;
        FlowPane root = new FlowPane();
        Label label = new Label( "Число");
        Label labelFinal = new Label( "");
        Label labelFinal2 = new Label( "");
        BorderPane.setAlignment(label, Pos.CENTER);
       
        
        Label labelB = new Label( "Пора року");
        BorderPane.setAlignment(labelB, Pos.CENTER);
       

        Label labelC = new Label( "C");
        Label labelD = new Label( "D");
        TextField textField = new TextField();
        TextField textFieldB = new TextField();
        TextField textFieldC = new TextField();
        TextField textFielD = new TextField();
        
        Button btn = new Button();
        Button btn2 = new Button();
        Button Left = new Button();
        Button Right = new Button();
       // root.getChildren().addAll(label, textField);
        root.getChildren().addAll(labelB, textFieldB);
        
        root.getChildren().addAll(labelFinal);
        root.getChildren().addAll(labelFinal2);
        root.getChildren().addAll(Left,Right);
        
        
        
        primaryStage.setTitle("Hello World!");
        
      
        btn.setText("Calculation");
        btn2.setText("Calculation");
        Left.setText("<<");
        Right.setText(">>");
        btn2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                int x1 = 0;
                String text = "",text2="";
                int A = Integer.parseInt( textField.getText());
                
                while (A % 10 > 0)
        {
 
            x1 = A % 10;
            A = (A - x1) / 10;
            text+=Integer.toString(x1);
        }

        JOptionPane.showMessageDialog(null, text, "InfoBox: " + "Java", JOptionPane.INFORMATION_MESSAGE);
            }
        
    }
        );
        Left.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                root.getChildren().clear();
                root.getChildren().addAll(labelB, textFieldB,labelFinal2);
                root.getChildren().addAll(Left,Right);
                root.getChildren().add(btn);
            }
        });
        Right.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                root.getChildren().clear();
                root.getChildren().addAll(label, textField);
                root.getChildren().addAll(Left,Right);
                root.getChildren().add(btn2);
            }
        });
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                int x1 = 0;
                String text = "",text2="";
                
                int n = Integer.parseInt( textFieldB.getText());
                
              // labelFinal.setText(text);
               switch (n) {
                case 1 : {
                    text2 = "Зима)";
                    
                }break;
                case 2 : {
                    text2 ="Тоже зима\n";
                    
                }break;
                case 3 : {
                    text2 ="Це вже весна)\n";
                    
                }break;
                case 4 : {
                    text2 ="ДА ЦЕ ВЕСНА\n";
                  
                }break;
                case 5 : {
                    text2 = "Теж весна\n";
                    
                }break;
                case 6 : {
                    text2 ="О літо тут моє др)))))))\n";
                    
                }break;
                case 7 : {
                    text2 ="ЛІТО\n";
                   
                }break;
                case 8 : {
                    text2 ="Кінець літа скоро школа(\n";
                   
                }break;
                case 9 : {
                    text2 ="ЦЕ вже осінь школа там да\n";
                    
                }break;
                case 10 : {
                    text2 ="До сих пір осінь *я ж не вкшолі як добре)))\n";
                    
                }break;
                case 11 : {
                    text2 ="Типу кінець осені холодно да \n";
                   
                }break;
                case 12 : {
                    text2 ="ЗИМА ЛИЖІ\n";
                    
                }break;
                default : {
                    text2 ="Місяця з номером  " + n + " немає.Ну давай подумай і введи ще раз)";
                    
                }
                break;
                
            }
            labelFinal2.setText(text2);
            }
        
    });
        
        
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
