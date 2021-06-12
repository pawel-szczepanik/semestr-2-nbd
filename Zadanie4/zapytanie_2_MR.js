	var mapFunction = function() {
		this.credit.forEach(function(item) {
			var key = item.currency;
			var value = parseFloat(item.balance);
		
			emit(key, value);
		});
	};
	var reduceFunction = function(key, values) {
		var reducedValue = Array.sum(values);
		
		return reducedValue;
	};
	printjson(db.people.mapReduce(
		mapFunction,
		reduceFunction,
		{
			out: {inline: 1}
		}
	))
