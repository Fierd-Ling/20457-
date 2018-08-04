package t;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 
 * Title: Random 随机数
 * 
 * Description:
 * 
 * @author ZhongLingYun
 * 
 * @date 2018年8月4日
 * 
 */
public class MathRonDom {

	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> listRandom = new ArrayList<Integer>();
		for (int i = 0; i < 50; i++) {
			listRandom.add(random.nextInt(100));
		}
		System.out.print("生成的随机数分别为：");
		for (int i = 0; i < listRandom.size(); i++) {
			if (i == 49) {
				System.out.print(listRandom.get(i));
				break;
			}
			System.out.print(listRandom.get(i) + ",");
		}

		List<Integer> list0 = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		List<Integer> list4 = new ArrayList<Integer>();
		List<Integer> list5 = new ArrayList<Integer>();
		List<Integer> list6 = new ArrayList<Integer>();
		List<Integer> list7 = new ArrayList<Integer>();
		List<Integer> list8 = new ArrayList<Integer>();
		List<Integer> list9 = new ArrayList<Integer>();
		for (int x = 0; x < listRandom.size(); x++) {
			int z = listRandom.get(x);
			if (z < 10) {
				list0.add(z);

			}
			if (10 <= z && z < 20) {
				list1.add(z);

			}
			if (20 <= z && z < 30) {
				list2.add(z);
			}
			if (30 <= z && z < 40) {
				list3.add(z);

			}
			if (40 <= z && z < 50) {
				list4.add(z);

			}
			if (50 <= z && z < 60) {
				list5.add(z);
			}
			if (60 <= z && z < 70) {
				list6.add(z);

			}
			if (70 <= z && z < 80) {
				list7.add(z);

			}
			if (80 <= z && z < 90) {
				list8.add(z);

			}
			if (90 <= z && z < 100) {
				list9.add(z);
			}
		}
		Integer[] array0 = (Integer[]) list0.toArray(new Integer[list0.size()]);
		Integer[] array1 = (Integer[]) list1.toArray(new Integer[list1.size()]);
		Integer[] array2 = (Integer[]) list2.toArray(new Integer[list2.size()]);
		Integer[] array3 = (Integer[]) list3.toArray(new Integer[list3.size()]);
		Integer[] array4 = (Integer[]) list4.toArray(new Integer[list4.size()]);
		Integer[] array5 = (Integer[]) list5.toArray(new Integer[list5.size()]);
		Integer[] array6 = (Integer[]) list6.toArray(new Integer[list6.size()]);
		Integer[] array7 = (Integer[]) list7.toArray(new Integer[list7.size()]);
		Integer[] array8 = (Integer[]) list8.toArray(new Integer[list8.size()]);
		Integer[] array9 = (Integer[]) list9.toArray(new Integer[list9.size()]);
		Map map = new HashMap();
		map.put(0, array0);
		map.put(1, array1);
		map.put(2, array2);
		map.put(3, array3);
		map.put(4, array4);
		map.put(5, array5);
		map.put(6, array6);
		map.put(7, array7);
		map.put(8, array8);
		map.put(9, array9);
		System.out.println();
		System.out.print("Map中的数据为: { 0=>[");
		for(int z=0;z<array0.length;z++) {
			System.out.print(array0[z]+",");
		}
		System.out.print("],1=>[");
		for(int z=0;z<array1.length;z++) {
			System.out.print(array1[z]+",");
		}
		System.out.print("],2=>[");
		for(int z=0;z<array2.length;z++) {
			System.out.print(array2[z]+",");
		}
		System.out.print("],3=>[");
		for(int z=0;z<array3.length;z++) {
			System.out.print(array3[z]+",");
		}
		System.out.print("],4=>[");
		for(int z=0;z<array4.length;z++) {
			System.out.print(array4[z]+",");
		}
		System.out.print("],5=>[");
		for(int z=0;z<array5.length;z++) {
			System.out.print(array5[z]+",");
		}
		System.out.print("],6=>[");
		for(int z=0;z<array6.length;z++) {
			System.out.print(array6[z]+",");
		}
		System.out.print("],7=>[");
		for(int z=0;z<array7.length;z++) {
			System.out.print(array7[z]+",");
		}
		System.out.print("],8=>[");
		for(int z=0;z<array8.length;z++) {
			System.out.print(array8[z]+",");
		}
		System.out.print("],9=>[");
		for(int z=0;z<array9.length;z++) {
			System.out.print(array9[z]+",");
		}
		System.out.print("]}");
		Arrays.sort(array0);
		Arrays.sort(array1);
		Arrays.sort(array2);
		Arrays.sort(array3);
		Arrays.sort(array4);
		Arrays.sort(array5);
		Arrays.sort(array6);
		Arrays.sort(array7);
		Arrays.sort(array8);
		Arrays.sort(array9);
		map.put(0, array0);
		map.put(1, array1);
		map.put(2, array2);
		map.put(3, array3);
		map.put(4, array4);
		map.put(5, array5);
		map.put(6, array6);
		map.put(7, array7);
		map.put(8, array8);
		map.put(9, array9);
		System.out.println();
		System.out.print("排序后的Map为: { 0=>[");
		for(int z=0;z<array0.length;z++) {
			System.out.print(array0[z]+",");
		}
		System.out.print("],1=>[");
		for(int z=0;z<array1.length;z++) {
			System.out.print(array1[z]+",");
		}
		System.out.print("],2=>[");
		for(int z=0;z<array2.length;z++) {
			System.out.print(array2[z]+",");
		}
		System.out.print("],3=>[");
		for(int z=0;z<array3.length;z++) {
			System.out.print(array3[z]+",");
		}
		System.out.print("],4=>[");
		for(int z=0;z<array4.length;z++) {
			System.out.print(array4[z]+",");
		}
		System.out.print("],5=>[");
		for(int z=0;z<array5.length;z++) {
			System.out.print(array5[z]+",");
		}
		System.out.print("],6=>[");
		for(int z=0;z<array6.length;z++) {
			System.out.print(array6[z]+",");
		}
		System.out.print("],7=>[");
		for(int z=0;z<array7.length;z++) {
			System.out.print(array7[z]+",");
		}
		System.out.print("],8=>[");
		for(int z=0;z<array8.length;z++) {
			System.out.print(array8[z]+",");
		}
		System.out.print("],9=>[");
		for(int z=0;z<array9.length;z++) {
			System.out.print(array9[z]+",");
		}
		System.out.print("]}");
		
		 
	}
}
