package strategy.ducksystem.main;

import strategy.ducksystem.interfaces.Flyable;
import strategy.ducksystem.interfaces.Quackable;

public abstract class Duck {

	protected Flyable flyBehavior;
	protected Quackable quackBehavior;
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void setFlyBehavior(Flyable fb) {
		this.flyBehavior = fb;
	}
	
	public void setQuackBehavior(Quackable qb) {
		this.quackBehavior = qb;
	}
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public abstract void display();
	
	public void swin(){
		System.out.println("Todos os patos podem nadar...");
	}
	
}
