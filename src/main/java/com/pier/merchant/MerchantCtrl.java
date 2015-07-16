package com.pier.merchant;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pier.model.SDKResult;
import com.pier.model.TransactionConfig;
import com.pier.sdk.MerchantSDKClient;


@Controller
@RequestMapping(value="/server1/sdk")
public class MerchantCtrl {

	private Logger logger = Logger.getLogger(getClass());
	
	/**
	 * For demo purpose only, 
	 */

	
	private String getDummyNotes(String merchant_id){
		switch (merchant_id){
		case "AAA000000001":
			return "Sporting Shoes";
		case "MC0000000010":
			return "Tax Cab - LAX";
		case "MC0000000011":
			return "Museum Ticket";
		case "MC0000000017":
			return "Immigration Preparation";
		case "MC0000000057": 
			return "Mother's day flowers";
			
		case "MC0000000064":
			return "Breads, donuts, coffee, etc.";
		case "MC0000000083":
			return "Chiropractor services";
		case "MC0000000086":
			return "Nail polishing";
		case "MC0000000089":
			return "Iced Caffè Latte, Tazo Bottled Lemon Ginger etc.";
		case "MC0000000134":
			return "Acupuncture and care";
		default:
			return "";
					
		}
	}

	
	@RequestMapping(value="/pay/MC0000000134",method=RequestMethod.POST)
	public @ResponseBody JSONObject payMC0000000134(@RequestBody RequestModel model)
	{
		JSONObject jsonObject=new JSONObject();

		try {
			String merchant_id = "MC0000000134";
			String api_key = "5b52051a-931a-11e4-aad2-0ea81fa3d43c";
			
			MerchantSDKClient client = buildClient(merchant_id);
			TransactionConfig config = buildConfig(api_key, merchant_id, model);
			SDKResult result = transaction(client, config);
			response(result, jsonObject);
			
		} catch (Exception e) {
			response(jsonObject);
		}
		
		return jsonObject;
	}
	
	
	@RequestMapping(value="/pay/AAA000000001",method=RequestMethod.POST)
	public @ResponseBody JSONObject payAAA000000001(@RequestBody RequestModel model)
	{
		JSONObject jsonObject=new JSONObject();

		try {
			String merchant_id = "AAA000000001";
			String api_key = "9181240c-c3a8-11e4-adb1-095385a3a244";
			
			MerchantSDKClient client = buildClient(merchant_id);
			TransactionConfig config = buildConfig(api_key, merchant_id, model);
			SDKResult result = transaction(client, config);
			response(result, jsonObject);
			
		} catch (Exception e) {
			response(jsonObject);
		}
		
		return jsonObject;
	}
	
	
	@RequestMapping(value="/pay/MC0000000010",method=RequestMethod.POST)
	public @ResponseBody JSONObject payMC0000000010(@RequestBody RequestModel model)
	{
		JSONObject jsonObject=new JSONObject();

		try {
			String merchant_id = "MC0000000010";
			String api_key = "9495caa5-7fad-11e4-8328-32913f86e6ed";
			
			MerchantSDKClient client = buildClient(merchant_id);
			TransactionConfig config = buildConfig(api_key, merchant_id, model);
			SDKResult result = transaction(client, config);
			response(result, jsonObject);
			
		} catch (Exception e) {
			response(jsonObject);
		}
		
		return jsonObject;
	}
	
	@RequestMapping(value="/pay/MC0000000011",method=RequestMethod.POST)
	public @ResponseBody JSONObject payMC0000000011(@RequestBody RequestModel model)
	{
		JSONObject jsonObject=new JSONObject();
		
		try {
			String merchant_id = "MC0000000011";
			String api_key = "4ceccf36-7fae-11e4-8328-32913f86e6ed";
			
			MerchantSDKClient client = buildClient(merchant_id);
			TransactionConfig config = buildConfig(api_key, merchant_id, model);
			SDKResult result = transaction(client, config);
			response(result, jsonObject);
			
		} catch (Exception e) {
			response(jsonObject);
		}
		
		return jsonObject;
	}
	
	@RequestMapping(value="/pay/MC0000000017",method=RequestMethod.POST)
	public @ResponseBody JSONObject payMC0000000017(@RequestBody RequestModel model)
	{
		JSONObject jsonObject=new JSONObject();
		
		try {
			String merchant_id = "MC0000000017";
			String api_key = "51423988-7f6b-11e4-8328-32913f86e6ed";
			
			MerchantSDKClient client = buildClient(merchant_id);
			TransactionConfig config = buildConfig(api_key, merchant_id, model);
			SDKResult result = transaction(client, config);
			response(result, jsonObject);
			
		} catch (Exception e) {
			response(jsonObject);
		}
		
		return jsonObject;
	}
	
	
	@RequestMapping(value="/pay/MC0000000057",method=RequestMethod.POST)
	public @ResponseBody JSONObject payMC0000000057(@RequestBody RequestModel model)
	{
		JSONObject jsonObject=new JSONObject();
		
		try {
			String merchant_id = "MC0000000057";
			String api_key = "f4702c83-804a-11e4-8328-32913f86e6ed";
			
			MerchantSDKClient client = buildClient(merchant_id);
			TransactionConfig config = buildConfig(api_key, merchant_id, model);
			SDKResult result = transaction(client, config);
			response(result, jsonObject);
			
		} catch (Exception e) {
			response(jsonObject);
		}
		
		return jsonObject;
	}
	
