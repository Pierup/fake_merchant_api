package com.pier.merchant;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.pier.model.SDKResult;
import com.pier.model.TransactionConfig;
import com.pier.sdk.MerchantSDKClient;

@Controller
@RequestMapping(value="/server/sdk")
public class MerchantControl {
	
	/**
	 * For demo purpose only, 
	 * TODO: need to change to json POST
	 */
	
	static final Map<String, String> hard_coded_note_map = new HashMap<String, String> (){
		{
			hard_coded_note_map.put("AAA000000001", "Sporting Shoes");
			hard_coded_note_map.put("MC0000000010", "Tax Cab - LAX");
			hard_coded_note_map.put("MC0000000011", "Museum Ticket");
			hard_coded_note_map.put("MC0000000017", "Immigration Preparation");
			hard_coded_note_map.put("MC0000000057", "Mother's day flowers");
			hard_coded_note_map.put("MC0000000064", "Breads, donuts, coffee, etc.");
			hard_coded_note_map.put("MC0000000083", "Chiropractor services");
			hard_coded_note_map.put("MC0000000086", "Nail polishing");
			hard_coded_note_map.put("MC0000000089", "Iced Caffè Latte, Tazo Bottled Lemon Ginger etc.");
			hard_coded_note_map.put("MC0000000134", "Acupuncture and care");
		}
	};

	
	@RequestMapping(value="/pay/MC0000000134/{amount}/{auth_token}/{currency}/{order_id}",method=RequestMethod.GET)
	public @ResponseBody JSONObject payMC0000000134(@PathVariable(value="auth_token") String auth_token,
			@PathVariable(value="amount") Double amount,@PathVariable(value="currency") String currency,
			@PathVariable(value="order_id") String order_id)
	{	
		JSONObject jsonObject=new JSONObject();
		try {
			String merchant_id = "MC0000000134";
			MerchantSDKClient client = MerchantSDKClient.newBuilder()
					.setMerchant_id(merchant_id).build();
			TransactionConfig config = TransactionConfig.newBuilder().setAmount(amount)
					.setApi_id("5b52051a-931a-11e4-aad2-0ea81fa3d43c").
					setApi_secret_key("mk-test-5b52041f-931a-11e4-aad2-0ea81fa3d43c")
					.setAuth_token(auth_token)
					.setCurrency(currency)
					.setId_in_merchant(order_id)
					.setNotes(hard_coded_note_map.get(merchant_id)).build();
			System.out.println("transaction request==========================");
			System.out.println(config.toString());
			SDKResult result = client.transaction(config);
			System.out.println("transaction response=========================");
			System.out.println(result.getMessage());
			
			jsonObject.accumulate("code", result.getCode());
			jsonObject.accumulate("message", result.getMessage());
			jsonObject.accumulate("result", result.getResult()==null?"":result.getResult());
		} catch (Exception e) {
			// TODO: handle exception
			jsonObject.accumulate("code", "500");
			jsonObject.accumulate("message", "Fail");
			jsonObject.accumulate("result", "");
		}
		return jsonObject;
	}
	
	@RequestMapping(value="/pay/MC0000000134",method=RequestMethod.POST)
	public @ResponseBody JSONObject payMC0000000134(@RequestBody RequestModel model)
	{
		JSONObject jsonObject=new JSONObject();
		try {
			String merchant_id = "MC0000000134";
			MerchantSDKClient client = MerchantSDKClient.newBuilder()
					.setMerchant_id(merchant_id).build();
			TransactionConfig config = TransactionConfig.newBuilder().setAmount(model.getAmount())
					.setApi_id("5b52051a-931a-11e4-aad2-0ea81fa3d43c").
					setApi_secret_key("mk-test-5b52041f-931a-11e4-aad2-0ea81fa3d43c")
					.setAuth_token(model.getAuth_token())
					.setCurrency(model.getCurrency())
					.setId_in_merchant(model.getOrder_id())
					.setNotes(hard_coded_note_map.get(merchant_id)).build();
			System.out.println("transaction request==========================");
			System.out.println(config.toString());
			SDKResult result = client.transaction(config);
			System.out.println("transaction response=========================");
			System.out.println(result.getMessage());
			
			jsonObject.accumulate("code", result.getCode());
			jsonObject.accumulate("message", result.getMessage());
			jsonObject.accumulate("result", result.getResult()==null?"":result.getResult());
		} catch (Exception e) {
			// TODO: handle exception
			jsonObject.accumulate("code", "500");
			jsonObject.accumulate("message", "Fail");
			jsonObject.accumulate("result", "");
		}
		return jsonObject;
	}
	
