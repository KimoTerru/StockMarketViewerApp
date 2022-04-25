package it.kimoterru.stockmarketviewerapp.presentation.company_info

import it.kimoterru.stockmarketviewerapp.domain.model.CompanyInfo
import it.kimoterru.stockmarketviewerapp.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)