public class Sale extends Transaction
{
	private double discount;
	public Sale(String description, int numItems, double itemCost)
	{
		super(description, numItems, itemCost);	
	}
	public Sale(String description, int numItems, double itemCost, double d)
	{
		super(description, numItems, itemCost);
		discount = d;
	}
	public double getDiscountSaving()
	{
		double discount1;
		discount1 = (double) (super.getNumItems() * super.getItemCost() * discount);
		return discount1;  
	}
	public double getTotalCost()
	{
		return super.getTotal() - getDiscountSaving();
	}
	public String toString()
    {
    	 String str = "";
         str = super.toString() + "\n"+
         	   "Discount Savings : " + getDiscountSaving();
         	   return str;
    }
}
