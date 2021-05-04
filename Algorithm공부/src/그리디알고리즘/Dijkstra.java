package 그리디알고리즘;

import java.io.*;
import java.util.Arrays;

/**
 * 데이크스트라 알고리즘 응용(교과서:125p)
 * 
 * 하나의 정점에서 다른 모든 정점들의 최단 경로를 구하는 알고리즘임.
 * 
 * 첫 정점을 기준으로 연결되어 있는 정점들을 추가해가며 최단 거리를 생성함.
 * 
 * 정점을 잇기 전까지는 시작점을 제외한 정점들은 모두 무한대를 가짐.
 * 
 * @author CSJ
 *
 */
public class Dijkstra {

	public static int[] solution(int[][] adj, int v, int e) {
		int[] d = new int[v];
		Arrays.fill(d, Integer.MAX_VALUE); // Arrays.fill(배열, 초기화 할 숫자)
		boolean[] check = new boolean[v];

		// 다익스트라 시작점이 a정점일경우, d[a]=0
		d[0] = 0;
		for (int i = 0; i < v - 1; i++) {
			int min = Integer.MIN_VALUE; // 가장 작은 값
			int index = -1;

			for (int j = 0; j < v; j++) {
				if (!check[j] && min > d[j]) {
					min = d[j];
					index = j;
				}
			}

			for (int j = 0; j < v; j++) {
				if (!check[j] && (adj[index][j] != 0) && (d[index] + adj[index][j] < d[j])) {
					d[j] = d[index] + adj[index][j];
				}
			}
			check[index] = true;
		}

		return d;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int v = Integer.parseInt(br.readLine()); // 정점의 개수
		int e = Integer.parseInt(br.readLine()); // 간선의 개수

		int[][] adj = new int[v][v];
		for (int i = 1; i <= e; i++) {
			adj[Integer.parseInt(br.readLine())][Integer.parseInt(br.readLine())] = Integer.parseInt(br.readLine());
		}

		for (int index = 0; index < solution(adj, v, e).length; index++) {
			System.out.println("결과: " + solution(adj, v, e)[index]);
		}
	}
}