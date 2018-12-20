package com.auribises.view;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.auribises.model.User;

public class RegisterUserGUI implements ActionListener{
	
	// References to the Objects
	// Attributes of RegisterUserGUI Object
	Frame fr;
	Label lblTitle, lblName, lblAge, lblEmail, lblPassword;
	TextField txtName, txtAge, txtEmail, txtPassword;
	Button btnSubmit;
	Panel pnlTitle, pnlName, pnlAge, pnlEmail, pnlPassword, pnlButton, pnlAll;
	
	public RegisterUserGUI() {
		fr = new Frame();
		fr.setTitle("Register");
		
		lblTitle = new Label("Register Yourself !!");
		lblName = new Label("Enter Your Name");
		lblAge = new Label("Enter Your Age");
		lblEmail = new Label("Enter Your Email");
		lblPassword = new Label("Enter Your Password");
		
		txtName = new TextField(16);
		txtAge = new TextField(16);
		txtEmail = new TextField(16);
		txtPassword = new TextField(16);

		btnSubmit = new Button("Submit");
		btnSubmit.addActionListener(this);
		
		pnlTitle = new Panel();
		pnlName = new Panel();
		pnlAge = new Panel();
		pnlEmail = new Panel();
		pnlPassword = new Panel();
		pnlButton = new Panel();
		pnlAll = new Panel();
		
		
		
	}
	
	public void showGUI(){
		pnlTitle.add(lblTitle);
		
		pnlName.add(lblName);
		pnlName.add(txtName);
		
		pnlAge.add(lblAge);
		pnlAge.add(txtAge);
		
		pnlEmail.add(lblEmail);
		pnlEmail.add(txtEmail);
		
		pnlPassword.add(lblPassword);
		pnlPassword.add(txtPassword);
		
		pnlButton.add(btnSubmit);
		
		pnlAll.add(pnlTitle);
		pnlAll.add(pnlName);
		pnlAll.add(pnlAge);
		pnlAll.add(pnlEmail);
		pnlAll.add(pnlPassword);
		pnlAll.add(pnlButton);
		
		GridLayout layout = new GridLayout(6, 1);
		pnlAll.setLayout(layout);
		
		fr.add(pnlAll);
		
		fr.setSize(400, 400);
		fr.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		User user = new User();
		user.name = txtName.getText();
		user.age = Integer.parseInt(txtAge.getText());
		user.email = txtEmail.getText();
		user.password = txtPassword.getText();
		
		System.out.println(user);
	}

}
