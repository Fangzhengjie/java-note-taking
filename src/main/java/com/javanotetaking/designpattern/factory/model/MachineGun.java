package com.javanotetaking.designpattern.factory.model;

public class MachineGun implements Weapon{
	@Override
	public void openFire() {
		System.out.println("MachineGun Open Fire");
	}

	@Override
	public void ceaseFire() {
		System.out.println("MachineGun Cease Fire");
	}
}