	@RequestMapping(value="/pay/AAA000000001/{amount}/{auth_token}/{currency}/{order_id}",method=RequestMethod.GET)
	public @ResponseBody JSONObject payAAA000000001(@PathVariable(value="auth_token") String auth_token,
			@PathVariable(value="amount") Double amount,@PathVariable(value="currency") String currency,
			@PathVariable(value="order_id") String order_id)
	{
		JSONObject jsonObject=new JSONObject();
		try {
			String merchant_id = "AAA000000001";
			MerchantSDKClient client = MerchantSDKClient.newBuilder()
					.setMerchant_id(merchant_id).build();
			TransactionConfig config = TransactionConfig.newBuilder().setAmount(amount)
					.setApi_id("9181240c-c3a8-11e4-adb1-095385a3a244")
					.setApi_secret_key("mk-test-918125c2-c3a8-11e4-adb1-095385a3a244")
					.setAuth_token(auth_token)
					.setCurrency(currency)
					.setId_in_merchant(order_id)
					.setNotes(hard_coded_note_map.get(merchant_id)).build();
			System.out.println("transaction request==========================");
			System.out.println(config.toString());
			SDKResult result = client.transaction(config);
			System.out.println("transaction response=========================");
			System.out.println(result.getMessage());
			
			jsonObject.accumulate("code", result.getCode());
			jsonObject.accumulate("message", result.getMessage());
			jsonObject.accumulate("result", result.getResult()==null?"":result.getResult());
		} catch (Exception e) {
			// TODO: handle exception
			jsonObject.accumulate("code", "500");
			jsonObject.accumulate("message", "Fail");
			jsonObject.accumulate("result", "");
		}
		return jsonObject;
	}
	
	@RequestMapping(value="/pay/AAA000000001",method=RequestMethod.POST)
	public @ResponseBody JSONObject payAAA000000001(@RequestBody RequestModel model)
	{
		JSONObject jsonObject=new JSONObject();
		try {
			String merchant_id = "AAA000000001";
			MerchantSDKClient client = MerchantSDKClient.newBuilder()
					.setMerchant_id(merchant_id).build();
			TransactionConfig config = TransactionConfig.newBuilder().setAmount(model.getAmount())
					.setApi_id("9181240c-c3a8-11e4-adb1-095385a3a244").
					setApi_secret_key("mk-test-918125c2-c3a8-11e4-adb1-095385a3a244")
					.setAuth_token(model.getAuth_token())
					.setCurrency(model.getCurrency())
					.setId_in_merchant(model.getOrder_id())
					.setNotes(hard_coded_note_map.get(merchant_id)).build();
			System.out.println("transaction request==========================");
			System.out.println(config.toString());
			SDKResult result = client.transaction(config);
			System.out.println("transaction response=========================");
			System.out.println(result.getMessage());
			
			jsonObject.accumulate("code", result.getCode());
			jsonObject.accumulate("message", result.getMessage());
			jsonObject.accumulate("result", result.getResult()==null?"":result.getResult());
		} catch (Exception e) {
			// TODO: handle exception
			jsonObject.accumulate("code", "500");
			jsonObject.accumulate("message", "Fail");
			jsonObject.accumulate("result", "");
		}
		return jsonObject;
	}
	
