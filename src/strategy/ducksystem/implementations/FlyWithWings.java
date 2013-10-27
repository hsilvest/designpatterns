package strategy.ducksystem.implementations;

import strategy.ducksystem.interfaces.Flyable;

public class FlyWithWings implements Flyable {

	@Override
	public void fly() {
		System.out.println("Voando com minhas asas");
	}

}
