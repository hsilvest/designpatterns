package strategy.ducksystem.implementations;

import strategy.ducksystem.interfaces.Quackable;

public class Quack implements Quackable {

	@Override
	public void quack() {
		System.out.println("Quack Quack Quack...");

	}

}
