package com.terminology.algorithms;

public class OptimizationSolverProcessor implements Runnable {
	
	private final String jsonData;

	public OptimizationSolverProcessor(String jsonData) {
		super();
		this.jsonData = jsonData;
	}
	
	public String getJsonRequestData() {
		return jsonData;
	}

	@Override
	public void run() {
		try {
			System.out.println("calling solve  biz logic by "+Thread.currentThread().getName());
			
			String data = OptimizationSolver.solve(jsonData);
			
			System.out.println("formatted json :"+data);
			
			Thread.sleep(5000);
			
			System.out.println("processed biz logic successfully by "+Thread.currentThread().getName());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

