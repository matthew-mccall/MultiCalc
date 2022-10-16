module dev.mmccall.multicalc {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.jetbrains.annotations;

    opens dev.mmccall.multicalc to javafx.fxml;
    exports dev.mmccall.multicalc;
    exports dev.mmccall.multicalc.math;
    opens dev.mmccall.multicalc.math to javafx.fxml;
    exports dev.mmccall.multicalc.controllers;
    opens dev.mmccall.multicalc.controllers to javafx.fxml;
}