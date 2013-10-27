package strategy.ducksystem.concrete;

import strategy.ducksystem.implementations.FlyWithWings;
import strategy.ducksystem.implementations.Quack;
import strategy.ducksystem.main.Duck;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("Eu sou um MallarDuck de verdade");
	}
}
