package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc026运动员和教练案例;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ccc045demo {
	public static void main(String[] args) {
		ccc041乒乓球运动员 p1 = new ccc041乒乓球运动员(11, "aaa");
		log.info("player information-------------");
		log.info("队员姓名：" + p1.getName() + "---队员年龄：" + p1.getAge());
		p1.eat();
		p1.study();
		p1.learn();
		log.info("guide information-------------");
		ccc043乒乓球教练 g1 = new ccc043乒乓球教练(35, "ggg");
		log.info("教练姓名：" + g1.getName() + "---教练年龄：" + g1.getAge());
		g1.eat();
		g1.teach();
		g1.learn();
		log.info("-------------------------------------");
		log.info("player information-------------");
		ccc042篮球运动员 p2 = new ccc042篮球运动员(22, "bbb");
		log.info("队员姓名：" + p2.getName() + "---队员年龄：" + p2.getAge());
		p2.eat();
		p2.study();
		log.info("guide information-------------");
		ccc044篮球教练 g2 = new ccc044篮球教练(45, "wwwww");
		log.info("教练姓名：" + g2.getName() + "---教练年龄：" + g2.getAge());
		g2.eat();
		g2.teach();
	}
}
