package NumberBaseballGame;

import java.util.Scanner;

public class NumberBaseballGame {
	static int[] ar;

	public static void generate() {
		ar = new int[3];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 9) + 1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = false;
		do {
			b = false;
			generate();
			if (ar[0] == ar[1] || ar[1] == ar[2] || ar[0] == ar[2]) {
				b = true;
			}
		} while (b);

//		System.out.println(ar[0] + " " + ar[1] + " " + ar[2]);

		int strike = 0;
		int ball = 0;
		int gamecnt = 0;

		while (true) {
			System.out.print("숫자 3개를 입력하세요 : ");
			gamecnt++;
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();

			if (num1 == ar[0]) {
				strike++;
			}
			if (num2 == ar[1]) {
				strike++;
			}
			if (num3 == ar[2]) {
				strike++;
			}
			if (num1 == ar[1] || num1 == ar[2]) {
				ball++;
			}
			if (num2 == ar[0] || num2 == ar[2]) {
				ball++;
			}
			if (num3 == ar[0] || num3 == ar[1]) {
				ball++;
			}

			if (strike == 3) {
				System.out.println("정답 " + gamecnt + "회 만에 맞추셨습니다.");
				sc.close();
				break;
			} else if (strike == 0 && ball == 0) {
				System.out.println("하나도 못맞췃지롱");
			} else {
				System.out.println("strike : " + strike + "\n" + "ball : " + ball);
				strike = 0;
				ball = 0;
			}
		}
	}
}
