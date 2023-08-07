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

public abstract class Beverage {

	 private String name;
	    private Type type;
	    private Size size;
	    private final double BASE_PRICE = 2.0;
	    private final double SIZE_PRICE = 1.0;
	    
	 public Beverage(String n, Type t, Size s) {
         name = n;
         type = t;
         size = s;
    }
	 public double getBasePrice() {
	        return BASE_PRICE;
	}
	 public Type getType() {
	        return type;
	}
	 public String getBevName() {
	        return name;
	}
	 public Size getSize() {
	     return size;
	}
	 public double addSizePrice() {
	        return SIZE_PRICE;
	}
	 public void setName(String n) {
	        name = n;
	}
	public void setType(Type t) {
	        type  = t;
	}
	public void setSize(Size s) {
	        size = s;
	}  
	 public abstract double calcPrice();
	    public String toString() {
	            return name +", " +size;
	    }
	    public boolean equals(Beverage bev) {
	            if (name.equals(bev.getBevName()) && type==bev.getType() && size==bev.getSize()) {
	                    return true;
	            }
	            else {
	                    return false;
	            }
	    }
}



