package _0414;
import java.util.Scanner;
public class _6백준10871 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//백준 10871번 문제 :: X보다 작은 수
		//주어진 숫자들 중에서 특정 값(X)보다 작은것만 출력
		//배열에 입력할 숫자들과 X값을 하나씩 비교, 작은 수만 출력
		
		//1) 배열의 크기 입력받기 (+ 배열 선언)
		int n=sc.nextInt();
		int arr []=new int[n];
		
		//2)기준점이 되는 숫자(X)입력받기
		int X=sc.nextInt();
		
		//3)배열값 입력받기
		for(int i=0;i<n;i++) {	//i는 0(n-1)까지 돌게 됨
			arr[i]=sc.nextInt();
		}
		
		//4)x와 arr값을 하나씩 비교해서,출력
		for(int i=0;i<n;i++) {	//i는 0(n-1)까지 돌게 됨
			if(arr[i]<X) {	//arr의 "현재 탐색 중인(i번째)" 값이 X보다 작을때,
				System.out.print(arr[i]+" ");	//i는 0(n-1)까지 돌게 됨
			
				}
			}
		
		
	}
}
