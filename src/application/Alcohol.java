/*
 * Class: CMSC203 
 * Instructor:Grinberg
 * Description: (Give a brief description for each Class)
 * Due: 07/29/2023
 * Platform/compiler:IDE Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here:Vivek Hubbly
*/

package application;

public class Alcohol extends Beverage{
    private boolean isWeekend;
    private final double WEEKEND_FEE = .6;
    
    
    public Alcohol(String n, Size s, boolean iw) {
            super(n, Type.ALCOHOL, s);
            isWeekend = iw;
    }
    public double calcPrice() {
        double price = super.getBasePrice();
        
        if (super.getSize() == Size.MEDIUM) {
                price += super.addSizePrice();
        }
        else if (super.getSize() == Size.LARGE) {
                price += 2 * super.addSizePrice();
        }
        
        if (isWeekend) {
                price += WEEKEND_FEE;
        }
        
        return price; 
}
    public String toString() {
            String s = getBevName() +", " +getSize();
            
            if (isWeekend) {
                    s += " Weekend";
            }          
            s += ", $" +calcPrice();
            return s;
    }
    public boolean equals(Alcohol a) {
            if (super.equals(a) && isWeekend == a.getIsWeekend()) {
                    return true;
            }
            else {
                    return false;
            }
    }
    public boolean getIsWeekend() {
        return isWeekend;
}
    public double getWeekendFee() {
        return WEEKEND_FEE;
}


    public void setIsWeekend(boolean is) {
        isWeekend = is;
}
    
}







