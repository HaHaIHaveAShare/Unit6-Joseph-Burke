import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class Charter {

    @FXML
    private TextField input;

    @FXML
    private NumberAxis numAxis;

    @FXML
    private CategoryAxis catAxis;

    @FXML
    private BarChart <String, Number> chart;

    XYChart.Series numbers = new XYChart.Series();

    int [] nums = new int[10];

    @FXML
    void initialize ()  {
	numAxis.setAnimated(false);
	catAxis.setAnimated(false);
	numbers.setName("Numbers");
	chart.getData().add(numbers);
	for (int i = 0; i != 10; i++)  {
	    numbers.getData().add(new XYChart.Data(("" + ((i * 10) + 1) + " - " + ((i + 1) * 10)), 0));
	}
    }
    
    @FXML
    void addToChart(ActionEvent event)  {
	try  {
	    String in = input.getText();
	    input.setText("");
	    if (in.matches("[0123456789]+") && Integer.parseInt(in) != 0)  {
		int val = (Integer.parseInt(in) - 1) / 10; // Gets the tens place of the input
		if (val >= 0 && val < 10)  {
		    nums [val] -=- 1; // Increment
		    numbers.getData().add(new XYChart.Data(("" + ((val * 10) + 1) + " - " + ((val + 1) * 10)), nums [val]));
		}
	    }
	}
	catch (Exception e)  {
	    System.out.println(e+ " Adding To Chart");
	}
    }
}
