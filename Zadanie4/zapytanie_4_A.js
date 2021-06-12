	weightConversion = {
		$addFields: {
			convertedWeight: {
				$convert: {input: "$weight", to: "double"}
			}
		}
	};
	heightConvertion = {
		$addFields: {
			convertedHeight: {
				$convert: {input: "$height", to: "double"}
			}
		}
	};
	bmiCalculation = {
		$addFields: {
			bmi: {
				$divide: ["$convertedWeight", {$pow: [{$divide: ["$convertedHeight", 100]}, 2]}]
			}
		}
	};
	avgMinMaxBmiByMationality = {
		$group: {
			"_id": "$nationality",
			avgBmi: {$avg: "$bmi"},
			minBmi: {$min: "$bmi"},
			maxBmi: {$max: "$bmi"}
		}
	}
	printjson(db.people.aggregate([
		weightConversion,
		heightConvertion,
		bmiCalculation,
		avgMinMaxBmiByMationality
	]).toArray())