	@RequestMapping(value="/pay/MC0000000010/{amount}/{auth_token}/{currency}/{order_id}",method=RequestMethod.GET)
	public @ResponseBody JSONObject payMC0000000010(@PathVariable(value="auth_token") String auth_token,
			@PathVariable(value="amount") Double amount,@PathVariable(value="currency") String currency,
			@PathVariable(value="order_id") String order_id)
	{
		JSONObject jsonObject=new JSONObject();
		try {
			String merchant_id = "MC0000000010";
			MerchantSDKClient client = MerchantSDKClient.newBuilder()
					.setMerchant_id(merchant_id).build();
			TransactionConfig config = TransactionConfig.newBuilder().setAmount(amount)
					.setApi_id("9495caa5-7fad-11e4-8328-32913f86e6ed").
					setApi_secret_key("mk-test-9495ca5d-7fad-11e4-8328-32913f86e6ed")
					.setAuth_token(auth_token)
					.setCurrency(currency)
					.setId_in_merchant(order_id)
					.setNotes(hard_coded_note_map.get(merchant_id)).build();
			System.out.println("transaction request==========================");
			System.out.println(config.toString());
			SDKResult result = client.transaction(config);
			System.out.println("transaction response=========================");
			System.out.println(result.getMessage());
			
			jsonObject.accumulate("code", result.getCode());
			jsonObject.accumulate("message", result.getMessage());
			jsonObject.accumulate("result", result.getResult()==null?"":result.getResult());
		} catch (Exception e) {
			// TODO: handle exception
			jsonObject.accumulate("code", "500");
			jsonObject.accumulate("message", "Fail");
			jsonObject.accumulate("result", "");
		}
		return jsonObject;
	}
	
	@RequestMapping(value="/pay/MC0000000010",method=RequestMethod.POST)
	public @ResponseBody JSONObject payMC0000000010(@RequestBody RequestModel model)
	{
		JSONObject jsonObject=new JSONObject();
		try {
			String merchant_id = "MC0000000010";
			MerchantSDKClient client = MerchantSDKClient.newBuilder()
					.setMerchant_id(merchant_id).build();
			TransactionConfig config = TransactionConfig.newBuilder().setAmount(model.getAmount())
					.setApi_id("9495caa5-7fad-11e4-8328-32913f86e6ed").
					setApi_secret_key("mk-test-9495ca5d-7fad-11e4-8328-32913f86e6ed")
					.setAuth_token(model.getAuth_token())
					.setCurrency(model.getCurrency())
					.setId_in_merchant(model.getOrder_id())
					.setNotes(hard_coded_note_map.get(merchant_id)).build();
			System.out.println("transaction request==========================");
			System.out.println(config.toString());
			SDKResult result = client.transaction(config);
			System.out.println("transaction response=========================");
			System.out.println(result.getMessage());
			
			jsonObject.accumulate("code", result.getCode());
			jsonObject.accumulate("message", result.getMessage());
			jsonObject.accumulate("result", result.getResult()==null?"":result.getResult());
		} catch (Exception e) {
			// TODO: handle exception
			jsonObject.accumulate("code", "500");
			jsonObject.accumulate("message", "Fail");
			jsonObject.accumulate("result", "");
		}
		return jsonObject;
	}
	
	@RequestMapping(value="/pay/MC0000000011/{amount}/{auth_token}/{currency}/{order_id}",method=RequestMethod.GET)
	public @ResponseBody JSONObject payMC0000000011(@PathVariable(value="auth_token") String auth_token,
			@PathVariable(value="amount") Double amount,@PathVariable(value="currency") String currency,
			@PathVariable(value="order_id") String order_id)
	{
		JSONObject jsonObject=new JSONObject();
		try {
			String merchant_id = "MC0000000011";
			MerchantSDKClient client = MerchantSDKClient.newBuilder()
					.setMerchant_id(merchant_id).build();
			TransactionConfig config = TransactionConfig.newBuilder().setAmount(amount)
					.setApi_id("4ceccf36-7fae-11e4-8328-32913f86e6ed").
					setApi_secret_key("mk-test-4ceccef0-7fae-11e4-8328-32913f86e6ed")
					.setAuth_token(auth_token)
					.setCurrency(currency)
					.setId_in_merchant(order_id)
					.setNotes(hard_coded_note_map.get(merchant_id)).build();
			System.out.println("transaction request==========================");
			System.out.println(config.toString());
			SDKResult result = client.transaction(config);
			System.out.println("transaction response=========================");
			System.out.println(result.getMessage());
			
			jsonObject.accumulate("code", result.getCode());
			jsonObject.accumulate("message", result.getMessage());
			jsonObject.accumulate("result", result.getResult()==null?"":result.getResult());
		} catch (Exception e) {
			// TODO: handle exception
			jsonObject.accumulate("code", "500");
			jsonObject.accumulate("message", "Fail");
			jsonObject.accumulate("result", "");
		}
		return jsonObject;
	}
	
