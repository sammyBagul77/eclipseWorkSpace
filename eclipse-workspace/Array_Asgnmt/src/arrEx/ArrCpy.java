package arrEx;

import java.util.Arrays;

public class ArrCpy {
public static void main(String[] args) {
	char ch[] = {'a','G','r','H','t' };
	char ch1[] =Arrays.copyOfRange(ch, 0, 5);
	for(char c :ch1) {
		System.out.print(c+", ");
	}
}
}
