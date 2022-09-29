package com.javanotetaking.designpattern.factory.model;

public class Rifle implements Weapon {

	@Override
	public void openFire() {
		System.out.println("Rifle Open Fire");
	}

	@Override
	public void ceaseFire() {
		System.out.println("Rifle Cease Fire");
	}
}
