package Accessspecifier;

public class Bill {
            int billNumber;
            int Noofunits;
            int costperunit;
        	public Bill()
        	{
        		
        	}
            public Bill(int billNumber,int Noofunits,int costperunit )
            {
            	this.billNumber=billNumber;
            	this.Noofunits=Noofunits;
            	this.costperunit=costperunit;
            }
            
            public void setBillNumber(int billNumber)
            {
                this.billNumber=billNumber;
            }
            public int getBillNumber()
            {
                return billNumber;
            }
            public void setNoofUnits(int noofunits)
            {
                this.Noofunits=noofunits;
            }
            public int getNoofUnits()
            {
                return Noofunits;
            }
            public void setCostperUnit(int costperunit)
            {
                this.costperunit=costperunit;
            }
            public int getCostperUnit()
            {
                return costperunit;
            }
            public double calculateBill()
            {
            	return Noofunits*costperunit;
            }
            @Override
            public String toString()
            {
            return "Bill[Billnumber="+billNumber+" "+"Noofunits="+Noofunits+"  "+"costperunit="+costperunit+"  "+"CALCULATE BILL()="+calculateBill()+"]";
            }
}
