heightConvertionStage = {
		$addFields: {
			convertedHeight: {
				$convert: {input: "$height", to: "double"}
			}
		}
	};
	heightSelectionStage = {
		$match: {
			convertedHeight: { $not: { $gt: 190 } }
		}
	};
	convertedHeightHidingStage= {
		$unset: "convertedHeight"
	};
	outSavingStage= {
		$out: "people"
	};
	printjson(db.people.aggregate([
		heightConvertionStage,
		heightSelectionStage,
		convertedHeightHidingStage,
		outSavingStage
	]).toArray())