	@RequestMapping(value="/pay/MC0000000011",method=RequestMethod.POST)
	public @ResponseBody JSONObject payMC0000000011(@RequestBody RequestModel model)
	{
		JSONObject jsonObject=new JSONObject();
		try {
			String merchant_id = "MC0000000011";
			MerchantSDKClient client = MerchantSDKClient.newBuilder()
					.setMerchant_id(merchant_id).build();
			TransactionConfig config = TransactionConfig.newBuilder().setAmount(model.getAmount())
					.setApi_id("4ceccf36-7fae-11e4-8328-32913f86e6ed").
					setApi_secret_key("mk-test-4ceccef0-7fae-11e4-8328-32913f86e6ed")
					.setAuth_token(model.getAuth_token())
					.setCurrency(model.getCurrency())
					.setId_in_merchant(model.getOrder_id())
					.setNotes(hard_coded_note_map.get(merchant_id)).build();
			System.out.println("transaction request==========================");
			System.out.println(config.toString());
			SDKResult result = client.transaction(config);
			System.out.println("transaction response=========================");
			System.out.println(result.getMessage());
			
			jsonObject.accumulate("code", result.getCode());
			jsonObject.accumulate("message", result.getMessage());
			jsonObject.accumulate("result", result.getResult()==null?"":result.getResult());
		} catch (Exception e) {
			// TODO: handle exception
			jsonObject.accumulate("code", "500");
			jsonObject.accumulate("message", "Fail");
			jsonObject.accumulate("result", "");
		}
		return jsonObject;
	}
	
	@RequestMapping(value="/pay/MC0000000017/{amount}/{auth_token}/{currency}/{order_id}",method=RequestMethod.GET)
	public @ResponseBody JSONObject payMC0000000017(@PathVariable(value="auth_token") String auth_token,
			@PathVariable(value="amount") Double amount,@PathVariable(value="currency") String currency,
			@PathVariable(value="order_id")String order_id)
	{
		JSONObject jsonObject=new JSONObject();
		try {
			String merchant_id = "MC0000000017";
			MerchantSDKClient client = MerchantSDKClient.newBuilder()
					.setMerchant_id(merchant_id).build();
			TransactionConfig config = TransactionConfig.newBuilder().setAmount(amount)
					.setApi_id("51423988-7f6b-11e4-8328-32913f86e6ed").
					setApi_secret_key("mk-test-51423949-7f6b-11e4-8328-32913f86e6ed")
					.setAuth_token(auth_token)
					.setCurrency(currency)
					.setId_in_merchant(order_id)
					.setNotes(hard_coded_note_map.get(merchant_id)).build();
			System.out.println("transaction request==========================");
			System.out.println(config.toString());
			SDKResult result = client.transaction(config);
			System.out.println("transaction response=========================");
			System.out.println(result.getMessage());
			
			jsonObject.accumulate("code", result.getCode());
			jsonObject.accumulate("message", result.getMessage());
			jsonObject.accumulate("result", result.getResult()==null?"":result.getResult());
		} catch (Exception e) {
			// TODO: handle exception
			jsonObject.accumulate("code", "500");
			jsonObject.accumulate("message", "Fail");
			jsonObject.accumulate("result", "");
		}
		return jsonObject;
	}
	
