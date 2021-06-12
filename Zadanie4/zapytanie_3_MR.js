	var mapFunction = function() {
		emit(this.job, null);
	};
	var reduceFunction = function(key, values) {
		var reducedValue = null;
		
		return reducedValue;
	};
	printjson(db.people.mapReduce(
		mapFunction,
		reduceFunction,
		{
			out: {inline: 1}
		}
	))
