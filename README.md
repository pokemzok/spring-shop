[![CircleCI](https://circleci.com/gh/jan-lenart/spring-shop/tree/master.svg?style=svg)](https://circleci.com/gh/jan-lenart/spring-shop/tree/master)

### Endpoints

| Method | Url | Description | RequestBody | 
| ------ | --- | ---------- |------------ |
| POST    |/order/new  | add new order with status CREATED | order JSON|
| POST    |/order/validate| validate existing order - change status to PAID | order id - integer|

### Example of order JSON
```HTTP
{
	"orderInfoDTO": {
		"id": 1,
		"orderDateTime": "2018-09-14 18:38:09",
		"totalPriceCurrency": "PLN",
		"customerDTO": {
			"id": 1,
			"name": "Stefan",
			"surname": "Kowalski",
			"pesel": "75110521456",
			"addressDTO": {
					"id": 1,
					"city": "Grójec",
					"street": "Główna",
					"houseNr": 125,
					"apartmentNr": 54
			}
		},
		"itemDTOs": [
		{
			"id": 1,
			"name": "Banana",
			"description": "It is a banana",
			"barcode": "BBB",
			"price": 2.15,
			"quantity": 300,
			"priceCurrency": "PLN"
		},
		{
			"id": 2,
			"name": "Coconut",
			"description": "It is a coconut",
			"barcode": "CCC",
			"price": 12.86,
			"quantity": 1,
			"priceCurrency": "PLN"
		}
		]
	}
	
}
```
