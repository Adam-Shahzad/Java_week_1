package pizza;

import pizza.Pizza.BuilderPizza;

public class Create_Pizza {
public static void main(String[] args){
	
Create_Pizza cp  = new Create_Pizza();
Pizza chedder = cp.getPizza();

}
public Pizza getPizza(){
	return new
		Pizza.BuilderPizza("bbq", -1)._chease("chedder").build();
}
}

