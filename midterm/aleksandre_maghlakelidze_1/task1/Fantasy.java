package midterm.aleksandre_maghlakelidze_1.task1;

import java.util.ArrayList;
import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    private String studentName = "Aleksandre Maghlakelidze";


    @Override
    public String getTruck1() {
        return "Truck";
    }

    @Override
    public String getCaucasus2() {
        return "Caucasus";
    }

    @Override
    public String methodLizard3(String argApparel5) {
        return "Lizard: " + argApparel5;
    }

    @Override
    public List<String> methodSoftware4(String argBat6) {
        List<String> result = new ArrayList<>();
        result.add("Software");
        result.add(argBat6);
        return result;
    }

    public String toString() {
        String result = "";
        result += "Student Name: " + studentName + "\n";
        result += "Truck: " + getTruck1() + "\n";
        result += "Caucasus: " + getCaucasus2() + "\n";
        result += "Lizard: " + methodLizard3("Apparel") + "\n";
        result += "Software: " + methodSoftware4("Bat").toString();
        return result;
    }
}
