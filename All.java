package apps;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class All extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Apps");
        Label label = new Label("  Apps  ");
        GridPane root = new GridPane();
        root.setStyle("-fx-background-color:#f93800;-fx-padding:10");
        root.add(label, 0, 0);
        label.setStyle("-fx-font-size:50px;-fx-text-fill:white;-fx-background-color:#0000ff;-fx-font-family:Elephant");
        root.setHgap(5);
        root.setVgap(5);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 1000, 1000);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Main");
        Button Button1 = new Button("  IP Finder   ");
        root.add(Button1, 0, 3);
        Button1.setStyle("-fx-size:50px;-fx-background-color:#ffb500;-fx-padding:10;-fx-border-color:White;-fx-font-size:30px;-fx-text-fill:#283350");
        Button1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                ip();
            }
        });
        Button Button2 = new Button(" Calculator  ");
        root.add(Button2, 0, 4);
        Button2.setStyle("-fx-size:50px;-fx-background-color:#ffb500;-fx-padding:10;-fx-border-color:White;-fx-font-size:30px;-fx-text-fill:#283350");
        Button2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                calci();
            }
        });
        Button Button3 = new Button("Phone Book");
        Button3.setStyle("-fx-size:50px;-fx-background-color:#ffb500;-fx-padding:10;-fx-border-color:White;-fx-font-size:30px;-fx-text-fill:#283350");
        root.add(Button3, 0, 5);
        Button3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                phone();
            }
        });
        Button Button4 = new Button("Char Count ");
        Button4.setStyle("-fx-size:50px;-fx-background-color:#ffb500;-fx-padding:10;-fx-border-color:White;-fx-font-size:30px;-fx-text-fill:#283350");
        root.add(Button4, 0, 6);
        Button4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                Char();
            }
        });
        primaryStage.show();
    }
    private void ip() {
        Stage myStage = new Stage();
        myStage.setTitle("IP Finder Tool");
        GridPane rootNode = new GridPane();
        rootNode.setStyle("-fx-background-color:blue;-fx-padding:10");
        rootNode.setPadding(new Insets(15));
        rootNode.setHgap(5);
        rootNode.setVgap(5);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 500, 500);
        Label l1 = new Label(" Enter Website URL: ");
        l1.setStyle("-fx-text-fill:white;-fx-font-size:30;-fx-background-color:#123689;-fx-padding:10");
        rootNode.add(l1, 0, 0);
        TextField Value = new TextField();
        rootNode.add(Value, 0, 1);
        Button aButton = new Button("Find IP");
        aButton.setStyle("-fx-size:50px;-fx-background-color:Pink;-fx-border-color:Black;-fx-font-size:20px");
        rootNode.add(aButton, 0, 3);
        aButton.setOnAction(e -> {
            String url = Value.getText();
            try {
                InetAddress ia = InetAddress.getByName(url);
                String ip = ia.getHostAddress();
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText(url);
                alert.setContentText("IP of " + url + " is: " + ip);
                alert.showAndWait();
            } catch (UnknownHostException e1) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText("Message");
                alert.setContentText(e1.toString());
                alert.showAndWait();
            }
        });
        myStage.setScene(myScene);
        myStage.show();
    }

    private void calci() {
        Stage myStage = new Stage();
        myStage.setTitle("Calculator");
        GridPane rootNode = new GridPane();
        rootNode.setStyle(";-fx-background-color:blue;-fx-padding:10");
        rootNode.setPadding(new Insets(15));
        rootNode.setHgap(5);
        rootNode.setVgap(5);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 1000, 1000);
        Label l11 = new Label("A:");
        rootNode.add(l11, 0, 0);
        TextField firstValue = new TextField();
        rootNode.add(firstValue, 1, 0);
        Label l22 = new Label("B:");
        rootNode.add(l22, 0, 2);
        TextField secondValue = new TextField();
        rootNode.add(secondValue, 1, 2);
        firstValue.setStyle("-fx-font-size:30;-fx-padding:5;");
        secondValue.setStyle("-fx-font-size:30;-fx-padding:5");
        l11.setStyle("-fx-text-fill:white;-fx-font-size:30;-fx-background-color:#123689;-fx-padding:5");
        l22.setStyle("-fx-text-fill:white;-fx-font-size:30;-fx-background-color:#123689;-fx-padding:5");
        Button Button1 = new Button(" A + B = C");
        rootNode.add(Button1, 1, 3);
        Button Button2 = new Button(" A - B = C");
        rootNode.add(Button2, 2, 3);
        Button Button3 = new Button(" A * B = C");
        rootNode.add(Button3, 1, 4);
        Button Button4 = new Button(" A / B = C");
        rootNode.add(Button4, 2, 4);
        Button Button5 = new Button(" A // B= C");
        rootNode.add(Button5, 1, 5);
        Button Button6 = new Button(" A % B= C");
        rootNode.add(Button6, 2, 5);
        Button Button7 = new Button(" A ^ B= C");
        rootNode.add(Button7, 1, 6);
        Button Button8 = new Button("logB(A)=C");
        rootNode.add(Button8, 2, 6);
        Button1.setStyle("-fx-size:50px;-fx-background-color:Pink;-fx-border-color:Black;-fx-font-size:20px");
        Button2.setStyle("-fx-size:50px;-fx-background-color:Pink;-fx-border-color:Black;-fx-font-size:20px");
        Button3.setStyle("-fx-size:50px;-fx-background-color:Pink;-fx-border-color:Black;-fx-font-size:20px");
        Button4.setStyle("-fx-size:50px;-fx-background-color:Pink;-fx-border-color:Black;-fx-font-size:20px");
        Button5.setStyle("-fx-size:50px;-fx-background-color:Pink;-fx-border-color:Black;-fx-font-size:20px");
        Button6.setStyle("-fx-size:50px;-fx-background-color:Pink;-fx-border-color:Black;-fx-font-size:20px");
        Button7.setStyle("-fx-size:50px;-fx-background-color:Pink;-fx-border-color:Black;-fx-font-size:20px");
        Button8.setStyle("-fx-size:50px;-fx-background-color:Pink;-fx-border-color:Black;-fx-font-size:20px");
        Label l0 = new Label("");
        rootNode.add(l0, 0, 8);
        Label l1 = new Label("");
        rootNode.add(l1, 1, 8);
        Label l2 = new Label("");
        rootNode.add(l2, 2, 8);
        Button1.setOnAction(e -> {
            try {
                Float value1 = Float.valueOf(firstValue.getText());
                Float value2 = Float.valueOf(secondValue.getText());
                Float r = value1 + value2;
                l2.setText(r.toString());
                l1.setText(firstValue.getText() + " + " + secondValue.getText() + " = ");
                l1.setTextFill(Color.WHITE);
                l2.setText(r.toString());
                l2.setTextFill(Color.WHITE);
                l2.setStyle("-fx-background-color: orange; -fx-font-size: 50px");
                l1.setStyle("-fx-background-color: purple;-fx-font-size: 50px");
            } catch (NumberFormatException e1) {
                l1.setText("Input is invalid :(");
                l1.setStyle("-fx-background-color: white;-fx-font-size: 50px");
                l1.setTextFill(Color.RED);
                l2.setText("");
            } catch (Exception e1) {
                l1.setText(e1.toString());
                l1.setStyle("-fx-background-color: white;-fx-font-size: 50px");
                l2.setText("");
            }
        });
        Button2.setOnAction(e -> {
            try {
                Float value1 = Float.valueOf(firstValue.getText());
                Float value2 = Float.valueOf(secondValue.getText());
                Float r = value1 - value2;
                l1.setText(firstValue.getText() + " - " + secondValue.getText() + " = ");
                l1.setTextFill(Color.WHITE);
                l2.setText(r.toString());
                l2.setTextFill(Color.WHITE);
                l2.setStyle("-fx-background-color: orange; -fx-font-size: 50px");
                l1.setStyle("-fx-background-color: purple;-fx-font-size: 50px");

            } catch (NumberFormatException e1) {
                l1.setText("Input is invalid :(");
                l1.setStyle("-fx-background-color: white;-fx-font-size: 50px");

                l1.setTextFill(Color.RED);
                l2.setText("");
            } catch (Exception e1) {
                l1.setText(e1.toString());
                l1.setTextFill(Color.RED);
                l1.setStyle("-fx-background-color: white;-fx-font-size: 50px");
                l2.setText("");
            }
        });
        Button3.setOnAction(e -> {
            try {
                Double value1 = Double.valueOf(firstValue.getText());
                Double value2 = Double.valueOf(secondValue.getText());
                Double r = value1 * value2;
                Float w = r.floatValue();
                l1.setText(firstValue.getText() + " * " + secondValue.getText() + " = ");
                l1.setTextFill(Color.WHITE);
                l2.setText(w.toString());
                l2.setTextFill(Color.WHITE);
                l2.setStyle("-fx-background-color: orange; -fx-font-size: 50px");
                l1.setStyle("-fx-background-color: purple;-fx-font-size: 50px");
            } catch (NumberFormatException e1) {
                l1.setText("Input is invalid :(");
                l1.setTextFill(Color.RED);
                l1.setStyle("-fx-background-color: white;-fx-font-size: 50px");
                l2.setText("");
            } catch (Exception e1) {
                l1.setText(e1.toString());
                l1.setTextFill(Color.RED);
                l1.setStyle("-fx-background-color: white;-fx-font-size: 50px");
                l2.setText("");
            }
        });
        Button4.setOnAction(e -> {
            try {
                Float value1 = Float.valueOf(firstValue.getText());
                Float value2 = Float.valueOf(secondValue.getText());
                Float r = value1 / value2;
                l1.setText(firstValue.getText() + " / " + secondValue.getText() + " = ");
                l1.setTextFill(Color.WHITE);
                l2.setText(r.toString());
                l2.setTextFill(Color.WHITE);
                l2.setStyle("-fx-background-color: orange; -fx-font-size: 50px");
                l1.setStyle("-fx-background-color: purple;-fx-font-size: 50px");

            } catch (NumberFormatException e1) {
                l1.setText("Input is invalid :(");
                l1.setStyle("-fx-background-color: white;-fx-font-size: 50px");
                l1.setTextFill(Color.RED);
                l2.setText("");
            } catch (ArithmeticException e1) {
                l1.setText(firstValue.getText() + " / " + secondValue.getText() + " is Infinity");
                l1.setStyle("-fx-background-color: white;-fx-font-size: 50px");
                l1.setTextFill(Color.BLUE);
                l2.setText("");
            }
        });
        Button5.setOnAction(e -> {
            try {
                Float value1 = Float.valueOf(firstValue.getText());
                Float value2 = Float.valueOf(secondValue.getText());
                Float r = value1 / value2;
                String d = "", f;
                f = r.toString();
                for (int i = 0; i < f.length(); i++) {
                    if (f.charAt(i) == '.') {
                        break;
                    }
                    char w[] = {f.charAt(i)};
                    d = d.concat(new String(w));
                }
                l1.setText(firstValue.getText() + " // " + secondValue.getText() + " = ");
                l1.setTextFill(Color.WHITE);
                l2.setTextFill(Color.WHITE);
                l2.setStyle("-fx-background-color: orange; -fx-font-size: 50px");
                l1.setStyle("-fx-background-color: purple;-fx-font-size: 50px");
                l2.setText(d.toString());
            } catch (NumberFormatException e1) {
                l1.setText("Input is invalid :(");
                l1.setStyle("-fx-background-color: white;-fx-font-size: 50px");
                l1.setTextFill(Color.RED);
                l2.setText("");
            } catch (Exception e1) {
                l1.setText(e1.toString());
                l1.setStyle("-fx-background-color: white;-fx-font-size: 50px");
                l1.setTextFill(Color.RED);
                l2.setText("");
            }
        });
        Button6.setOnAction(e -> {
            try {
                Float value1 = Float.valueOf(firstValue.getText());
                Float value2 = Float.valueOf(secondValue.getText());
                Float r = value1 % value2;
                l1.setText(firstValue.getText() + " % " + secondValue.getText() + " = ");
                l1.setTextFill(Color.WHITE);
                l2.setText(r.toString());
                l2.setTextFill(Color.WHITE);
                l2.setStyle("-fx-background-color: orange; -fx-font-size: 50px");
                l1.setStyle("-fx-background-color: purple;-fx-font-size: 50px");

            } catch (NumberFormatException e1) {
                l1.setText("Input is invalid :(");
                l1.setStyle("-fx-background-color: white;-fx-font-size: 50px");
                l1.setTextFill(Color.RED);
                l2.setText("");
            } catch (ArithmeticException e1) {
                l1.setText(firstValue.getText() + " / " + secondValue.getText() + " is Infinity");
                l1.setStyle("-fx-background-color: white;-fx-font-size: 50px");
                l1.setTextFill(Color.BLUE);
                l2.setText("");
            }
        });
        Button7.setOnAction(e -> {
            try {
                Float value1 = Float.valueOf(firstValue.getText());
                Float value2 = Float.valueOf(secondValue.getText());
                Double r = Math.pow(value1, value2);
                Float w = r.floatValue();
                l1.setText(firstValue.getText() + " ^ " + secondValue.getText() + " = ");
                l1.setTextFill(Color.WHITE);
                l2.setText(w.toString());
                l2.setTextFill(Color.WHITE);
                l2.setStyle("-fx-background-color: orange; -fx-font-size: 50px");
                l1.setStyle("-fx-background-color: purple;-fx-font-size: 50px");
            } catch (NumberFormatException e1) {
                l1.setText("Input is invalid :(");
                l1.setStyle("-fx-background-color: white;-fx-font-size: 50px");
                l1.setTextFill(Color.RED);
                l2.setText("");
            } catch (ArithmeticException e1) {
                l1.setText(firstValue.getText() + " / " + secondValue.getText() + " is Infinity");
                l1.setTextFill(Color.WHITE);
                l2.setStyle("-fx-background-color: orange; -fx-font-size: 50px");
                l1.setStyle("-fx-background-color: purple;-fx-font-size: 50px");
                l1.setTextFill(Color.BLUE);
                l2.setText("");
            }
        });
        Button8.setOnAction(e -> {
            try {
                Integer value1 = Integer.valueOf(firstValue.getText());
                Integer value2 = Integer.valueOf(secondValue.getText());
                Double r = Math.log(value1) / Math.log(value2);
                Float w = r.floatValue();
                l1.setText(" log" + secondValue.getText() + " (" + firstValue.getText() + ") = ");
                l1.setTextFill(Color.WHITE);
                l2.setText(w.toString());
                l2.setTextFill(Color.WHITE);
                l2.setStyle("-fx-background-color: orange; -fx-font-size: 50px");
                l1.setStyle("-fx-background-color: purple;-fx-font-size: 50px");
            } catch (NumberFormatException e1) {
                l1.setText("Input is invalid :(");
                l1.setStyle("-fx-background-color: white;-fx-font-size: 50px");
                l1.setTextFill(Color.RED);
                l2.setText("");
            } catch (Exception e1) {
                l1.setText(e1.toString());
                l1.setStyle("-fx-background-color: white;-fx-font-size: 50px");
                l2.setText("");
            }
        });
        myStage.setScene(myScene);
        myStage.show();
    }

    private void phone() {
        Stage myStage = new Stage();
        myStage.setTitle("PhoneBook");
        GridPane rootNode = new GridPane();
        rootNode.setStyle(";-fx-background-color:blue;-fx-padding:10");
        rootNode.setPadding(new Insets(15));
        rootNode.setHgap(5);
        rootNode.setVgap(5);
        rootNode.setAlignment(Pos.CENTER);
        Label l1 = new Label("Name:");
        rootNode.add(l1, 0, 0);
        Label l2 = new Label("Phone Number:");
        TextField firstValue = new TextField();
        rootNode.add(firstValue, 1, 0);
        rootNode.add(l2, 0, 2);
        l1.setStyle("-fx-text-fill:white;-fx-font-size:30;-fx-background-color:#123689;-fx-padding:5");
        l2.setStyle("-fx-text-fill:white;-fx-font-size:30;-fx-background-color:#123689;-fx-padding:5");
        TextField secondValue = new TextField();
        firstValue.setStyle("-fx-font-size:30;-fx-padding:5;");
        secondValue.setStyle("-fx-font-size:30;-fx-padding:5");
        rootNode.add(secondValue, 1, 2);
        Scene myScene = new Scene(rootNode, 900, 900);
        Button Button1 = new Button("Add");
        rootNode.add(Button1, 0, 6);
        Button Button2 = new Button("Show");
        rootNode.add(Button2, 1, 6);
        Button Button3 = new Button("Delete");
        rootNode.add(Button3, 2, 6);
        Label l0 = new Label("");
        rootNode.add(l0, 0, 8);
        Button1.setStyle("-fx-size:50px;-fx-background-color:Pink;-fx-border-color:Black;-fx-font-size:20px");
        Button2.setStyle("-fx-size:50px;-fx-background-color:Pink;-fx-border-color:Black;-fx-font-size:20px");
        Button3.setStyle("-fx-size:50px;-fx-background-color:Pink;-fx-border-color:Black;-fx-font-size:20px");
        Button1.setOnAction(e -> {
            l0.setText("");
            String number, name;
            if ((firstValue.getText()).length() == 0) {
                l0.setText("Name or number is Invalid :(");
                l0.setStyle("-fx-text-fill:red;-fx-font-size:30;-fx-background-color:white;-fx-padding:5");
            } else if ((secondValue.getText()).length() == 0) {
                l0.setText("Enter valid number :(");
                l0.setStyle("-fx-text-fill:red;-fx-font-size:30;-fx-background-color:white;-fx-padding:5");
            } else {
                Properties pb = new Properties();
                FileInputStream fin = null;
                BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
                try {
                    fin = new FileInputStream("Phonebook.dat");
                } catch (Exception e1) {
                }
                try {
                    if (fin != null) {
                        pb.load(fin);
                        fin.close();
                    }
                } catch (Exception e1) {
                }
                name = firstValue.getText();
                number = secondValue.getText();
                pb.put(name, number);
                FileOutputStream fout;
                try {
                    fout = new FileOutputStream("Phonebook.dat");
                    pb.store(fout, "Phone Directory");
                    l0.setText("Added succesfully :)");
                    l0.setStyle("-fx-text-fill:white;-fx-font-size:30;-fx-background-color:#123689;-fx-padding:5");

                    firstValue.setText("");
                    secondValue.setText("");
                    fout.close();
                } catch (Exception ex) {
                }
            }
        });
        Button2.setOnAction(e -> {
            l0.setText("");
            secondValue.setText("");
            if ((firstValue.getText()).length() == 0) {
                l0.setText("Name is Invalid :(");
                l0.setStyle("-fx-text-fill:red;-fx-font-size:30;-fx-background-color:white;-fx-padding:5");
            } else {
                Properties pb = new Properties();
                FileInputStream fin = null;
                BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
                try {
                    fin = new FileInputStream("Phonebook.dat");
                } catch (Exception e1) {
                }
                try {
                    if (fin != null) {
                        pb.load(fin);
                        fin.close();
                        l0.setText("");
                        l0.setStyle("-fx-text-fill:white;-fx-font-size:30;-fx-background-color:blue;-fx-padding:5");

                    }
                } catch (Exception e1) {
                }
                String number, name;
                name = firstValue.getText();
                if (pb.containsKey(name)) {
                    number = (String) pb.get(name);
                    secondValue.setText(number);
                } else {
                    l0.setText("Cannot find the number :(");
                    l0.setStyle("-fx-text-fill:white;-fx-font-size:30;-fx-background-color:#123689;-fx-padding:5");
                    secondValue.setText("");
                }
            }
        });
        Button3.setOnAction(e -> {
            l0.setText("");
            if ((firstValue.getText()).length() == 0) {
                l0.setText("Name is Invalid :(");
                l0.setStyle("-fx-text-fill:red;-fx-font-size:30;-fx-background-color:white;-fx-padding:5");
            } else {
                Properties pb = new Properties();
                FileInputStream fin = null;
                BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
                try {
                    fin = new FileInputStream("Phonebook.dat");
                } catch (Exception e1) {
                }
                try {
                    if (fin != null) {
                        pb.load(fin);
                        fin.close();
                        l0.setText("");
                    }
                } catch (Exception e1) {
                }
                String number, name;
                name = firstValue.getText();
                if (pb.containsKey(name)) {
                    pb.remove(name);
                    FileOutputStream fout;
                    try {
                        fout = new FileOutputStream("Phonebook.dat");
                        pb.store(fout, "Phone Directory");
                        l0.setText("Deleted succesfully :)");
                        l0.setStyle("-fx-text-fill:white;-fx-font-size:30;-fx-background-color:#123689;-fx-padding:5");
                        firstValue.setText("");
                        secondValue.setText("");
                        fout.close();
                    } catch (Exception ex) {

                    }
                } else {
                    l0.setStyle("-fx-text-fill:red;-fx-font-size:30;-fx-background-color:White;-fx-padding:5");
                    l0.setText("Cannot find the Element to delete :(");
                }
                secondValue.setText("");
            }
        });
        myStage.setScene(myScene);
        myStage.show();
    }
    private void Char() {
        Stage myStage = new Stage();
        myStage.setTitle("CharCount");
        GridPane rootNode = new GridPane();
        rootNode.setStyle("-fx-background-color:blue;-fx-padding:10");
        rootNode.setPadding(new Insets(15));
        rootNode.setHgap(5);
        rootNode.setVgap(5);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 1000, 1000);
        Label l1 = new Label("Characters:");
        rootNode.add(l1, 0, 0);
        Label l2 = new Label("Words:");
        rootNode.add(l2, 0, 1);
        l1.setStyle("-fx-text-fill:white;-fx-font-size:30;-fx-background-color:#123689;-fx-padding:5");
        l2.setStyle("-fx-text-fill:white;-fx-font-size:30;-fx-background-color:#123689;-fx-padding:5");
        TextField Value = new TextField();
        Value.setPrefWidth(500);
        Value.setPrefHeight(500);
        Value.setStyle("-fx-font-size:30;-fx-padding:5;");
        rootNode.add(Value, 0, 2);
        Button aButton = new Button("Count");
        rootNode.add(aButton, 0, 3);
        aButton.setStyle("-fx-size:50px;-fx-background-color:Pink;-fx-padding:10;-fx-border-color:Black;-fx-font-size:30px");
        aButton.setOnAction(e -> {
            String text = Value.getText();
            l1.setText("Characters: " + text.length());
            String words[] = text.split("\\s+");
            if (text.length() > 0) {
                l2.setText("Words: " + words.length);
            } else {
                l2.setText("Words: 0");
            }
        });
        myStage.setScene(myScene);
        myStage.show();
    }
}