	@RequestMapping(value="/pay/MC0000000017",method=RequestMethod.POST)
	public @ResponseBody JSONObject payMC0000000017(@RequestBody RequestModel model)
	{
		JSONObject jsonObject=new JSONObject();
		try {
			String merchant_id = "MC0000000017";
			MerchantSDKClient client = MerchantSDKClient.newBuilder()
					.setMerchant_id(merchant_id).build();
			TransactionConfig config = TransactionConfig.newBuilder().setAmount(model.getAmount())
					.setApi_id("51423988-7f6b-11e4-8328-32913f86e6ed").
					setApi_secret_key("mk-test-51423949-7f6b-11e4-8328-32913f86e6ed")
					.setAuth_token(model.getAuth_token())
					.setCurrency(model.getCurrency())
					.setId_in_merchant(model.getOrder_id())
					.setNotes(hard_coded_note_map.get(merchant_id)).build();
			System.out.println("transaction request==========================");
			System.out.println(config.toString());
			SDKResult result = client.transaction(config);
			System.out.println("transaction response=========================");
			System.out.println(result.getMessage());
			
			jsonObject.accumulate("code", result.getCode());
			jsonObject.accumulate("message", result.getMessage());
			jsonObject.accumulate("result", result.getResult()==null?"":result.getResult());
		} catch (Exception e) {
			// TODO: handle exception
			jsonObject.accumulate("code", "500");
			jsonObject.accumulate("message", "Fail");
			jsonObject.accumulate("result", "");
		}
		return jsonObject;
	}
	
	
	@RequestMapping(value="/pay/MC0000000057/{amount}/{auth_token}/{currency}/{order_id}",method=RequestMethod.GET)
	public @ResponseBody JSONObject payMC0000000057(@PathVariable(value="auth_token") String auth_token,
			@PathVariable(value="amount") Double amount,@PathVariable(value="currency") String currency,
			@PathVariable(value="order_id") String order_id)
	{
		JSONObject jsonObject=new JSONObject();
		try {
			String merchant_id = "MC0000000057";
			MerchantSDKClient client = MerchantSDKClient.newBuilder()
					.setMerchant_id(merchant_id).build();
			TransactionConfig config = TransactionConfig.newBuilder().setAmount(amount)
					.setApi_id("f4702c83-804a-11e4-8328-32913f86e6ed").
					setApi_secret_key("mk-test-f4702c43-804a-11e4-8328-32913f86e6ed")
					.setAuth_token(auth_token)
					.setCurrency(currency)
					.setId_in_merchant(order_id)
					.setNotes(hard_coded_note_map.get(merchant_id)).build();
			System.out.println("transaction request==========================");
			System.out.println(config.toString());
			SDKResult result = client.transaction(config);
			System.out.println("transaction response=========================");
			System.out.println(result.getMessage());
			
			jsonObject.accumulate("code", result.getCode());
			jsonObject.accumulate("message", result.getMessage());
			jsonObject.accumulate("result", result.getResult()==null?"":result.getResult());
		} catch (Exception e) {
			// TODO: handle exception
			jsonObject.accumulate("code", "500");
			jsonObject.accumulate("message", "Fail");
			jsonObject.accumulate("result", "");
		}
		return jsonObject;
	}
	
	
	@RequestMapping(value="/pay/MC0000000057",method=RequestMethod.POST)
	public @ResponseBody JSONObject payMC0000000057(@RequestBody RequestModel model)
	{
		JSONObject jsonObject=new JSONObject();
		try {
			String merchant_id = "MC0000000057";
			MerchantSDKClient client = MerchantSDKClient.newBuilder()
					.setMerchant_id(merchant_id).build();
			TransactionConfig config = TransactionConfig.newBuilder().setAmount(model.getAmount())
					.setApi_id("f4702c83-804a-11e4-8328-32913f86e6ed").
					setApi_secret_key("mk-test-f4702c43-804a-11e4-8328-32913f86e6ed")
					.setAuth_token(model.getAuth_token())
					.setCurrency(model.getCurrency())
					.setId_in_merchant(model.getOrder_id())
					.setNotes(hard_coded_note_map.get(merchant_id)).build();
			System.out.println("transaction request==========================");
			System.out.println(config.toString());
			SDKResult result = client.transaction(config);
			System.out.println("transaction response=========================");
			System.out.println(result.getMessage());
			
			jsonObject.accumulate("code", result.getCode());
			jsonObject.accumulate("message", result.getMessage());
			jsonObject.accumulate("result", result.getResult()==null?"":result.getResult());
		} catch (Exception e) {
			// TODO: handle exception
			jsonObject.accumulate("code", "500");
			jsonObject.accumulate("message", "Fail");
			jsonObject.accumulate("result", "");
		}
		return jsonObject;
	}
	
