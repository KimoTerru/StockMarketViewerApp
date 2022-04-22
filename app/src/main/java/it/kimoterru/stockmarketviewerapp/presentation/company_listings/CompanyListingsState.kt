package it.kimoterru.stockmarketviewerapp.presentation.company_listings

import it.kimoterru.stockmarketviewerapp.domain.model.CompanyListing

data class CompanyListingsState(
    val companies: List<CompanyListing> = emptyList(),
    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,
    val searchQuery: String = ""
)