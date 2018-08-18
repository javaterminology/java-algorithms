package com.terminology.algorithms;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class OptimizationSolver {

	public static String solve(String jsonData){
		System.out.println("process business logic...");
		return jsonData;
	}

	public static void main(String[] args) {
		//sample json string will have license info and environment details
		String json_data = "["
				+ "{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}"
				+ "]";

		// Wait queue is used to store waiting task
		BlockingQueue queue=new LinkedBlockingQueue(5);

		// Thread factory to create new threads
		ThreadFactory threadFactory = Executors.defaultThreadFactory();

		// Rejection handler in case task get rejected
		RejectTaskHandler rth = new RejectTaskHandler();

		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 5, 10L, TimeUnit.MILLISECONDS, queue,
				threadFactory,rth
				);
		OptimizationSolverProcessor processor = new OptimizationSolverProcessor(json_data);

		threadPoolExecutor.execute(processor);

		threadPoolExecutor.shutdown();

	}



}
