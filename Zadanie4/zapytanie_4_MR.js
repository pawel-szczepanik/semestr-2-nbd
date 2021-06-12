	var mapFunction = function() {
		
		var convertedWeight = parseFloat(this.weight);
		var convertedHeight = parseFloat(this.height);
		
		var bmi = convertedWeight / Math.pow((convertedHeight / 100), 2);
		
		var key = this.nationality;
		var value = {
			count: 1,
			bmi: bmi,
			minBmi: bmi,
			maxBmi: bmi
		};
		
		emit(key, value);
	};
	var reduceFunction = function(key, values) {
		
		var reducedValue = {
			count: 0,
			bmi: 0,
			minBmi: 0,
			maxBmi: 0
		};
		
		var bmiArray = [];
		
		values.forEach(function(item) {
			reducedValue.bmi += item.bmi;
			bmiArray.push(item.bmi);
			reducedValue.count += 1;
		});
		
		reducedValue.minBmi = Math.min(...bmiArray);
		reducedValue.maxBmi = Math.max(...bmiArray);
		
		return reducedValue;
	};
	var finalizeFunction = function(key, reducedValue) {
		
		var avgBmi = reducedValue.bmi / reducedValue.count;
		
		var modifiedObject = {
			avgBmi: avgBmi,
			minBmi: reducedValue.minBmi,
			maxBmi: reducedValue.maxBmi
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
