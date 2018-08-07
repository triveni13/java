import java.io.*;
class buftwo
{
String part_num,part_des;
int quan;
double item_price;
	buftwo(String part_num,String part_des,int quan,double item_price)
	{
	this.part_num=part_num;
	this.part_des=part_des;
	this.quan=quan;
	this.item_price=item_price;
	}
int getquan()
{
if(quan<0)
this.quan=0;
return this.quan;
}
double getitem_price()
{
if(item_price<0)
this.item_price=0.0;
return this.item_price;
}
double getBill()
{
double amount;
amount=getquan() * getitem_price();
return amount;
}
}
class test
{
	
  public static void main(String[] args)throws IOException
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String part_num,part_des;
		int quan;
		double item_price;	
		part_num=br.readLine();
		part_des=br.readLine();
		quan=Integer.parseInt(br.readLine());
		item_price=Integer.parseInt(br.readLine());

		buftwo obj=new buftwo(part_num,part_des,quan,item_price);
		System.out.println(obj.getBill());
	}
}