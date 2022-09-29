package com.javanotetaking.designpattern.factory;

import com.javanotetaking.designpattern.factory.model.Tank;
import com.javanotetaking.designpattern.factory.model.Weapon;

import java.util.Objects;

public class TankFactory implements WeaponProvider{
	@Override
	public boolean accept(String type) {
		return Objects.equals(type, "Tank");
	}

	@Override
	public Weapon produce() {
		return new Tank();
	}
}
