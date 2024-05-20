package com.kosta.lec;

public class 예외 {

	public static void main(String[] args) {
		
//		int res = 0;
//		try {
//			System.out.println("try실행");
//			int num = 100;
//			res = num / 0;
//		} catch (Exception e) {
//			//예외가 발생했을경우
//			System.out.println("catch발생");
//			System.out.println(e.getMessage());
//			System.out.println(e.getCause());
//			System.out.println(e.getClass());
//			//개발자 예외처리부 코드라인
//		}
//		System.out.println(res);
		
		//구구단 3단인데 배열?
		//루프 하나 더 출력
		int[] arr = {1,2,3};
		
		try {
			for(int i = 0; i<arr.length + 1;i++)
			{
				for(int j = 1;j<10;j++)
				{
					System.out.print(arr[i] * j + " ");
				}
				System.out.println(" ");
			}
		}
		catch(Exception e)
		{
			System.out.println("에러발생");
			if(e.getMessage().equals("Index 3 out of bounds for length 3"))
			{
				for(int i = 0; i<arr.length;i++)
				{
					for(int j = 1;j<10;j++)
					{
						System.out.print(arr[i] * j + " ");
					}
					System.out.println(" ");
				}
			}
		}
		
	}

}
