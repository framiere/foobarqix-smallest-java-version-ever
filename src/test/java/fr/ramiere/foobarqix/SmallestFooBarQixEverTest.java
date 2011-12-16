package fr.ramiere.foobarqix;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class SmallestFooBarQixEverTest {
	SmallestFooBarQixEver fooBarQix;

	@Before
	public void setup() {
		fooBarQix = new SmallestFooBarQixEver();
	}

	@Test
	public void one_to_ten() {
		assertThat(fooBarQix.convert(1)).isEqualTo("1");
		assertThat(fooBarQix.convert(2)).isEqualTo("2");
		assertThat(fooBarQix.convert(3)).isEqualTo("FooFoo");
		assertThat(fooBarQix.convert(4)).isEqualTo("4");
		assertThat(fooBarQix.convert(5)).isEqualTo("BarBar");
		assertThat(fooBarQix.convert(6)).isEqualTo("Foo");
		assertThat(fooBarQix.convert(7)).isEqualTo("QixQix");
		assertThat(fooBarQix.convert(8)).isEqualTo("8");
		assertThat(fooBarQix.convert(9)).isEqualTo("Foo");
		assertThat(fooBarQix.convert(10)).isEqualTo("Bar");
	}

	@Test
	public void dividers_first() {
		assertThat(fooBarQix.convert(51)).isEqualTo("FooBar");
	}

	@Test
	public void digit_orders() {
		assertThat(fooBarQix.convert(53)).isEqualTo("BarFoo");
	}

	@Test
	public void divider_orders() {
		assertThat(fooBarQix.convert(21)).isEqualTo("FooQix");
	}

	@Test
	public void contains_3() {
		assertThat(fooBarQix.convert(13)).isEqualTo("Foo");
	}

	@Test
	public void divisible_by_3_and_5_contains_5() {
		assertThat(fooBarQix.convert(15)).isEqualTo("FooBarBar");
	}

	@Test
	public void contains_double_3_and_is_divisible_by_3() {
		assertThat(fooBarQix.convert(33)).isEqualTo("FooFooFoo");
	}

	@Test
	public void test_45() {
		assertThat(fooBarQix.convert(45)).isEqualTo("FooBarBar");
	}
}
