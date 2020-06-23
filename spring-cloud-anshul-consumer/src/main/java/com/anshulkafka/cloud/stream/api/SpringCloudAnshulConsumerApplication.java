package com.anshulkafka.cloud.stream.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication
@EnableBinding(Sink.class)
public class SpringCloudAnshulConsumerApplication {

	
	private Logger logger = LoggerFactory.getLogger(SpringCloudAnshulConsumerApplication.class);

	 
	@StreamListener("input")
	public void consumemeassage(Book book) {
		 logger.info("Consume payload : "+book);
		 
	 }
	
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAnshulConsumerApplication.class, args);
	}

}
