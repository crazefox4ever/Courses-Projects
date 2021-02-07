/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sems;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;

 
public class pieChart extends Application {
 @Override
     public void start(Stage stage) {
         
        Scene scene = new Scene(new Group());
        stage.setTitle("consumption");
        stage.setWidth(500);
        stage.setHeight(500);
        
 
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
        new PieChart.Data("Current",10),
        new PieChart.Data("Total" ,90));
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Consumption");
        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();
        
    }
 
    public static void main(String[] args) {
        launch(args);
    }

    
}


