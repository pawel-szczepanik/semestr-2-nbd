	balanceConversion = {
		$addFields: {
			"credit.convertedBalance": {
				$convert: {input: "$credit.balance", to: "double"}
			}
		}
	};
	sexAndNationalitySelection = {
		$match: {
			"sex": "Female",
			"nationality": "Poland"
		}
	};
	avgAndSumOfBalanceByCurrency = {
		$group: {
			"_id": "$credit.currency",
			"balanceAvg": {$avg: "$credit.convertedBalance"},
			"balanceSum": {$sum: "$credit.convertedBalance"}
		}
	};
	printjson(db.people.aggregate([
		{$unwind: "$credit"},
		balanceConversion,
		sexAndNationalitySelection,
		avgAndSumOfBalanceByCurrency
	]).toArray())
