# 🎨 ColorChooser App

## Project Overview
The **ColorChooser App** is a simple JavaFX application that allows users to mix and match color values using sliders and text fields for Red, Green, Blue, and Alpha (transparency) components. Users can see the resulting color displayed in a rectangle as they adjust values.

This project is part of 📘 *CSC 325 - Software Engineering* Lab 5, where the primary focus is to implement bidirectional bindings in JavaFX.

## Features
- 🎚️ **Interactive Color Sliders**: Sliders for Red, Green, Blue, and Alpha channels allow users to modify the color dynamically.
- 🔄 **Bidirectional Binding**: Each slider is bidirectionally bound to a corresponding text field, so changing one automatically updates the other.
- 🖌️ **Real-time Color Display**: The rectangle on the interface updates instantly to reflect the selected color based on slider values.

## Technologies Used
- ☕ **JavaFX**: For GUI development and property bindings.
- 📄 **FXML**: Defines the layout and components of the GUI.
- 💻 **Java**: Core logic implemented with Java classes.

## How to Run
1. Ensure JavaFX is installed and configured in your Java IDE.
2. Open the project in an IDE such as IntelliJ IDEA or Eclipse.
3. Run the `ColorChooser` class to start the application.

## Project Structure
- `ColorChooser.java`: Main application class that initializes and starts the JavaFX application.
- `ColorChooserController.java`: Controller class handling interactions between sliders, text fields, and the color display rectangle.
- `ColorChooser.fxml`: FXML layout file for the GUI components.

## Author
👤 **Himal Shrestha**

## Course
📘 **CSC 325 - Software Engineering**
