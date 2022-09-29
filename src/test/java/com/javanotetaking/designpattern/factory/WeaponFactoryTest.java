package com.javanotetaking.designpattern.factory;

import java.util.Optional;
class WeaponFactoryTest {


	public static void main(String[] args) {
		Optional.ofNullable(WeaponFactory.produce("Tank")).ifPresent(weapon -> {
			weapon.openFire();
			weapon.ceaseFire();
		});
	}
}