package com.strategy.execute;

import com.strategy.model.People;
import com.strategy.strategy.AtHomeEat;
import com.strategy.strategy.AtPeoplesSquareEat;
import com.strategy.strategy.AtRestaurantEat;

/**
 * 测试程序
 * 
 * @author Mr-hang
 *
 */
public class ExecuteEatLunch {
	public static void main(String[] args) {
		// 我叫张晓明，今年22岁
		People people = new People("张晓明", 22);
		// 午餐吃什么呢？
		people.eatLunch(new AtHomeEat()); // 家里还有三包泡面，回家吃吧。。
		// 什么，家里泡面完了？
		people.eatLunch(new AtRestaurantEat()); // 下馆子吃泡面吧
		// 什么，面馆都散发着恋爱的酸臭味。。
		people.eatLunch(new AtPeoplesSquareEat()); // 买了个炸鸡，去人民广场吃炸鸡吧

	}
}
