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

public class Coffee extends Beverage{
    private boolean extraShot;
    private boolean extraSyrup;
    private final double SHOT_COST = .5;
    private final double SYRUP_COST = .5;
    
    
    public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
            super(bevName, Type.COFFEE, size);
            this.extraShot = extraShot;
            this.extraSyrup = extraSyrup;
    }
    
    public boolean getExtraShot() {
        return extraShot;
}
    public boolean getExtraSyrup() {
        return extraSyrup;
}
    
    public double calcPrice() {
        double price = super.getBasePrice();
        
        if (super.getSize() == Size.MEDIUM) {
                price += super.addSizePrice();
        }
        else if (super.getSize() == Size.LARGE) {
                price += 2 * super.addSizePrice();
        }
        
        if (extraShot) {
                price += SHOT_COST;
        }
        if (extraSyrup) {
                price += SYRUP_COST;
        }
        
        return price;
}
    public double getShotCost() {
        return SHOT_COST;
}
    public double getSyrupCost() {
        return SYRUP_COST;
}
    public void setExtraShot(boolean shot) {
        extraShot = shot;
}
    public void setExtraSyrup(boolean syrup) {
        extraSyrup = syrup;
}
    public String toString() {
            String shot = getBevName() +", " +getSize();
            
            if (extraShot) {
                    shot += " Extra shot";
            }
            if (extraSyrup) {
                    shot += " Extra syrup";
            }
            
            shot += ", $" +calcPrice();
            
            return shot;
    }
   
    public boolean equals(Coffee c) {
            if (super.equals(c) && extraShot==c.getExtraShot() && extraSyrup==c.getExtraSyrup()) {
                    return true;
            }
            else {
                    return false;
            }
    }
}