	@RequestMapping(value="/pay/MC0000000064/{amount}/{auth_token}/{currency}/{order_id}",method=RequestMethod.GET)
	public @ResponseBody JSONObject payMC0000000064(@PathVariable(value="auth_token") String auth_token,
			@PathVariable(value="amount") Double amount,@PathVariable(value="currency") String currency,
			@PathVariable(value="order_id")String order_id)
	{
		JSONObject jsonObject=new JSONObject();
		try {
			String merchant_id = "MC0000000064";
			MerchantSDKClient client = MerchantSDKClient.newBuilder()
					.setMerchant_id(merchant_id).build();
			TransactionConfig config = TransactionConfig.newBuilder().setAmount(amount)
					.setApi_id("fa4472aa-7fac-11e4-8328-32913f86e6ed").
					setApi_secret_key("mk-test-fa44726d-7fac-11e4-8328-32913f86e6ed")
					.setAuth_token(auth_token)
					.setCurrency(currency)
					.setId_in_merchant(order_id)
					.setNotes(hard_coded_note_map.get(merchant_id)).build();
			System.out.println("transaction request==========================");
			System.out.println(config.toString());
			SDKResult result = client.transaction(config);
			System.out.println("transaction response=========================");
			System.out.println(result.getMessage());
			
			jsonObject.accumulate("code", result.getCode());
			jsonObject.accumulate("message", result.getMessage());
			jsonObject.accumulate("result", result.getResult()==null?"":result.getResult());
		} catch (Exception e) {
			// TODO: handle exception
			jsonObject.accumulate("code", "500");
			jsonObject.accumulate("message", "Fail");
			jsonObject.accumulate("result", "");
		}
		return jsonObject;
	}
	
	@RequestMapping(value="/pay/MC0000000064",method=RequestMethod.POST)
	public @ResponseBody JSONObject payMC0000000064(@RequestBody RequestModel model)
	{
		JSONObject jsonObject=new JSONObject();
		try {
			String merchant_id = "MC0000000064";
			MerchantSDKClient client = MerchantSDKClient.newBuilder()
					.setMerchant_id(merchant_id).build();
			TransactionConfig config = TransactionConfig.newBuilder().setAmount(model.getAmount())
					.setApi_id("fa4472aa-7fac-11e4-8328-32913f86e6ed").
					setApi_secret_key("mk-test-fa44726d-7fac-11e4-8328-32913f86e6ed")
					.setAuth_token(model.getAuth_token())
					.setCurrency(model.getCurrency())
					.setId_in_merchant(model.getOrder_id())
					.setNotes(hard_coded_note_map.get(merchant_id)).build();
			System.out.println("transaction request==========================");
			System.out.println(config.toString());
			SDKResult result = client.transaction(config);
			System.out.println("transaction response=========================");
			System.out.println(result.getMessage());
			
			jsonObject.accumulate("code", result.getCode());
			jsonObject.accumulate("message", result.getMessage());
			jsonObject.accumulate("result", result.getResult()==null?"":result.getResult());
		} catch (Exception e) {
			// TODO: handle exception
			jsonObject.accumulate("code", "500");
			jsonObject.accumulate("message", "Fail");
			jsonObject.accumulate("result", "");
		}
		return jsonObject;
	}
	
	
	@RequestMapping(value="/pay/MC0000000083/{amount}/{auth_token}/{currency}/{order_id}",method=RequestMethod.GET)
	public @ResponseBody JSONObject payMC0000000083(@PathVariable(value="auth_token") String auth_token,
			@PathVariable(value="amount") Double amount,@PathVariable(value="currency") String currency,
			@PathVariable(value="order_id")String order_id)
	{
		JSONObject jsonObject=new JSONObject();
		try {
			String merchant_id = "MC0000000083";
			MerchantSDKClient client = MerchantSDKClient.newBuilder()
					.setMerchant_id(merchant_id).build();
			TransactionConfig config = TransactionConfig.newBuilder().setAmount(amount)
					.setApi_id("e0a71c29-8f89-11e4-aad2-0ea81fa3d43c").
					setApi_secret_key("mk-test-e0a71b29-8f89-11e4-aad2-0ea81fa3d43c")
					.setAuth_token(auth_token)
					.setCurrency(currency)
					.setId_in_merchant(order_id)
					.setNotes(hard_coded_note_map.get(merchant_id)).build();
			System.out.println("transaction request==========================");
			System.out.println(config.toString());
			SDKResult result = client.transaction(config);
			System.out.println("transaction response=========================");
			System.out.println(result.getMessage());
			
			jsonObject.accumulate("code", result.getCode());
			jsonObject.accumulate("message", result.getMessage());
			jsonObject.accumulate("result", result.getResult()==null?"":result.getResult());
		} catch (Exception e) {
			// TODO: handle exception
			jsonObject.accumulate("code", "500");
			jsonObject.accumulate("message", "Fail");
			jsonObject.accumulate("result", "");
		}
		return jsonObject;
	}
	
