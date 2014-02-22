package org.bitcoinmonitor;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.mqtt.core.DefaultMqttPahoClientFactory;
import org.springframework.stereotype.Component;

@Component
public class BitCoinMqttClient {
	DefaultMqttPahoClientFactory factory;
	MqttClient client = null;

	public BitCoinMqttClient() throws Exception {
		factory = new DefaultMqttPahoClientFactory();
		factory.setPassword("guest");
		factory.setUserName("foobar");
		client = factory.getClientInstance("tcp://localhost:1883", "guest");
		client.connect();

	}
	
	@ServiceActivator
	public void sendData(String result) throws MqttException {
		MqttMessage mqttMessage = new MqttMessage();
		mqttMessage.setPayload(result.getBytes());

		client.publish("xd.mqtt.test", mqttMessage);
		System.out.print(client.getPendingDeliveryTokens().length + ",");
		if (client.getPendingDeliveryTokens().length > 0)
			System.out.println("Publishval  "
					+ client.getPendingDeliveryTokens()[0]);
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		client.disconnect();
//		client.close();

	}
}
