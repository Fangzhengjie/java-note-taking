package com.javanotetaking.designpattern.factory;

import com.javanotetaking.designpattern.factory.model.Fighter;
import com.javanotetaking.designpattern.factory.model.Weapon;

import java.util.Objects;

public class FighterFactory implements WeaponProvider {
	@Override
	public boolean accept(String type) {
		return Objects.equals(type, "Fighter");
	}

	@Override
	public Weapon produce() {
		return new Fighter();
	}
}
