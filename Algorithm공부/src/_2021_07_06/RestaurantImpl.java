package _2021_07_06;

import java.util.*;

/**
 * 
 * @author CSJ
 *
 */
public class RestaurantImpl implements Restaurant {

	// 객체간 결합이 강할 경우 내부코드를 포함한 Restaurant 클래스 까지 일일이 수정해야함.
	private Restaurant res = new RestaurantImpl();

	/**
	 * 가게 메뉴
	 */
	@Override
	public List<String> menu(String menu) {
		return res.menu(menu);
	}

	/**
	 * 가게 운영중..
	 */
	@Override
	public Queue<Map<Integer, String>> client(String name, int age) {
		this.menu("도시락");

		Map<Integer, String> clientCnt = new HashMap<Integer, String>();
		// 나이가 많은 고객부터 가게에 입장(꼰대인가...)
		clientCnt.put(age, name);

		// 자바에서 큐는 LinkedList를 통해 정의해야함.(가게에서는 손님들이 들어왔다 나가니까 큐로 구현해봤음ㅋㅋ)
		Queue<Map<Integer, String>> queue = new LinkedList<Map<Integer, String>>();
		queue.add(clientCnt);
		queue.poll();
		return (queue.isEmpty()) ? queue : null;
	}
}