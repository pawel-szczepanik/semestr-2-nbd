birthCenturyFieldCreationStage = {
		$addFields: {
			birthCentury: {
				$convert: {
					input:{ $substrBytes: ["$birth_date", 0, 4] },
					to: "double"
				}
			}
		}
	};
	birthCenturySelectionStage = {
		$match: {
			birthCentury: {
				$gte: 2001,
				$lte: 2100
			}
		}
	};
	dataProjectionStage = {
		$project: {
			_id: 0, first_name: 1, last_name: 1, "location.city": 1
		}
	};
	printjson(db.people.aggregate([
		birthCenturyFieldCreationStage,
		birthCenturySelectionStage,
		dataProjectionStage
	]).toArray())