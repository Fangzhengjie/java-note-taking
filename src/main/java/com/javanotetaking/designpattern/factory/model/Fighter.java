package com.javanotetaking.designpattern.factory.model;

public class Fighter implements Weapon{
	@Override
	public void openFire() {
		System.out.println("Fighter Open Fire");
	}

	@Override
	public void ceaseFire() {
		System.out.println("Fighter Cease Fire");
	}
}
