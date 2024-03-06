package com.test;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int length = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[length];
        for(int i = 0; i < length; i++) {
        	st = new StringTokenizer(br.readLine());
        	arr[i] = Integer.parseInt(st.nextToken()); //값을 배열에 담아준다
        }
        
        Arrays.sort(arr); //올림차순으로 정렬
        int max = 0;
        int sum = 0;
        for(int j = 0; j < arr.length; j++) {
        		sum = arr[j] * length; //맨 첫번째는 최소값이니 전체 라인수와 곱해준 후 그 다음번째는 다음으로 큰 수니 길이를 1뺸후 곱하기 진행
        		if(max < sum) {
        			max = sum; //그러면서 각 구하는 값마다 최대값인지 비교하기
        		}
        		length--;
        }
        
        System.out.println(max); //최대값을 그대로 출력
        
    }
		
}

