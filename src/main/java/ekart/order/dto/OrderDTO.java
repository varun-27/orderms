package ekart.order.dto;

import java.sql.Date;

import ekart.order.entity.Order;

public class OrderDTO {

	int ORDERID;

	int BUYERID;

	double AMOUNT;
	
	Date date;

	String ADDRESS;

	String STATUS;


	public OrderDTO() {
		super();
	}

	public OrderDTO(int ORDERID,int BUYERID,double AMOUNT,Date date,String ADDRESS,String STATUS) {
		this();
		this.ORDERID = ORDERID;
		this.BUYERID = BUYERID;
		this.AMOUNT = AMOUNT;
		this.date = date;
		this.ADDRESS=ADDRESS;
		this.STATUS=STATUS;
	}


	public int getORDERID() {
		return ORDERID;
	}

	public void setORDERID(int oRDERID) {
		ORDERID = oRDERID;
	}

	public int getBUYERID() {
		return BUYERID;
	}

	public void setBUYERID(int bUYERID) {
		BUYERID = bUYERID;
	}

	public double getAMOUNT() {
		return AMOUNT;
	}

	public void setAMOUNT(double aMOUNT) {
		AMOUNT = aMOUNT;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getADDRESS() {
		return ADDRESS;
	}

	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	// Converts Entity into DTO
	public static OrderDTO valueOf(Order order) {
		OrderDTO ordersDTO = new OrderDTO();
		ordersDTO.setORDERID(order.getORDERID());
		ordersDTO.setBUYERID(order.getBuyerId());
		ordersDTO.setAMOUNT(order.getAMOUNT());
		ordersDTO.setDate(order.getDate());
		ordersDTO.setADDRESS(order.getADDRESS());
		ordersDTO.setSTATUS(order.getSTATUS());
		return ordersDTO;
	}
	
	public Order createOrder() {
		Order order = new Order();
		order.setORDERID(this.getORDERID());
		order.setBuyerId(this.getBUYERID());
		order.setAMOUNT(this.getAMOUNT());
		order.setDate(this.getDate());
		order.setADDRESS(this.getADDRESS());
		order.setSTATUS(this.getSTATUS());
		return order;
	}

	@Override
	public String toString() {
		return "OrderDTO [ORDERID=" + ORDERID + ", BUYERID=" + BUYERID + ", AMOUNT=" + AMOUNT + ", date=" + date
				+ ", ADDRESS=" + ADDRESS + ", STATUS=" + STATUS + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ADDRESS == null) ? 0 : ADDRESS.hashCode());
		long temp;
		temp = Double.doubleToLongBits(AMOUNT);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + BUYERID;
		result = prime * result + ORDERID;
		result = prime * result + ((STATUS == null) ? 0 : STATUS.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderDTO other = (OrderDTO) obj;
		if (ADDRESS == null) {
			if (other.ADDRESS != null)
				return false;
		} else if (!ADDRESS.equals(other.ADDRESS))
			return false;
		if (Double.doubleToLongBits(AMOUNT) != Double.doubleToLongBits(other.AMOUNT))
			return false;
		if (BUYERID != other.BUYERID)
			return false;
		if (ORDERID != other.ORDERID)
			return false;
		if (STATUS == null) {
			if (other.STATUS != null)
				return false;
		} else if (!STATUS.equals(other.STATUS))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		return true;
	}
	
	

}
