package com.terminology.algorithms;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class RejectTaskHandler implements RejectedExecutionHandler{
	 
	 @Override
	 public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
	   OptimizationSolver opt_solver =(OptimizationSolver) r;
	  System.out.println("Sorry!! We won't be able to process solve  :"+opt_solver.solve(""));  
	 }
}