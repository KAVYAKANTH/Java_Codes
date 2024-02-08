/*class S  error
{
	public static void main(String[] args)
	{
		String value = "Hello Java Buddy";
		StringBuffer sb = new StringBuffer();
		String[] value1 = value.split(" ");
		for(int i = value1.length-1;i>=0;i--)
		{
			sb.append(value1[i]).append(" ");
		}
		System.out.println(sb);
	}
}*/
/*class S { 
    public static void main(String[] args) {
        String value = "Hello Java Buddy";
        StringBuilder sb = new StringBuilder();
        String[] value1 = value.split(" ");
        for (int i = value1.length - 1; i=-1; i--) {
            sb.append(value1[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}}*/
class S {
    public static void main(String[] args) {
        String value = "Hello Java Buddy";
        StringBuilder sb = new StringBuilder();
        String[] value1 = value.split(" ");
        for (int i = value1.length - 1; i>-1; i--) {
            sb.append(value1[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}