package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class MyHooks {
	/*@Before
	public void beforeHook() {
		System.out.println("executing before hooks");
	}
	@After
	public void aftereHook() {
		System.out.println("afterhook is executing");
	}

}
*/
	///will execute randomly order 1 values
	/*
	 * @Before(order = 1) public void beforeHook1() {
	 * System.out.println("before hook 1 is executing");
	 * 
	 * }
	 * 
	 * @After(order =1) public void afterHook1() {
	 * System.out.println("After hook 1 is executing");
	 * 
	 * }
	 * 
	 * @Before(order = 2) public void beforeHook2() {
	 * System.out.println("before hook 2 is executing");
	 * 
	 * }
	 * @After(order = 2)
	public void afterHook2() {
		System.out.println("After hook 2 is executing");

}
	 */
	
	

	
/*
			@Before(order = 1)
			public void beforeHook1() {
				System.out.println("before hook 1 is executing");

			}

			@After(order =-4)
			public void afterHook1() {
				System.out.println("After hook 1 is executing");

			}
			
			@Before(order = -2)
			public void beforeHook2() {
				System.out.println("before hook 2 is executing");

			} 

			@After(order = 0)
			public void afterHook2() {
				System.out.println("After hook 2 is executing");

			}
		}



*/
	
	
	

	/*@Before(order = 1)
	public void beforeHook1() {
		System.out.println("before hook 1 is executing");

	}

	@After
	public void afterHook1() {
		System.out.println("After hook 1 is executing");

	}
	
	@Before
	public void beforeHook2() {
		System.out.println("before hook 2 is executing");

	} 

	@After(order = 0)
	public void afterHook2() {
		System.out.println("After hook 2 is executing");

	}
}
*/
	/*
	 * 
	 * 
	 * @Before(order = 1) public void beforeHook1() {
	 * System.out.println("before hook 1 is executing");
	 * 
	 * }
	 * 
	 * @After public void afterHook1() {
	 * System.out.println("After hook 1 is executing");
	 * 
	 * }
	 * 
	 * @Before public void beforeHook2() {
	 * System.out.println("before hook 2 is executing");
	 * 
	 * }
	 * 
	 * @After(order = 0) public void afterHook2() {
	 * System.out.println("After hook 2 is executing");
	 * 
	 * }
	 * 
	 * @BeforeStep public void beforeStep() {
	 * System.out.println("Before step is executing"); }
	 * 
	 * 
	 * @AfterStep public void afterStep() {
	 * System.out.println("After step is executing"); }
	 */	
	


	@Before("@sanity")//(order = 1)
	public void beforeHook1() {
		System.out.println("before hook 1 is executing");

	}

	@After("functional")
	public void afterHook1() {
		System.out.println("After hook 1 is executing");

	}
	

	
	@BeforeAll
	public static void beforeAllMethod()
	{
		System.out.println("before all is executing");
	}
	
	
	@AfterAll
	public static void afterAllMethod()
	{
		System.out.println("After all method is executing");
	}




			
	



}