	@RequestMapping(value="/pay/MC0000000064",method=RequestMethod.POST)
	public @ResponseBody JSONObject payMC0000000064(@RequestBody RequestModel model)
	{
		JSONObject jsonObject=new JSONObject();
		
		try {
			String merchant_id = "MC0000000064";
			String api_key = "fa4472aa-7fac-11e4-8328-32913f86e6ed";
			
			MerchantSDKClient client = buildClient(merchant_id);
			TransactionConfig config = buildConfig(api_key, merchant_id, model);
			SDKResult result = transaction(client, config);
			response(result, jsonObject);
			
		} catch (Exception e) {
			response(jsonObject);
		}
		
		return jsonObject;
	}
	
	
	@RequestMapping(value="/pay/MC0000000083",method=RequestMethod.POST)
	public @ResponseBody JSONObject payMC0000000083(@RequestBody RequestModel model)
	{
		JSONObject jsonObject=new JSONObject();
		
		try {
			String merchant_id = "MC0000000083";
			String api_key = "e0a71c29-8f89-11e4-aad2-0ea81fa3d43c";
			
			MerchantSDKClient client = buildClient(merchant_id);
			TransactionConfig config = buildConfig(api_key, merchant_id, model);
			SDKResult result = transaction(client, config);
			response(result, jsonObject);
			
		} catch (Exception e) {
			response(jsonObject);
		}
		
		return jsonObject;
	}
	
	@RequestMapping(value="/pay/MC0000000086",method=RequestMethod.POST)
	public @ResponseBody JSONObject payMC0000000086(@RequestBody RequestModel model)
	{
		JSONObject jsonObject=new JSONObject();
		
		try {
			String merchant_id = "MC0000000086";
			String api_key = "7729d25a-903b-11e4-aad2-0ea81fa3d43c";
			
			MerchantSDKClient client = buildClient(merchant_id);
			TransactionConfig config = buildConfig(api_key, merchant_id, model);
			SDKResult result = transaction(client, config);
			response(result, jsonObject);
			
		} catch (Exception e) {
			response(jsonObject);
		}
		
		return jsonObject;
	}
	
	@RequestMapping(value="/pay/MC0000000089",method=RequestMethod.POST)
	public @ResponseBody JSONObject payMC0000000089(@RequestBody RequestModel model)
	{
		JSONObject jsonObject=new JSONObject();
		
		try {
			String merchant_id = "MC0000000089";
			String api_key = "6517be7b-810a-11e4-8328-32913f86e6ed";
			
			MerchantSDKClient client = buildClient(merchant_id);
			TransactionConfig config = buildConfig(api_key, merchant_id, model);
			SDKResult result = transaction(client, config);
			response(result, jsonObject);
			
		} catch (Exception e) {
			response(jsonObject);
		}
		
		return jsonObject;
	}
	
	private MerchantSDKClient buildClient(String merchant_id) throws Exception {
		return MerchantSDKClient.newBuilder().setMerchant_id(merchant_id).build();
	}
	
	private TransactionConfig buildConfig(String api_key, String merchant_id, RequestModel model) throws Exception {
		return TransactionConfig.newBuilder().setAmount(model.getAmount())
				.setApi_key(api_key)
				.setAuth_token(model.getAuth_token())
				.setCurrency(model.getCurrency())
				.setId_in_merchant(model.getOrder_id())
				.setNotes(getDummyNotes(merchant_id)).build();
	}
	
	private SDKResult transaction(MerchantSDKClient client, TransactionConfig config) throws Exception {
		logger.debug("transaction request==========================");
		logger.info(config.toString());
		SDKResult result = client.transaction(config);
		logger.debug("transaction response=========================");
		logger.info(result.getMessage());
		return result;
	}
	
	private void response(SDKResult result, JSONObject jsonObject) {
		jsonObject.accumulate("code", result.getCode());
		jsonObject.accumulate("message", result.getMessage());
		jsonObject.accumulate("result", result.getResult()==null?"":result.getResult());
	}
	
	private void response(JSONObject jsonObject) {
		jsonObject.accumulate("code", "500");
		jsonObject.accumulate("message", "Fail");
		jsonObject.accumulate("result", "");
	}
}
