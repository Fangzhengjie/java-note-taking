package com.javanotetaking.designpattern.factory;

import com.javanotetaking.designpattern.factory.model.MachineGun;
import com.javanotetaking.designpattern.factory.model.Weapon;

import java.util.Objects;

public class MachineGunFactory implements WeaponProvider {

	@Override
	public boolean accept(String type) {
		return Objects.equals(type, "Machine Gun");
	}

	@Override
	public Weapon produce() {
		return new MachineGun();
	}
}
