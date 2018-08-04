package t;

import java.util.Scanner;

/**
 * 
 * Title: RateCalculation 税率计算
 * 
 * Description:
 * 
 * @author ZhongLingYun
 * 
 * @date 2018年8月4日
 * 
 */
public class RateCalculation {

	public static void main(String[] args) {
		System.out.print("请输入你的工资（只能是数字不能是字符）:");
		Scanner scanner = new Scanner(System.in);
		double money = scanner.nextDouble();
		double tax;
		if (money <= 1500) {
			tax = money * 0.03;
			System.out.println("所需缴纳的税费为" + tax);
			return;
		}
		if (money > 1500 && money <= 4500) {
			tax = (money - 1500) * 0.1 + 1500 * 0.03;
			System.out.println("所需缴纳的税费为" + tax);
			return;
		}
		if (money > 4500 && money <= 900) {
			tax = 1500 * 0.03 + 3000 * 0.1 + (money - 4500) * 0.2;
			System.out.println("所需缴纳的税费为" + tax);
			return;
		}
		if (money > 9000 && money <= 35000) {
			tax = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + (money - 9000) * 0.25;
			System.out.println("所需缴纳的税费为" + tax);
			return;
		}
		if(money>35000&&money<=55000) {
			tax=1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 +26000*0.25+(money-35000)*0.3;
			System.out.println("所需缴纳的税费为" + tax);
			return;
		}
		if(money>55000&&money<=88000) {
			tax=1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 +26000*0.25+20000*0.3+(money-55000)*0.35;
			System.out.println("所需缴纳的税费为" + tax);
			return;	
		}
		if(money>88000) {
			tax=1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 +26000*0.25+20000*0.3+30000*0.35+(money-88000)*0.45;
			System.out.println("所需缴纳的税费为" + tax);
			return;
			
			
		}

	}

} 