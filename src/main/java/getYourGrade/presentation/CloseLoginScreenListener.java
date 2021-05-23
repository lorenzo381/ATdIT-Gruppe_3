package getYourGrade.presentation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CloseLoginScreenListener implements ActionListener {

    JPasswordField passwordField;
    JTextField textField;
    String passwordString;
    LogInScreen logInScreen;
    ClassScreen classScreen;

    public CloseLoginScreenListener(LogInScreen loginScreen, JPasswordField passwordField, JTextField textField) {
        this.textField = textField;
        this.passwordField = passwordField;
        this.logInScreen = loginScreen;

        System.out.println("Hier: " + passwordString);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("passwordString");
        this.passwordString = new String(passwordField.getPassword());
        if (passwordString.equals("Password")) {
            System.out.println("succesful");
            logInScreen.closeFrame();
            classScreen = new ClassScreen();


        } else {
            logInScreen.loginfailed();

        }

    }
}