	@RequestMapping(value="/pay/MC0000000083",method=RequestMethod.POST)
	public @ResponseBody JSONObject payMC0000000083(@RequestBody RequestModel model)
	{
		JSONObject jsonObject=new JSONObject();
		try {
			String merchant_id = "MC0000000083";
			MerchantSDKClient client = MerchantSDKClient.newBuilder()
					.setMerchant_id(merchant_id).build();
			TransactionConfig config = TransactionConfig.newBuilder().setAmount(model.getAmount())
					.setApi_id("e0a71c29-8f89-11e4-aad2-0ea81fa3d43c").
					setApi_secret_key("mk-test-e0a71b29-8f89-11e4-aad2-0ea81fa3d43c")
					.setAuth_token(model.getAuth_token())
					.setCurrency(model.getCurrency())
					.setId_in_merchant(model.getOrder_id())
					.setNotes(hard_coded_note_map.get(merchant_id)).build();
			System.out.println("transaction request==========================");
			System.out.println(config.toString());
			SDKResult result = client.transaction(config);
			System.out.println("transaction response=========================");
			System.out.println(result.getMessage());
			
			jsonObject.accumulate("code", result.getCode());
			jsonObject.accumulate("message", result.getMessage());
			jsonObject.accumulate("result", result.getResult()==null?"":result.getResult());
		} catch (Exception e) {
			// TODO: handle exception
			jsonObject.accumulate("code", "500");
			jsonObject.accumulate("message", "Fail");
			jsonObject.accumulate("result", "");
		}
		return jsonObject;
	}
	
	@RequestMapping(value="/pay/MC0000000086/{amount}/{auth_token}/{currency}/{order_id}",method=RequestMethod.GET)
	public @ResponseBody JSONObject payMC0000000086(@PathVariable(value="auth_token") String auth_token,
			@PathVariable(value="amount") Double amount,@PathVariable(value="currency") String currency,
			@PathVariable(value="order_id")String order_id)
	{
		JSONObject jsonObject=new JSONObject();
		try {
			String merchant_id = "MC0000000086";
			MerchantSDKClient client = MerchantSDKClient.newBuilder()
					.setMerchant_id(merchant_id).build();
			TransactionConfig config = TransactionConfig.newBuilder().setAmount(amount)
					.setApi_id("7729d25a-903b-11e4-aad2-0ea81fa3d43c").
					setApi_secret_key("mk-test-7729d14f-903b-11e4-aad2-0ea81fa3d43c")
					.setAuth_token(auth_token)
					.setCurrency(currency)
					.setId_in_merchant(order_id)
					.setNotes(hard_coded_note_map.get(merchant_id)).build();
			System.out.println("transaction request==========================");
			System.out.println(config.toString());
			SDKResult result = client.transaction(config);
			System.out.println("transaction response=========================");
			System.out.println(result.getMessage());
			
			jsonObject.accumulate("code", result.getCode());
			jsonObject.accumulate("message", result.getMessage());
			jsonObject.accumulate("result", result.getResult()==null?"":result.getResult());
		} catch (Exception e) {
			// TODO: handle exception
			jsonObject.accumulate("code", "500");
			jsonObject.accumulate("message", "Fail");
			jsonObject.accumulate("result", "");
		}
		return jsonObject;
	}
	
	@RequestMapping(value="/pay/MC0000000086",method=RequestMethod.POST)
	public @ResponseBody JSONObject payMC0000000086(@RequestBody RequestModel model)
	{
		JSONObject jsonObject=new JSONObject();
		try {
			String merchant_id = "MC0000000086";
			MerchantSDKClient client = MerchantSDKClient.newBuilder()
					.setMerchant_id(merchant_id).build();
			TransactionConfig config = TransactionConfig.newBuilder().setAmount(model.getAmount())
					.setApi_id("7729d25a-903b-11e4-aad2-0ea81fa3d43c").
					setApi_secret_key("mk-test-7729d14f-903b-11e4-aad2-0ea81fa3d43c")
					.setAuth_token(model.getAuth_token())
					.setCurrency(model.getCurrency())
					.setId_in_merchant(model.getOrder_id())
					.setNotes(hard_coded_note_map.get(merchant_id)).build();
			System.out.println("transaction request==========================");
			System.out.println(config.toString());
			SDKResult result = client.transaction(config);
			System.out.println("transaction response=========================");
			System.out.println(result.getMessage());
			
			jsonObject.accumulate("code", result.getCode());
			jsonObject.accumulate("message", result.getMessage());
			jsonObject.accumulate("result", result.getResult()==null?"":result.getResult());
		} catch (Exception e) {
			// TODO: handle exception
			jsonObject.accumulate("code", "500");
			jsonObject.accumulate("message", "Fail");
			jsonObject.accumulate("result", "");
		}
		return jsonObject;
	}
	
