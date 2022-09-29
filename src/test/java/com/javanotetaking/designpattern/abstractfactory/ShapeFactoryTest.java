package com.javanotetaking.designpattern.abstractfactory;

import com.javanotetaking.designpattern.abstractfactory.ShapeFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class ShapeFactoryTest {

	@Test
	void test() {
		Optional.ofNullable(new ShapeFactory().getShape("CIRCLE")).ifPresent(shape -> shape.draw());
		Optional.ofNullable(new ShapeFactory().getShape("CIRCLE")).ifPresent(shape -> shape.draw());
		Optional.ofNullable(new ShapeFactory().getShape("CIRCLE")).ifPresent(shape -> shape.draw());
	}

}