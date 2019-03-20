package exercise2;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class StudentInfoJavaFX extends Application {

//Declaring the variables
private Pane masterPane, pane1, pane2, pane3, pane4, pane5, pane6, pane7;

private Scene masterScene;

private GridPane gridPane1;

private Label lblName, lblAddress, lblCity, lblProvince, lblPostalCode, lblPhone, lblEmail;

private TextField txtName, txtAddress, txtCity, txtProvince, txtPostalCode, txtPhone, txtEmail;

private CheckBox checkBox1, checkBox2;

private VBox vBox1, vBox2, vBox3, vBox4;

private RadioButton radioButton1, radioButton2;

private ToggleGroup toggleGroup;

private ObservableList<String> compCourses, businessCourses;

private ComboBox comboBox;

private BorderPane borderPane;

private Button btnDisplay;

private TextArea txtArea;

private ScrollPane scrollPane1, scrollPane2;

private ObservableList<String> addedCourses = FXCollections.observableArrayList();

private ListView<String> selectedCourses = new ListView<>();

@Override
public void start(Stage stage){
    //Setting up the stage
    masterPane = new Pane();
    masterPane.setPrefSize(750, 460);

    //Setting up the scene
    masterScene = new Scene(masterPane);

    stage.setTitle("Student Application");
    stage.setResizable(false);
    stage.setScene(masterScene);
    stage.show();

    //Creating the panes

    //Pane 1
    pane1 = new Pane();
    pane1.setPrefSize(740, 450);
    pane1.setLayoutX(6);
    pane1.setLayoutY(6);

    //Pane 2
    pane2 = new Pane();
    pane2.setStyle("-fx-background-color: LIGHTGREY");
    pane2.setPrefSize(400,240);
    pane2.setLayoutX(10);
    pane2.setLayoutY(18);

    //Pane 3
    pane3 = new Pane();
    pane3.setStyle("-fx-background-color: LIGHTGREY");
    pane3.setPrefSize(150, 100);
    pane3.setLayoutX(420);
    pane3.setLayoutY(18);

    //Pane 4
    pane4 = new Pane();
    pane4.setStyle("-fx-background-color: LIGHTGREY");
    pane4.setPrefSize(150, 100);
    pane4.setLayoutX(580);
    pane4.setLayoutY(18);

    //Pane 5
    pane5 = new Pane();
    pane5.setStyle("-fx-background-color: LIGHTGREY");
    pane5.setPrefSize(310, 130);
    pane5.setLayoutX(420);
    pane5.setLayoutY(128);

    //Pane 6
    pane6 = new Pane();
    pane6.setPrefSize(180, 35);
    pane6.setLayoutX(280);
    pane6.setLayoutY(268);

    //Pane 7
    pane7 = new Pane();
    pane7.setStyle("-fx-background-color: LIGHTGREY");
    pane7.setPrefSize(720, 140);
    pane7.setLayoutX(10);
    pane7.setLayoutY(300);

    //Adding a GridPane to put labels and text fields
    gridPane1 = new GridPane();
    gridPane1.setHgap(10);
    gridPane1.setVgap(5);
    gridPane1.setPadding(new Insets(10, 10, 0, 4));

    //Creating labels and adding them to the gridPane1
    lblName = new Label("Full Name: ");
    lblName.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
    gridPane1.add(lblName, 1, 0);

    lblAddress = new Label("Address: ");
    lblAddress.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
    gridPane1.add(lblAddress, 1, 1);

    lblCity = new Label("City: ");
    lblCity.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
    gridPane1.add(lblCity, 1, 2);

    lblProvince = new Label("Province: ");
    lblProvince.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
    gridPane1.add(lblProvince, 1, 3);

    lblPostalCode = new Label("Postal Code: ");
    lblPostalCode.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
    gridPane1.add(lblPostalCode, 1, 4);

    lblPhone = new Label("Phone Number: ");
    lblPhone.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
    gridPane1.add(lblPhone, 1, 5);

    lblEmail = new Label("Email: ");
    lblEmail.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
    gridPane1.add(lblEmail, 1, 6);

    //Creating the text fields and adding them to the gridPane1
    txtName = new TextField();
    txtName.setPrefSize(250, 10);
    gridPane1.add(txtName, 2, 0);

    txtAddress = new TextField();
    gridPane1.add(txtAddress, 2, 1);

    txtCity = new TextField();
    gridPane1.add(txtCity, 2, 2);

    txtProvince = new TextField();
    gridPane1.add(txtProvince, 2, 3);

    txtPostalCode = new TextField();
    gridPane1.add(txtPostalCode, 2, 4);

    txtPhone= new TextField();
    gridPane1.add(txtPhone, 2, 5);

    txtEmail = new TextField();
    gridPane1.add(txtEmail, 2, 6);

    //Creating the VBox pane for the checkboxes
    vBox1 = new VBox();
    vBox1.setPadding(new Insets(30, 3, 0, 12));
    vBox1.setSpacing(8);

    //Creating the checkbox1 and adding it to the vBox1
    checkBox1 = new CheckBox("Student Council");
    checkBox1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
    vBox1.getChildren().add(checkBox1);

    //Creating the checkbox2 and adding it to the vBox1
    checkBox2 = new CheckBox("Volunteer Work");
    checkBox2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
    vBox1.getChildren().add(checkBox2);

    //Creating the vBox2 to add the radio buttons
    vBox2 = new VBox();
    vBox2.setPadding(new Insets(30, 3, 0, 12));
    vBox2.setSpacing(8);

    //Creating a group of radio buttons
    toggleGroup = new ToggleGroup();

    //Adding radioButton1 to the toggleGroup and then to the vBox2
    radioButton1 = new RadioButton("Computer Science");
    radioButton1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
    radioButton1.setToggleGroup(toggleGroup);
    radioButton1.setSelected(true);
    vBox2.getChildren().add(radioButton1);

    //Adding radioButton2 to the toggleGroup and then to the vBox2
    radioButton2 = new RadioButton("Business");
    radioButton2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
    radioButton2.setToggleGroup(toggleGroup);
    vBox2.getChildren().add(radioButton2);

    //Event fired when the radioButtons are clicked
    radioButton1.setOnAction(event -> radioClicked());
    radioButton2.setOnAction(event -> radioClicked());

    //Creating a vBox for the comboBox
    vBox3 = new VBox();
    vBox3.setPadding(new Insets(10, 0, 0, 15));
    vBox3.setSpacing(8);

    //Adding computer Science courses to the list
    compCourses = FXCollections.observableArrayList
            (
            " ",
            "Java Programming Language",
            "Python Programming Language",
            "C# Programming Language"
            );

    //Adding the compCourses to the comboBox and the comboBox to the vBox3
    comboBox = new ComboBox(compCourses);
    comboBox.setPrefSize(280, 20);
    vBox3.getChildren().add(comboBox);

    //Event fired when a course is added
    comboBox.setOnAction(event -> courseAdded());

    //Adding the selected courses to the scrollPane1
    scrollPane1 = new ScrollPane(selectedCourses);
    scrollPane1.setLayoutY(40);
    scrollPane1.setLayoutX(15);
    scrollPane1.setPrefSize(280, 80);
    selectedCourses.setPrefSize(265, 80);
    pane5.getChildren().add(scrollPane1);

    //Using a layout manager to add the display button
    borderPane = new BorderPane();
    borderPane.setLayoutX(60);
    btnDisplay = new Button("Display");
    btnDisplay.setPrefSize(100, 20);
    borderPane.setCenter(btnDisplay);

    //When the Display button is clicked, the method displayClicked will be executed
    btnDisplay.setOnAction(event -> displayClicked());

    //Creating a vBox4 pane to the text area
    vBox4 = new VBox();
    vBox4.setPadding(new Insets(10, 3, 0, 10));
    vBox4.setSpacing(8);

    //Adding a text area
    txtArea = new TextArea();
    txtArea.setPrefSize(700, 120);
    txtArea.setWrapText(true);
    txtArea.setEditable(false);

    //Adding the text area to the scrollPane2
    scrollPane2 = new ScrollPane(txtArea);
    scrollPane2.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
    scrollPane2.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
    vBox4.getChildren().add(scrollPane2);

    //Adding the components to the masterPane
    masterPane.getChildren().addAll(pane1, pane2, pane3, pane4, pane5, pane6, pane7);
    pane2.getChildren().add(gridPane1);
    pane3.getChildren().add(vBox1);
    pane4.getChildren().add(vBox2);
    pane5.getChildren().add(vBox3);
    pane6.getChildren().add(borderPane);
    pane7.getChildren().add(vBox4);
}

    //Method to handle the events that happen when the Display button is clicked
    public void displayClicked(){
        txtArea.clear();

        //Getting the user's inputs on text fields
        String fullName = txtName.getText();
        String address = txtAddress.getText();
        String city = txtCity.getText();
        String province = txtProvince.getText();
        String postalCode = txtPostalCode.getText();
        String phoneNumber = txtPhone.getText();
        String email = txtEmail.getText();

        if(
                fullName == null || fullName.isEmpty() ||
                        address == null || address.isEmpty() ||
                        city == null || city.isEmpty() ||
                        province == null || province.isEmpty() ||
                        postalCode == null || postalCode.isEmpty() ||
                        phoneNumber == null || phoneNumber.isEmpty() ||
                        email == null || email.isEmpty()
                )
        {
            Alert windowAlert = new Alert(Alert.AlertType.WARNING);
            windowAlert.setTitle("WARNING");
            windowAlert.setHeaderText("Do not forget!");
            windowAlert.setContentText("It is necessary to fill all the fields");
            windowAlert.showAndWait();
        }
        else
        {
            txtArea.appendText(
                    "Full Name: " + fullName + "\n" +
                    "Address: " + address + "\n" +
                    "City: " + city + "\n" +
                    "Province: " + province + "\n" +
                    "Postal Code: " + postalCode + "\n" +
                    "Phone Number: " + phoneNumber + "\n" +
                    "Email: " + email + "\n");

            if(checkBox1.isSelected()){
                txtArea.appendText("Student Council: yes\n");
            }
            else {
                txtArea.appendText("Student Council: no\n");
            }
            if(checkBox2.isSelected()){
                txtArea.appendText("Volunteer Work: yes\n");
            }
            else {
                txtArea.appendText("Volunteer Work: no\n");
            }

            txtArea.appendText("Courses: \n");

            for (String course : addedCourses){
                txtArea.appendText(String.format("    - %s\n", course));
            }

        }
    }

    //Method to handle the events when the first/second radioButton is clicked
    public void radioClicked(){
    try {
        if (radioButton1.isSelected()) {
            compCourses = FXCollections.observableArrayList
                    (
                            " ",
                            "Java Programming Language",
                            "Python Programming Language",
                            "C# Programming Language"
                    );
            comboBox.setItems(compCourses);

        }
        if (radioButton2.isSelected()) {
            businessCourses = FXCollections.observableArrayList
                    (
                            " ",
                            "Business 1",
                            "Business 2",
                            "Business 3"
                    );

            comboBox.setItems(businessCourses);
        }
    }
    catch (Exception e) {}
    }

    //Method to handle the events when a course is added
    public void courseAdded() {

    try {
        if (comboBox.getSelectionModel().getSelectedItem() == "") {
            Alert windowAlert1 = new Alert(Alert.AlertType.WARNING);
            windowAlert1.setTitle("WARNING");
            windowAlert1.setHeaderText("This selection cannot be done!");
            windowAlert1.setContentText("This is not a valid course.");
            windowAlert1.showAndWait();
        } else if (addedCourses.contains(comboBox.getSelectionModel().getSelectedItem())) {
            Alert windowAlert2 = new Alert(Alert.AlertType.WARNING);
            windowAlert2.setTitle("WARNING");
            windowAlert2.setHeaderText("This selection cannot be done!");
            windowAlert2.setContentText("This course is already selected.");
            windowAlert2.showAndWait();
        } else if (addedCourses != null) {
            addedCourses.add(comboBox.getSelectionModel().getSelectedItem().toString());
        }

        selectedCourses.getItems().clear();
        selectedCourses.getItems().setAll(addedCourses);
    }
    catch (Exception e) {}
    }

    //Main method
    public static void main(String[] args) {
          launch(args);
    }

}


