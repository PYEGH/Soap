package com.epam.service;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class RandomNumberGenerator { 

	/**
	 * Returns a random number between given the lower and upper bound.
	 * 
	 * @param lowerBound
	 * @param upperBound 
	 * @return
	 */
	@WebMethod
	public int randomNumber(int lowerBound, int upperBound) {
		return lowerBound
				+ (int) (Math.random() * ((upperBound - lowerBound) + 1));
	}
}
