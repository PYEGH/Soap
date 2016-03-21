package com.epam.client.lottery;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.epam.client.automatic.RandomNumberGenerator;

public class RandomNumberGeneratorClient {

	private final static String URL = "http://localhost:8089/randomTcat?wsdl";
	private final static String SERVICE_URI = "http://service.epam.com/";
	private final static String SERVICE_NAME = "RandomNumberGeneratorService";
	private final static int NUMBER_OF_LOTTERY_ITERATIONS = 6;
 
	public static void startLottery() throws Exception { 
		URL url = new URL(URL);

		// 1st argument service URI, refer to wsdl document above
		// 2nd argument is service name, refer to wsdl document above
		QName qname = new QName(SERVICE_URI, SERVICE_NAME);

		Service service = Service.create(url, qname);

		RandomNumberGenerator randomNumberGenerator = service
				.getPort(RandomNumberGenerator.class);

		for (int i = 0; i < NUMBER_OF_LOTTERY_ITERATIONS; i++) {
			System.out.println(randomNumberGenerator.randomNumber(1, 49));
		}
	}

}
