import javax.swing.*;
import java.security.InvalidParameterException;

public class Toy {
    private int id;
    private String name;
    private int count;
    private double frequency;

    public Toy(String name, int count, double frequency) {
        this.id = IdGenerator.IdGenerator();
        this.name = name;
        this.count = count;
        this.frequency = frequency;
    }

    public void ChangeFrequency(double frequency) {
        if (frequency >= 0 && frequency <= 100){
            this.frequency = frequency/100;
        }
        else{
            throw new NumberFormatException("Введена некоректная вероятность");
        }
    }

    public  void ChangeName(String name){
        if (name.length() > 0){
            this.name = name;
        }
        else{
            throw new InvalidParameterException("Введено пустое название");
        }
    }

    public void ChangeCount(int count){
        this.count = count;
    }

    public int getCount(){
        return this.count;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getFrequency(){
        return this.frequency;
    }
}
