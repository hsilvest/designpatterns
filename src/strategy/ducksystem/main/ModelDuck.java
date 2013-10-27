package strategy.ducksystem.main;

import strategy.ducksystem.implementations.FlyNoWay;
import strategy.ducksystem.implementations.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("Sou um Model Duck");
		
	}
	
}
