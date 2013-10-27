package strategy.ducksystem.test;

import strategy.ducksystem.concrete.MallardDuck;
import strategy.ducksystem.implementations.FlyRocketPowered;
import strategy.ducksystem.main.Duck;
import strategy.ducksystem.main.ModelDuck;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
