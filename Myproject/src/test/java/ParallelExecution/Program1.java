package ParallelExecution;

import org.testng.annotations.Test;

public class Program1 {

	
	@Test
	public void test1() {
		System.out.println("Give the Id1>>>" + Thread.currentThread().getId());
	}
	@Test
	public void test2() {
		System.out.println("Give the Id2>>>" + Thread.currentThread().getId());
	}
	@Test
	public void test3() {
		System.out.println("Give the Id3>>>" + Thread.currentThread().getId());
	}
	@Test
	public void test4() {
		System.out.println("Give the Id4>>>" + Thread.currentThread().getId());
	}
	@Test
	public void test5() {
		System.out.println("Give the Id5>>>" + Thread.currentThread().getId());
	}
	@Test
	public void test6() {
		System.out.println("Give the Id6>>>" + Thread.currentThread().getId());
	}

}
