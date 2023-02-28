package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc018猫狗多态案例;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ccc015test_run {
	public static void main(String[] args) {
		System.out.println("我是测试类");
		ccc013test_animal x = new ccc014test_dog();
		x.setName("111");
		x.setAge(222);
		x.eat(x);
	}
}
