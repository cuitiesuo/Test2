package com.example.demo;

import org.springframework.amqp.core.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Test123Application {
	final static String queueName = "helloQueue";

	@Bean
	public Queue helloQueue() {
		return new Queue("hello");
	}

	@Bean
	public Queue userQueue() {
		return new Queue("user");
	}

	//===============以下是验证topic Exchange的队列==========
	@Bean
	public Queue queueMessage() {
		return new Queue("topic.message");
	}

	@Bean
	public Queue queueMessages() {
		return new Queue("topic.messages");
	}
	//===============以上是验证topic Exchange的队列==========


	//===============以下是验证Fanout Exchange的队列==========
	@Bean
	public Queue AMessage() {
		return new Queue("fanout.A");
	}

	@Bean
	public Queue BMessage() {
		return new Queue("fanout.B");
	}

	@Bean
	public Queue CMessage() {
		return new Queue("fanout.C");
	}
	//===============以上是验证Fanout Exchange的队列==========


	@Bean
	TopicExchange exchange() {
		return new TopicExchange("exchange");
	}
	@Bean
	FanoutExchange fanoutExchange() {
		return new FanoutExchange("fanoutExchange");
	}

	/**
	 * 将队列topic.message与exchange绑定，binding_key为topic.message,就是完全匹配
	 * @param queueMessage
	 * @param exchange
	 * @return
	 */
	@Bean
	Binding bindingExchangeMessage(Queue queueMessage, TopicExchange exchange) {
		return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
	}

	/**
	 * 将队列topic.messages与exchange绑定，binding_key为topic.#,模糊匹配
	 *
	 * @param exchange
	 * @return
	 */
	@Bean
	Binding bindingExchangeMessages(Queue queueMessages, TopicExchange exchange) {
		return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
	}

	@Bean
	Binding bindingExchangeA(Queue AMessage,FanoutExchange fanoutExchange) {
		return BindingBuilder.bind(AMessage).to(fanoutExchange);
	}

	@Bean
	Binding bindingExchangeB(Queue BMessage, FanoutExchange fanoutExchange) {
		return BindingBuilder.bind(BMessage).to(fanoutExchange);
	}

	@Bean
	Binding bindingExchangeC(Queue CMessage, FanoutExchange fanoutExchange) {
		return BindingBuilder.bind(CMessage).to(fanoutExchange);
	}
	public static void main(String[] args) {
		SpringApplication.run(Test123Application.class, args);
		System.out.println("111111111111111");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		System.out.println("11");
		System.out.println("12");
		System.out.println("13");
		System.out.println("15");
		System.out.println("16");
		System.out.println("17");
        System.out.println("20");
		System.out.println("我是数字 ，该出通途了");
		System.out.println("我还是数字 ，该出通途了");
		System.out.println("2222");
		System.out.println("我还是1");
		System.out.println("你还来");
		System.out.println("再来一次");
		System.out.println("冲突好烦啊");
		System.out.println("谁说不是呢");
		System.out.println("最好一次成啊");
		System.out.println("咋回事");
		System.out.println("我也不知道啊");
		System.out.println("是不是终于成功了");
		System.out.println("好像是的");
		System.out.println("好的 我也想去tree玩玩");
		System.out.println("再来再来");
		System.out.println("嗯嗯  不要不要");
		System.out.println("天王盖地虎");
		System.out.println("闹他真和要");
		System.out.println("哈哈哈哈  张晓斌");
		System.out.println("我是苏鸡鸡鸡鸡光");

		System.out.println("对 你就是素鸡");
		System.out.println("90");
	}
}
