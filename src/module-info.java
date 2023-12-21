/**
 * 
 */
/**
 * 
 */
module SGBD_TP8 {
    requires java.sql;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    // Exportez votre package 'vue'
    opens vue;

    // Autres directives requires
    exports main;
}	