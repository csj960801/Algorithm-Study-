package _2021_07_06;

import java.util.List;
import java.util.Map;
import java.util.Queue;

public interface Restaurant {
	// 식당메뉴리스트
	List<String> menu(String menu);

	// 고객
	Queue<Map<Integer,String>> client(String name, int age);
}