module com.amalajith {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.persistence;
    requires java.xml.bind;
    requires net.bytebuddy;
//    requires org.hibernate.commons.annotations;
    requires com.fasterxml.classmate;
//    requires org.apache.derby.engine;
//    requires org.apache.derby.commons;

    opens com.amalajith to javafx.fxml;
    opens com.amalajith.controllers to javafx.fxml;
    opens com.amalajith.entities to org.hibernate.orm.core;

    exports com.amalajith;
}