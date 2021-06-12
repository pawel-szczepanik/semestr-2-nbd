	balanceConversion = {
		$addFields: {
			"credit.convertedBalance": {
				$convert: {input: "$credit.balance", to: "double"}
			}
		}
	};
	sumOfBalanceByCurrency = {
		$group: {
			"_id": "$credit.currency",
			"balanceSum": {$sum: "$credit.convertedBalance"}
		}
	};
	printjson(db.people.aggregate([
		{$unwind: "$credit"},
		balanceConversion,
		sumOfBalanceByCurrency
	]).toArray())
