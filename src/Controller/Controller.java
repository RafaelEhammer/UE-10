package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.Stack;

/************************************
 * @author Ehammer Rafael
 * @version 1.0
 ***********************************/

public class Controller
{
    Stack <String> stack = new Stack<String>();
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();

    @FXML private Button Button_1;
    @FXML private Button Button_2;
    @FXML private Button Button_3;
    @FXML private Button Button_4;
    @FXML private Button Button_5;
    @FXML private Button Button_6;
    @FXML private Button Button_7;
    @FXML private Button Button_8;
    @FXML private Button Button_9;
    @FXML private Button Button_0;
    @FXML private Button Button_comma;
    @FXML private Button Button_signminus;
    @FXML private TextArea TextArea;
    @FXML private TextField TextField;

    @FXML
    public void Number()
    {
        if (Button_0.isFocused())
        {
            sb1.append(0);
            TextField.setText(sb1.toString());
        }
        else if(Button_1.isFocused())
        {
            sb1.append(1);
            TextField.setText(sb1.toString());
        }
        else if(Button_2.isFocused())
        {
            sb1.append(2);
            TextField.setText(sb1.toString());
        }
        else if(Button_3.isFocused())
        {
            sb1.append(3);
            TextField.setText(sb1.toString());
        }
        else if(Button_4.isFocused())
        {
            sb1.append(4);
            TextField.setText(sb1.toString());
        }
        else if(Button_5.isFocused())
        {
            sb1.append(5);
            TextField.setText(sb1.toString());
        }
        else if(Button_6.isFocused())
        {
            sb1.append(6);
            TextField.setText(sb1.toString());
        }
        else if(Button_7.isFocused())
        {
            sb1.append(7);
            TextField.setText(sb1.toString());
        }
        else if(Button_8.isFocused())
        {
            sb1.append(8);
            TextField.setText(sb1.toString());
        }
        else if(Button_9.isFocused())
        {
            sb1.append(9);
            TextField.setText(sb1.toString());
        }
        else if(Button_comma.isFocused())
        {
            sb1.append(".");
            TextField.setText(sb1.toString());
        }
        else if(Button_signminus.isFocused())
        {
            sb1.append("-");
            TextField.setText(sb1.toString());
        }
    }

    @FXML
    public void Enter()
    {
        try {
            stack.push(sb1.toString());
            sb2.append(String.format("%s %n", sb1));
            TextArea.setText(String.valueOf(sb2));
            TextField.setText("");
            sb1.delete(0, sb1.length());
        }
        catch (Exception ex)
        {
            TextField.setText("ERROR!!!");
        }
    }

    @FXML
    public void C()
    {
        try {
            TextArea.clear();
            TextField.clear();
            sb1.delete(0, sb1.length());
            sb2.delete(0, sb2.length());
            stack.clear();
        }
        catch (Exception ex)
        {
            TextField.setText("ERROR!!!");
        }
    }
    @FXML
    public void CE()
    {
        try {
            TextField.clear();
            sb1.delete(0, sb1.length());
        }
        catch (Exception ex)
        {
            TextField.setText("ERROR!!!");
        }
    }
    @FXML
    public void Plus()
    {
        try {
            double FirstNum = Double.parseDouble(stack.pop());
            double SecondNum = Double.parseDouble(stack.pop());
            double result = FirstNum + SecondNum;

            stack.push(String.valueOf(result));
            TextField.setText(String.valueOf(result));
        }
        catch (Exception ex)
        {
            TextField.setText("ERROR!!!");
        }
    }
    @FXML
    public void Minus()
    {
        try {
            double FirstNum = Double.parseDouble(stack.pop());
            double SecondNum = Double.parseDouble(stack.pop());
            double result = FirstNum - SecondNum;

            stack.push(String.valueOf(result));
            TextField.setText(String.valueOf(result));
        }
        catch (Exception ex)
        {
            TextField.setText("ERROR!!!");
        }
    }
    @FXML
    public void Multiply()
    {
        try {
            double FirstNum = Double.parseDouble(stack.pop());
            double SecondNum = Double.parseDouble(stack.pop());
            double result = FirstNum * SecondNum;

            stack.push(String.valueOf(result));
            TextField.setText(String.valueOf(result));
        }
        catch (Exception ex)
        {
            TextField.setText("ERROR!!!");
        }
    }
    @FXML
    public void Divide()
    {
        try {
            double FirstNum = Double.parseDouble(stack.pop());
            double SecondNum = Double.parseDouble(stack.pop());
            double result = FirstNum / SecondNum;

            stack.push(String.valueOf(result));
            TextField.setText(String.valueOf(result));
        }
        catch (Exception ex)
        {
            TextField.setText("ERROR!!!");
        }
    }
    @FXML
    public void Reciprocal()
    {
        try {
            double FirstNum = Double.parseDouble(stack.pop());
            double result = 1 / FirstNum;

            stack.push(String.valueOf(result));
            TextField.setText(String.valueOf(result));
        }
        catch (Exception ex)
        {
            TextField.setText("ERROR!!!");
        }
    }
    @FXML
    public void Switch()
    {
        try {
            double FirstNum = Double.parseDouble(stack.pop());
            double SecondNum = Double.parseDouble(stack.pop());

            stack.push(String.valueOf(SecondNum));
            stack.push(String.valueOf(FirstNum));
            TextField.setText(String.valueOf(stack));
        }
        catch (Exception ex)
        {
            TextField.setText("ERROR!!!");
        }
    }
}
