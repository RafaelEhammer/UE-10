package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/************************************
 * @author Ehammer Rafael
 * @version 1.0
 ***********************************/

public class Model
{
    private Stack <String> Stack = new Stack<String>();
    private StringBuilder Sb = new StringBuilder();
    private ArrayList <Double> numbers = new ArrayList<Double>();

    public ObservableList <String> getObservableList()
    {
        List <String> string = new ArrayList<>(Stack);
        Collections.reverse(string);
        return FXCollections.observableList(string);
    }
    public void deleteStack()
    {
        Stack.clear();
        numbers.clear();
    }
    public void pushStack(String string)
    {
        Stack.push(string);
    }
    public StringBuilder getStringbuilder()
    {
        return Sb;
    }
    private double plus(double result)
    {
        for (int i = 0; i < numbers.size(); i++)
        {
            result = result + numbers.get(i);
        }
        return result;
    }

    private double minus(double result)
    {
        for (int i = 0; i < numbers.size(); i++)
        {
            result = result - numbers.get(i);
        }
        return result;
    }

    private double multiply(double result)
    {
        try
        {
            for (int i = 0; i < numbers.size(); i++)
            {
                result = numbers.get(i) * numbers.get(i+1);
            }
        }
        catch (Exception exception)
        {

        }
        return result;
    }

    private double divide(double result)
    {
        try
        {
            for (int i = 0; i < numbers.size(); i++)
            {
                result = numbers.get(i) / numbers.get(i+1);
            }
        }
        catch (Exception exception)
        {

        }
        return result;
    }
    public double calculation()
    {
        double result = 0;
        Collections.reverse(Stack);

        while(!Stack.isEmpty())
        {
            String op = Stack.pop();
            switch (op)
            {
                case "+":
                    result = plus(result);
                    break;
                case "-":
                    result = minus(result);
                    break;
                case "*":
                    result = multiply(result);
                    break;
                case "/":
                    result = divide(result);
                    break;
                default:
                    numbers.add(Double.parseDouble(op));
                    break;
            }
        }
        return result;
    }
}
