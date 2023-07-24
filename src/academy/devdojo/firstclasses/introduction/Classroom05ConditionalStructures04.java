package academy.devdojo.firstclasses.introduction;

public class Classroom05ConditionalStructures04 {
    // I want to know how much I have to pay in the Netherlands 2020 based on my annual salary
    public static void main(String[] args) {
        double annualSalary = 70000;
        double firstTrack = 9.70 / 100;
        double secondTrack = 37.35 / 100;
        double thirdTrack = 49.50 / 100;
        double taxValue;

        if (annualSalary <= 34712){
            taxValue = annualSalary * firstTrack;
        
        } else if (annualSalary >= 34712 && annualSalary <= 68507) {
            taxValue = annualSalary * secondTrack;
            
        }else {
            taxValue = annualSalary * thirdTrack;
        }

        System.out.println(taxValue);

    }
}