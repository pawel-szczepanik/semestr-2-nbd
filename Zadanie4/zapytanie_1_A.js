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
	avgWeightAndHeightBySex = {
		$group: {
			"_id": "$sex",
			"avgWeight": {$avg: "$convertedWeight"},
			"avgHeight": {$avg: "$convertedHeight"}
		}
	};
	printjson(db.people.aggregate([
		weightConversion,
		heightConvertion,
		avgWeightAndHeightBySex
	]).toArray())
	