package strategy.ducksystem.implementations;

import strategy.ducksystem.interfaces.Flyable;

public class FlyNoWay implements Flyable {

	@Override
	public void fly() {
		System.out.println("Eu não posso voar :(");

	}

}