	@RequestMapping(value="/pay/MC0000000089/{amount}/{auth_token}/{currency}/{order_id}",method=RequestMethod.GET)
	public @ResponseBody JSONObject payMC0000000089(@PathVariable(value="auth_token") String auth_token,
			@PathVariable(value="amount") Double amount,@PathVariable(value="currency") String currency,
			@PathVariable(value="order_id")String order_id)
	{
		JSONObject jsonObject=new JSONObject();
		try {
			String merchant_id = "MC0000000089";
			MerchantSDKClient client = MerchantSDKClient.newBuilder()
					.setMerchant_id(merchant_id).build();
			TransactionConfig config = TransactionConfig.newBuilder().setAmount(amount)
					.setApi_id("6517be7b-810a-11e4-8328-32913f86e6ed").
					setApi_secret_key("mk-test-6517be3b-810a-11e4-8328-32913f86e6ed")
					.setAuth_token(auth_token)
					.setCurrency(currency)
					.setId_in_merchant(order_id)
					.setNotes(hard_coded_note_map.get(merchant_id)).build();
			System.out.println("transaction request==========================");
			System.out.println(config.toString());
			SDKResult result = client.transaction(config);
			System.out.println("transaction response=========================");
			System.out.println(result.getMessage());
			
			jsonObject.accumulate("code", result.getCode());
			jsonObject.accumulate("message", result.getMessage());
			jsonObject.accumulate("result", result.getResult()==null?"":result.getResult());
		} catch (Exception e) {
			// TODO: handle exception
			jsonObject.accumulate("code", "500");
			jsonObject.accumulate("message", "Fail");
			jsonObject.accumulate("result", "");
		}
		return jsonObject;
	}
	
	@RequestMapping(value="/pay/MC0000000089",method=RequestMethod.POST)
	public @ResponseBody JSONObject payMC0000000089(@RequestBody RequestModel model)
	{
		JSONObject jsonObject=new JSONObject();
		try {
			String merchant_id = "MC0000000089";
			MerchantSDKClient client = MerchantSDKClient.newBuilder()
					.setMerchant_id(merchant_id).build();
			TransactionConfig config = TransactionConfig.newBuilder().setAmount(model.getAmount())
					.setApi_id("6517be7b-810a-11e4-8328-32913f86e6ed").
					setApi_secret_key("mk-test-6517be3b-810a-11e4-8328-32913f86e6ed")
					.setAuth_token(model.getAuth_token())
					.setCurrency(model.getCurrency())
					.setId_in_merchant(model.getOrder_id())
					.setNotes(hard_coded_note_map.get(merchant_id)).build();
			System.out.println("transaction request==========================");
			System.out.println(config.toString());
			SDKResult result = client.transaction(config);
			System.out.println("transaction response=========================");
			System.out.println(result.getMessage());
			
			jsonObject.accumulate("code", result.getCode());
			jsonObject.accumulate("message", result.getMessage());
			jsonObject.accumulate("result", result.getResult()==null?"":result.getResult());
		} catch (Exception e) {
			// TODO: handle exception
			jsonObject.accumulate("code", "500");
			jsonObject.accumulate("message", "Fail");
			jsonObject.accumulate("result", "");
		}
		return jsonObject;
	}
	
	private RequestModel getRequestModel(HttpServletRequest request)throws Exception
	{
		try {
			String jsonStr=IOUtils.toString(request.getInputStream(), Charset.forName("UTF-8"));
			Gson gson=new Gson();
			return gson.fromJson(jsonStr, RequestModel.class);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}
}
