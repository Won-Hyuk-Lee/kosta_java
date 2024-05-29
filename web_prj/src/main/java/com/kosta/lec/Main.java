package com.kosta.lec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String numStr = br.readLine();
		br.close();

		Character[] chars = new Character[numStr.length()];
		for (int i = 0; i < numStr.length(); i++) {
			chars[i] = numStr.charAt(i);
		}

		Arrays.sort(chars, Collections.reverseOrder());

		for (char c : chars) {
			System.out.print(c);
		}

	}
}
