package strategy.ducksystem.implementations;

import strategy.ducksystem.interfaces.Flyable;

public class FlyRocketPowered implements Flyable {

	@Override
	public void fly() {
		
		System.out.println("Voando como um foguete");
		
	}

}
