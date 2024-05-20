package com.kosta.lec;

import java.util.Arrays;
import java.util.Scanner;

public class 알고리즘문제푸는용도 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;

		int count = sc.nextInt();
		sc.nextLine();
		int meeting[][] = new int[count][2];

		for (int i = 0; i < count; i++) {
			meeting[i][0] = sc.nextInt(); // 시작시간
			meeting[i][1] = sc.nextInt(); // 종료시간
		}

		// 끝나는 시간 순으로 정렬 (오름차순)
		Arrays.sort(meeting, (o1, o2) -> {
			// 끝나는 시간이 같으면 시작시간이 빠른 순으로 정렬
			if (o1[1] == o2[1]) {
				return Integer.compare(o1[0], o2[0]);
			} else {
				return Integer.compare(o1[1], o2[1]);
			}
		});

		int endTime = meeting[0][1]; // 가장 빨리 끝나는 시간(종료시간이 가장빠름)
		result++;

		for (int i = 1; i < count; i++) {
			if (meeting[i][0] >= endTime) {
				endTime = meeting[i][1];
				result++;
			} else {
				continue;
			}
		}

		System.out.println(result);
	}
}