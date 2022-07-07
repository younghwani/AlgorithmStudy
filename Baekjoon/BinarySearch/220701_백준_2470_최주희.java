import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);

		int start = 0, end = n-1, min = 0, max = 0;
		int diff = Integer.MAX_VALUE;
		while(start < end) {
			int val = arr[start] + arr[end];
			if(Math.abs(val) < diff) {
				diff = Math.abs(val);
				min = arr[start];
				max = arr[end];
			}
			if(val < 0) {
				start++;
			} else{
				end--;
			}
		}
		br.close();
		System.out.print(min + " " + max);
	}
}