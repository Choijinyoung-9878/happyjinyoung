package com.lec.ex;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Quiz5 {

	public static void main(String[] args) {

		int[] arr = { 76, 45, 34, 89, 100, 50, 90, 92 };
		int[] sortArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			sortArr[i] = arr[i]; // arr�̶� sortArr�̶� ���� �迭 ����� ������ ���� �ּҰ��� �ٸ�.
		}
		// �������� ���� �Լ� : Arrays.sort(sortArr);
		// ���� for�� �̿��ؼ� �����ϱ� .
		for (int i = 0; i < sortArr.length; i++) { // i=0 ~7 ����
			for (int j = i + 1; j < sortArr.length; j++) { // j= i+1~7����
				// i��°�� j��° �� �ؼ� i��°�� ũ�� ��ȯ
				if (sortArr[i] > sortArr[j]) {
					int temp = sortArr[i];
					sortArr[i] = sortArr[j];
					sortArr[j] = temp;
				} // if - ��ȯ

			} // for -j

		} // for -i
		System.out.print(" �� ������ : ");
		for (int temp : arr) {
			System.out.print(temp + " ");
		} // for- �������� ���
		System.out.print("\n �������� ���� ������ : ");
		for (int temp : sortArr) {
			System.out.print(temp + " ");
		} // for - �������� ���� ������ ���
	} // main

} // class