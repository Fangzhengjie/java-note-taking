package com.javanotetaking.designpattern.factory;

import com.javanotetaking.designpattern.factory.model.Weapon;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public final class WeaponFactory {

	private static class Singleton {
		private static final WeaponFactory INSTANCE = new WeaponFactory();
	}

	private interface ProviderMethod {
		Weapon create(WeaponProvider provider);
	}

	private final List<WeaponProvider> provider = new ArrayList<>();

	private WeaponFactory() {
		ClassLoader cl = WeaponFactory.class.getClassLoader();
		ServiceLoader<WeaponProvider> list = ServiceLoader.load(WeaponProvider.class, cl);
		list.forEach(provider::add);
	}

	public static Weapon produce(String type) {
		return pd(type, WeaponProvider::produce);
	}

	private static Weapon pd(String type, ProviderMethod fun) {

		for (WeaponProvider prov : Singleton.INSTANCE.provider) {
			if (prov.accept(type)) {
				return fun.create(prov);
			}
		}
		return null;
	}
}