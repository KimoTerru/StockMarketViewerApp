package it.kimoterru.stockmarketviewerapp.data.mapper

import it.kimoterru.stockmarketviewerapp.data.local.CompanyListingEntity
import it.kimoterru.stockmarketviewerapp.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}