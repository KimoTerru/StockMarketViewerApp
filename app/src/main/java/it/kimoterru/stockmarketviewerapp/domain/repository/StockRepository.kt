package it.kimoterru.stockmarketviewerapp.domain.repository

import it.kimoterru.stockmarketviewerapp.domain.model.CompanyInfo
import it.kimoterru.stockmarketviewerapp.domain.model.CompanyListing
import it.kimoterru.stockmarketviewerapp.domain.model.IntradayInfo
import it.kimoterru.stockmarketviewerapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>

}