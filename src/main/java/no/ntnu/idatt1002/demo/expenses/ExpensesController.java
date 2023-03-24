package no.ntnu.idatt1002.demo.expenses;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import java.time.LocalDate;

public class ExpensesController {
  @FXML
  private CheckBox foodChecked;
  @FXML
  private CheckBox housingChecked;
  @FXML
  private CheckBox fixedExpensesChecked;
  @FXML
  private CheckBox travelChecked;
  @FXML
  private CheckBox otherChecked;
  @FXML
  private DatePicker fromDate;
  @FXML
  private DatePicker toDate;
  
  public void editCategoryButtonPushed(){
    System.out.println("The category button has been pushed");
  }

  public void editExpensesButtonPushed(){
    System.out.println("The edit expenses button has been pushed");
  }

  public void viewIncomeButtonPushed(){
    System.out.println("The view income button has been pushed");
  }

  public void changeToBarGraphButtonPushed(){
    System.out.println("The change to bar graph button has been pushed");
  }
  @FXML
  private void foodChecked(){
    if(!foodChecked.isSelected()){
      System.out.println("food is de-checked");
    }else if (foodChecked.isSelected()){
      System.out.println("food selected");
    }
  }

  @FXML
  private void housingChecked(){
    if(!housingChecked.isSelected()){
      System.out.println("housing is de-checked");
    }else if (housingChecked.isSelected()){
      System.out.println("housing selected");
    }
  }
  @FXML
  private void fixedExpensesChecked(){
    if(!fixedExpensesChecked.isSelected()){
      System.out.println("fixed expenses is de-checked");
    }else if (fixedExpensesChecked.isSelected()){
      System.out.println("fixed expenses selected");
    }
  }

  @FXML
  private void travelChecked(){
    if(!travelChecked.isSelected()){
      System.out.println("fixed expenses is de-checked");
    }else if (travelChecked.isSelected()){
      System.out.println("fixed expenses selected");
      System.out.println(fromDate.getValue());
    }
  }

  @FXML
  private void otherChecked(){
    if(!otherChecked.isSelected()){
      System.out.println("fixed expenses is de-checked");
    }else if (otherChecked.isSelected()){
      System.out.println("fixed expenses selected");
    }
  }

  @FXML
  private String timeInterval() { //TODO: optimize...
    String result = null;
    if (fromDate.isManaged() || toDate.isManaged()) {
      LocalDate startDate = fromDate.getValue();
      LocalDate stopDate = toDate.getValue();
      if (toDate == null) {
        toDate = fromDate;
        result = ("(" + startDate + ")");
      } else if (stopDate.isAfter(startDate)) {
        result = ("(" + startDate + "->" + stopDate + ")");
      } else if (startDate.isAfter(stopDate)) {
        startDate = toDate.getValue();
        stopDate = fromDate.getValue();
        result = ("(" + startDate + "->" + stopDate + ")");
      }
    } return result;
  }
}

