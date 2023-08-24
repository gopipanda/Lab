class Cmd {
	public static void main(String args[])
	{
        byte i;
        if(args.length==0)
        {
            System.out.println("NO COMMAND LINE ARGUMENTS");
            System.out.println(args[0]);   
        }
        else
        {
            System.out.println(args[0]);
            System.out.println("THE COMMAND LINE ARGUMENTS ARE:");
            for(i=0;i<args.length;i++)
            {
	    	    System.out.println(args[i]);
            }
        }
	}
}
