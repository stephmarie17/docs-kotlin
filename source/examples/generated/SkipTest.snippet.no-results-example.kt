val filter = Filters.empty()
collection.find(filter)
    .sort(Sorts.descending("qty"))
    .skip(9)
    .toList().forEach { println(it) }
