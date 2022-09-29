package com.javanotetaking.designpattern.factory.model;

public final class Tank implements Weapon{
	@Override
	public void openFire() {
		System.out.println("Tank Open Fire");
	}

	@Override
	public void ceaseFire() {
		System.out.println("Tank Cease Fire");
	}
}
