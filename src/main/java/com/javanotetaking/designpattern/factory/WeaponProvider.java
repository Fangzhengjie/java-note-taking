package com.javanotetaking.designpattern.factory;

import com.javanotetaking.designpattern.factory.model.Weapon;

public interface WeaponProvider {

	boolean accept(String type);

	Weapon produce();
}
