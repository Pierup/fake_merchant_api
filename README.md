# fake_api

## merchantctrl

###  apiName: payMC0000000134

apiurl: [host]pier-merchant/demo/pay/MC0000000134<br/>
protocl: HTTPS<br/>
method: POST<br/>

request: ==><br/>
json request parameter:<br/>
```json
{
    "amount":"19.00",
    "auth_token":"c14061e522b3dbb1f3ba67b378ec9cf2",
    "order_id":"11111",
    "currency_code":"USD"
}
```

response: <br/>
success message:<br/>
http_code: 200<br/>
```json
{
	"code":"200",
	"message":"OK",
	"result":{
		"items":[
			{
				"transaction_id":"MT0000021708"
			}
		]
	}
}
```

###  apiName: payAAA000000001

apiurl: [host]pier-merchant/demo/pay/AAA000000001<br/>
protocl: HTTPS<br/>
method: POST<br/>

request: ==><br/>
json request parameter:<br/>
```json
{
    "amount":"19.00",
    "auth_token":"41fe78bba719ae265dc88a665d193f5e",
    "order_id":"12222",
    "currency_code":"USD"
}
```

response: <br/>
success message:<br/>
http_code: 200<br/>
```json
{
	"code":"200",
	"message":"OK",
	"result":
		{"items":[
			{
				"transaction_id":"MT0000021703"
			}
		]
	}
}
```

###  apiName: payMC0000000010

apiurl: [host]pier-merchant/demo/pay/MC0000000010<br/>
protocl: HTTPS<br/>
method: POST<br/>

request: ==><br/>
json request parameter:<br/>
```json
{
    "amount":"19.00",
    "auth_token":"404fd5e96e0962a079d2d29ee1fb2dac",
    "order_id":"11111",
    "currency_code":"USD"
}
```

response: <br/>
success message:<br/>
http_code: 200<br/>
```json
{
	"code":"200",
	"message":"OK",
	"result":{
		"items":[
			{
				"transaction_id":"MT0000021713"
			}
		]
	}
}
```

###  apiName: payMC0000000010

apiurl: [host]pier-merchant/demo/pay/MC0000000010<br/>
protocl: HTTPS<br/>
method: POST<br/>

request: ==><br/>
json request parameter:<br/>
```json
{
    "amount":"19.00",
    "auth_token":"404fd5e96e0962a079d2d29ee1fb2dac",
    "order_id":"11111",
    "currency_code":"USD"
}
```

response: <br/>
success message:<br/>
http_code: 200<br/>
```json
{
	"code":"200",
	"message":"OK",
	"result":{
		"items":[
			{
				"transaction_id":"MT0000021713"
			}
		]
	}
}
```

