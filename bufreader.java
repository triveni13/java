import java.io.*;
class bufreader
{
String name,dept;
int roll;
	bufreader(String name,String dept,int roll)
	{
		this.name=name;
		this.dept=dept;
		this.roll=roll;
	}
String getname()
{
return this.name;
}
String getdept()
{
return this.dept;
}
int getroll()
{
return this.roll;
}
void getPersonalDetails()
{
System.out.println("Name of the person is "+ name+ " dept is "+ dept + " and roll is " + roll);
}

	public static void main(String args[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String name,dept;
	int roll;
	name=br.readLine();
	dept=br.readLine();
	roll=Integer.parseInt(br.readLine());
	bufreader buf=new bufreader(name,dept,roll);
	buf.getPersonalDetails();
	}
}