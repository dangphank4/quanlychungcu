module thidk.bluemoon {
    requires javafx.controls;
    requires javafx.fxml;


    opens thidk.bluemoon to javafx.fxml;
    exports thidk.bluemoon;
    exports thidk.bluemoon.login;
    opens thidk.bluemoon.login to javafx.fxml;
}