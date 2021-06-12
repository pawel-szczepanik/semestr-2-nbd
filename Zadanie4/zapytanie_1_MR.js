	var mapFunction = function() {
		
		var convertedWeight = parseFloat(this.weight);
		var convertedHeight = parseFloat(this.height);
		
		var key = this.sex;
	
		var values = {
			weight: convertedWeight,
			height: convertedHeight,
			count: 1
		};
	
		emit(key, values);
	};
	var reduceFunction = function(key, values) {
	
		var reducedValue = {
			weight: 0,
			height: 0,
			count: 0
		};
	
		values.forEach(function(item) {
			reducedValue.weight += item.weight;
			reducedValue.height += item.height;
			reducedValue.count += 1;
		});
	
		return reducedValue;
	};
	var finalizeFunction = function(key, reducedValue) {
		
		var avgWeight = reducedValue.weight / reducedValue.count;
		var avgHeight = reducedValue.height / reducedValue.count;
		
		var modifiedObject = {
			avgWeight: avgWeight,
			avgHeight: avgHeight
		};
		
		return modifiedObject;
	};
	printjson(db.people.mapReduce(
		mapFunction,
		reduceFunction,
		{
			out: {inline: 1},
			finalize: finalizeFunction
		}
	))
