package himal.lab5colorchooser;
/**
 * Himal Shrestha
 * CSC 325 - Software Engineering
 * LAB 5 Color Chooser Part 2
 */

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.converter.NumberStringConverter;

public class ColorChooserController {
    // GUI components for sliders and text fields
    @FXML
    private Slider redSlider;
    @FXML
    private Slider greenSlider;
    @FXML
    private Slider blueSlider;
    @FXML
    private Slider alphaSlider;
    @FXML
    private TextField redTextField;
    @FXML
    private TextField greenTextField;
    @FXML
    private TextField blueTextField;
    @FXML
    private TextField alphaTextField;
    @FXML
    private Rectangle colorRectangle;

    // Variables for color values
    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double alpha = 1.0;

    /**
     * The initialize method is called after the FXML file is loaded.
     * It sets up bidirectional bindings between each Slider and its respective TextField,
     * and adds listeners to update the Rectangle color based on the slider values.
     */
    public void initialize() {
        // Bidirectional bindings between TextField and Slider for red color value
        redTextField.textProperty().bindBidirectional(redSlider.valueProperty(), new NumberStringConverter());

        // Bidirectional bindings between TextField and Slider for green color value
        greenTextField.textProperty().bindBidirectional(greenSlider.valueProperty(), new NumberStringConverter());

        // Bidirectional bindings between TextField and Slider for blue color value
        blueTextField.textProperty().bindBidirectional(blueSlider.valueProperty(), new NumberStringConverter());

        // Bidirectional bindings between TextField and Slider for alpha (transparency) value
        alphaTextField.textProperty().bindBidirectional(alphaSlider.valueProperty(), new NumberStringConverter());

        // Listener for red slider - updates red color component and fills the rectangle
        redSlider.valueProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
                        red = newValue.intValue();
                        colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
                    }
                }
        );

        // Listener for green slider - updates green color component and fills the rectangle
        greenSlider.valueProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
                        green = newValue.intValue();
                        colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
                    }
                }
        );

        // Listener for blue slider - updates blue color component and fills the rectangle
        blueSlider.valueProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
                        blue = newValue.intValue();
                        colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
                    }
                }
        );

        // Listener for alpha slider - updates alpha (transparency) component and fills the rectangle
        alphaSlider.valueProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
                        alpha = newValue.doubleValue();
                        colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
                    }
                }
        );
    }
}
