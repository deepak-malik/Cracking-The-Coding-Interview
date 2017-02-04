/**
 * Cracking-The-Coding-Interview
 * Problem_06_Test.java
 */
package com.deepak.ctci.Ch03_Stacks_And_Queues;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Ch03_Stacks_And_Queues.Problem_06.AnimalShelter;
import com.deepak.ctci.Ch03_Stacks_And_Queues.Problem_06.AnimalShelter.Cat;
import com.deepak.ctci.Ch03_Stacks_And_Queues.Problem_06.AnimalShelter.Dog;

/**
 * Test cases for Problem 06
 * 
 * @author Deepak
 */
public class Problem_06_Test {

	/**
	 * Test case to check Animal Shelter
	 */
	@Test
	public void testAnimalShelter() {
		AnimalShelter shelter = new AnimalShelter();
		Assert.assertTrue(shelter.size() == 0);
		shelter.enqueue(new Dog("D1"));
		shelter.enqueue(new Dog("D2"));
		shelter.enqueue(new Cat("C1"));
		shelter.enqueue(new Cat("C2"));
		shelter.enqueue(new Dog("D3"));
		shelter.enqueue(new Cat("C3"));
		Assert.assertTrue(shelter.size() == 6);
		Assert.assertEquals(shelter.dequeueAny().name, "D1");
		Assert.assertEquals(shelter.dequeueCat().name, "C1");
		Assert.assertEquals(shelter.dequeueCat().name, "C2");
		Assert.assertEquals(shelter.dequeueDog().name, "D2");
		Assert.assertTrue(shelter.size() == 2);
	}

}
