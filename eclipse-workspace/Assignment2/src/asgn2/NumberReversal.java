package asgn2;

public class NumberReversal {
	while (num != 0) {
		rem = num % 10;
		revNum = revNum * 10 + rem;
		num = num / 10;
	}
	System.out.println("Revers no : "+ revNum);
	return revNum;

}
	public static void main(String[] args) {
		int num = 123456789;
		NumberReversal obj = new NumberReversal();
		obj.reversenumber(num);
		obj.reversenumber(159);
	}

}

	}

