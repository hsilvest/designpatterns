package strategy.ducksystem.implementations;

import strategy.ducksystem.interfaces.Quackable;

public class MuteQuack implements Quackable {

	@Override
	public void quack() {
		System.out.println("<<Silence>>");
	}

}
