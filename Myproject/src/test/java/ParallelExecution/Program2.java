package ParallelExecution;

import org.testng.annotations.Test;

public class Program2 {

	
	@Test
	public void test7() {
		System.out.println("Give the Id7>>>" + Thread.currentThread().getId());
	}
	@Test
	public void test8() {
		System.out.println("Give the Id8>>>" + Thread.currentThread().getId());
	}
	@Test
	public void test9() {
		System.out.println("Give the Id9>>>" + Thread.currentThread().getId());
	}
	@Test
	public void test4() {
		System.out.println("Give the Id10>>>" + Thread.currentThread().getId());
	}
	@Test
	public void test10() {
		System.out.println("Give the Id11>>>" + Thread.currentThread().getId());
	}
	@Test
	public void test11() {
		System.out.println("Give the Id12>>>" + Thread.currentThread().getId());
	}

}
