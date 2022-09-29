package com.javanotetaking.designpattern.factory;

import com.javanotetaking.designpattern.factory.model.Artillery;
import com.javanotetaking.designpattern.factory.model.Weapon;

import java.util.Objects;

public class ArtilleryFactory implements WeaponProvider {
	@Override
	public boolean accept(String type) {
		return Objects.equals(type, "Artillery");
	}

	@Override
	public Weapon produce() {
		return new Artillery();
	}
}
