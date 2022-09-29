package com.javanotetaking.designpattern.factory.model;

public class Artillery implements Weapon {
	@Override
	public void openFire() {
		System.out.println("Artillery Open Fire");
	}

	@Override
	public void ceaseFire() {
		System.out.println("Artillery Cease Fire");
	}
}
