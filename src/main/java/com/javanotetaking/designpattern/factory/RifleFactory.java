package com.javanotetaking.designpattern.factory;

import com.javanotetaking.designpattern.factory.model.Rifle;
import com.javanotetaking.designpattern.factory.model.Weapon;

import java.util.Objects;

public class RifleFactory implements WeaponProvider {
	@Override
	public boolean accept(String type) {
		return Objects.equals(type, "Rifle");
	}

	@Override
	public Weapon produce() {
		return new Rifle();
	}
}
