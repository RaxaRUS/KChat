module com.chatapp.chat {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;


    opens com.chatapp.chat to javafx.fxml;
    exports com.chatapp.chat;
}