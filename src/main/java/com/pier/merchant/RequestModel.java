package com.pier.merchant;

import java.lang.reflect.Field;

public class RequestModel {
	String auth_token;
	Double amount;
	String currency;
	String order_id;

	public RequestModel() {
		// TODO Auto-generated constructor stub
		super();
	}

	public String getAuth_token() {
		return auth_token;
	}

	public void setAuth_token(String auth_token) {
		this.auth_token = auth_token;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		try {
			StringBuilder builder=new StringBuilder();
			Field[] fields=this.getClass().getDeclaredFields();
			builder.append("{");
			for(Field field:fields)
			{
				field.setAccessible(true);
				builder.append(field.getName()+":"+field.get(this)+",");
			}
			return builder.substring(0, builder.length()-1)+"}";
		} catch (Exception e) {
			// TODO: handle exception
			return "";
		}
	}

}
