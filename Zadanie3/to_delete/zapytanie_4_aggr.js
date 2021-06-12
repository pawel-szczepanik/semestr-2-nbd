weightConvertionStage = {
		$addFields: {
			convertedWeight: {
				$convert: {input: "$weight", to: "double"}
			}
		}
	};
	weightComparisonStage = {
		$match: {
			convertedWeight: {
				$gte: 68,
				$lt: 71.5
			}
		}
	};
	printjson(db.people.aggregate([
		weightConvertionStage,
		weightComparisonStage
	]).toArray())