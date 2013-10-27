package strategy.ducksystem.implementations;

import strategy.ducksystem.interfaces.Quackable;

public class Squeak implements Quackable {

	@Override
	public void quack() {
		System.out.println("Squeak!!!!");
	}

}
