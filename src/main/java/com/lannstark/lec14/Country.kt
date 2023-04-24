package com.lannstark.lec14

fun handleCountry(country: Country) {
    when (country) {
        Country.Korea -> TODO()
        Country.AMERICA -> TODO()
    }
}

enum class Country(
    private val code: String
) {
    Korea("KO"),
    AMERICA("US")
}