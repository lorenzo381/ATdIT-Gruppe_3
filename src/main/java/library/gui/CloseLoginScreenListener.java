package library.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

class CloseLoginScreenListener implements ActionListener {

    JPasswordField passwordField;
    JTextField textField;
    String passwordString;
LogInScreen logInScreen;
ClassScreen classScreen;

    ResourceBundle resourcebundle=ResourceBundle.getBundle("presentation");

    public CloseLoginScreenListener(LogInScreen loginScreen,JPasswordField passwordField, JTextField textField) {
        this.textField = textField;
        this.passwordField = passwordField;
        this.logInScreen = loginScreen;

        System.out.println(resourcebundle.getString("here") + passwordString);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(resourcebundle.getString("passwordString"));
        this.passwordString = new String(passwordField.getPassword());
        if (passwordString.equals("ClassScreen")) {
            System.out.println(resourcebundle.getString(("successful"))); // hier hätte ich gerne eine kurze Verzögerung
            logInScreen.closeFrame();
            classScreen = new ClassScreen();


        } else {
            logInScreen.loginfailed();
            //System.out.println(passwordField.getPassword());

        }

    }
}

