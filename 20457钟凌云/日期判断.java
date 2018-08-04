package t;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 
 * Title: Time 时间
 * 
 * Description:
 * 
 * @author ZhongLingYun
 * 
 * @date 2018年8月4日
 * 
 */
public class Time {

	public static void main(String[] args) {

			System.out.print("请输入时间（如2018-08-01）");
			Scanner scanner = new Scanner(System.in);
			String inputString = scanner.nextLine();
			String time = "\\d{4}(\\-|\\/|.)\\d{1,2}\\1\\d{1,2}";
			if (!inputString.matches(time)) {
				System.out.println("输入日期不符合规范");
				return;
			}
			String[] stringArray = inputString.split("-");
			Integer year = Integer.parseInt(stringArray[0]);
			Integer momth = Integer.parseInt(stringArray[1]);
			Integer date = Integer.parseInt(stringArray[2]);
			boolean flag = true;
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				flag = false;
			}
			if (momth == 1 || momth == 3 || momth == 5 || momth == 7 || momth == 8 || momth == 10 | momth == 12) {
				if (momth == 12 && date == 31) {
					year++;
					momth = 1;
					date = 1;
					System.out.println("下一天是：" + year + "-" + momth + "-" + date);
					return;
				}
				if (date < 31) {
					date++;
					System.out.println("下一天是：" + year + "-" + momth + "-" + date);
					return;
				}
				date = 1;
				momth++;
				System.out.println("下一天是：" + year + "-" + momth + "d" + date);
				return;
			}
			if (momth == 4 || momth == 9 || momth == 10 || momth == 11) {
				if (date < 30) {
					date++;
					System.out.println("下一天是：" + year + "-" + momth + "-" + date);
					return;
				}
				date = 1;
				momth++;
				System.out.println("下一天是：" + year + "-" + momth + "-" + date);
				return;
			}
			if (flag) {
				if (date < 28) {
					date++;
					System.out.println("下一天是：" + year + "-" + momth + "-"+date);
				}
				date = 1;
				momth++;
				System.out.println("下一天是：" + year + "-" + momth + "-" + date);
				return;
			}
			if (!flag) {
				if (date < 29) {
					date++;
					System.out.println("下一天是：" + year + "-" + momth + "-" + date);
					return;
				}
				date = 1;
				momth++;
				System.out.println("下一天是：" + year + "-" + momth + "-" + date);
				return;
			}
		}
	}