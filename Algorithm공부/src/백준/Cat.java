package 백준;

public class Cat {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sb.append("\\    /\\ ");
		sb.append("\n");
		sb.append(" )  ( ')");
		sb.append("\n");
		sb.append("(  /  )");
		sb.append("\n");
		sb.append(" \\(__)|");
		System.out.println(sb.toString());
	
		System.out.println("\\    /\\\r\n" + " ) " + 
						       " ( ')\r\n" +
						      "(  /  )\r\n" +
						   " \\(__)|");

	}

}