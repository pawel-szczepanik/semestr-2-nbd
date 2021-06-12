	var mapFunction = function() {
		this.credit.forEach(function(item) {
			var key = item.currency;
			var convertedBalance = parseFloat(item.balance);
			var value = {
				count: 1,
				sumBalance: convertedBalance
			};
		
			emit(key, value);
		});
	};
	var reduceFunction = function(key, values) {
		
		var reducedValue = {
			count: 0,
			sumBalance: 0
		};
		
		values.forEach(function(item) {
			reducedValue.count += 1;
			reducedValue.sumBalance += item.sumBalance;
		});
		
		return reducedValue;
	};
	var finalizeFunction = function(key, reducedValue) {
		
		var avgBalance = reducedValue.sumBalance / reducedValue.count;
		
		var modifiedObject = {
			avgBalance: avgBalance,
			sumBalance: reducedValue.sumBalance
		};
		
		return modifiedObject;
	};
	printjson(db.people.mapReduce(
		mapFunction,
		reduceFunction,
		{
			out: {inline: 1},
			query: {
				"sex": "Female",
				"nationality": "Poland"
			},
			finalize: finalizeFunction
		}
	))
