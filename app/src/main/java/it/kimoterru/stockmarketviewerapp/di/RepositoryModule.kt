package it.kimoterru.stockmarketviewerapp.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import it.kimoterru.stockmarketviewerapp.data.csv.CSVParser
import it.kimoterru.stockmarketviewerapp.data.csv.CompanyListingsParser
import it.kimoterru.stockmarketviewerapp.data.csv.IntradayInfoParser
import it.kimoterru.stockmarketviewerapp.data.repository.StockRepositoryImpl
import it.kimoterru.stockmarketviewerapp.domain.model.CompanyListing
import it.kimoterru.stockmarketviewerapp.domain.model.IntradayInfo
import it.kimoterru.stockmarketviewerapp.domain.repository.StockRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}