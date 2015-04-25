package com.sigma.project.controller;

import com.sigma.project.view.MainFrame;

import javax.swing.JFrame;

/**
 * Created by Tahir on 4/20/2015.
 */
public class Controller{


  private MainFrame mainFrame;



  private static Controller controller;
  private Controller(){
    mainFrame = new MainFrame();
  }
  public static Controller getController(){
    if (controller == null){
      controller = new Controller();
    }

    return controller;

  }

  public static void main(String args[]){
    getController().showMainFrame();

  }

  private void showMainFrame() {
    mainFrame.show();
    mainFrame.setTitle("Employee Management System");
    mainFrame.setVisible(true);
    mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);

  }

}
