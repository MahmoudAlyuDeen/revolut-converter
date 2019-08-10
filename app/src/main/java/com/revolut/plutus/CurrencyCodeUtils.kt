@file:Suppress("SpellCheckingInspection")

package com.revolut.plutus

val countryCodes = mapOf(
    "BDT" to "BD",
    "XOF" to "BF",
    "BGN" to "BG",
    "BAM" to "BA",
    "BBD" to "BB",
    "EUR" to "EU",
    "XPF" to "WF",
    "BMD" to "BM",
    "BND" to "BN",
    "BOB" to "BO",
    "BHD" to "BH",
    "BIF" to "BI",
    "XOF" to "BJ",
    "BTN" to "BT",
    "JMD" to "JM",
    "NOK" to "BV",
    "BWP" to "BW",
    "WST" to "WS",
    "BRL" to "BR",
    "BSD" to "BS",
    "BYR" to "BY",
    "BZD" to "BZ",
    "RUB" to "RU",
    "RWF" to "RW",
    "RSD" to "RS",
    "TMT" to "TM",
    "TJS" to "TJ",
    "RON" to "RO",
    "NZD" to "TK",
    "XOF" to "GW",
    "GTQ" to "GT",
    "XAF" to "GQ",
    "JPY" to "JP",
    "GYD" to "GY",
    "GEL" to "GE",
    "XCD" to "GD",
    "GBP" to "GB",
    "XAF" to "GA",
    "GNF" to "GN",
    "GMD" to "GM",
    "DKK" to "GL",
    "GIP" to "GI",
    "GHS" to "GH",
    "OMR" to "OM",
    "TND" to "TN",
    "JOD" to "JO",
    "HRK" to "HR",
    "HTG" to "HT",
    "HUF" to "HU",
    "HKD" to "HK",
    "HNL" to "HN",
    "AUD" to "HM",
    "VEF" to "VE",
    "ILS" to "PS",
    "NOK" to "SJ",
    "PYG" to "PY",
    "IQD" to "IQ",
    "PAB" to "PA",
    "XPF" to "PF",
    "PGK" to "PG",
    "PEN" to "PE",
    "PKR" to "PK",
    "PHP" to "PH",
    "NZD" to "PN",
    "PLN" to "PL",
    "ZMK" to "ZM",
    "MAD" to "EH",
    "EGP" to "EG",
    "ZAR" to "ZA",
    "VND" to "VN",
    "SBD" to "SB",
    "ETB" to "ET",
    "SOS" to "SO",
    "ZWL" to "ZW",
    "SAR" to "SA",
    "ERN" to "ER",
    "MDL" to "MD",
    "MGA" to "MG",
    "MAD" to "MA",
    "UZS" to "UZ",
    "MMK" to "MM",
    "XOF" to "ML",
    "MOP" to "MO",
    "MNT" to "MN",
    "MKD" to "MK",
    "MUR" to "MU",
    "MWK" to "MW",
    "MVR" to "MV",
    "XCD" to "MS",
    "MRO" to "MR",
    "UGX" to "UG",
    "TZS" to "TZ",
    "MYR" to "MY",
    "MXN" to "MX",
    "ILS" to "IL",
    "SHP" to "SH",
    "FJD" to "FJ",
    "FKP" to "FK",
    "DKK" to "FO",
    "NIO" to "NI",
    "NOK" to "NO",
    "NAD" to "NA",
    "VUV" to "VU",
    "XPF" to "NC",
    "XOF" to "NE",
    "AUD" to "NF",
    "NGN" to "NG",
    "NZD" to "NZ",
    "NPR" to "NP",
    "AUD" to "NR",
    "NZD" to "NU",
    "NZD" to "CK",
    "XOF" to "CI",
    "CHF" to "CH",
    "COP" to "CO",
    "CNY" to "CN",
    "XAF" to "CM",
    "CLP" to "CL",
    "AUD" to "CC",
    "CAD" to "CA",
    "XAF" to "CG",
    "XAF" to "CF",
    "CDF" to "CD",
    "CZK" to "CZ",
    "AUD" to "CX",
    "CRC" to "CR",
    "ANG" to "CW",
    "CVE" to "CV",
    "CUP" to "CU",
    "SZL" to "SZ",
    "SYP" to "SY",
    "ANG" to "SX",
    "KGS" to "KG",
    "KES" to "KE",
    "SSP" to "SS",
    "SRD" to "SR",
    "AUD" to "KI",
    "KHR" to "KH",
    "XCD" to "KN",
    "KMF" to "KM",
    "STD" to "ST",
    "KRW" to "KR",
    "KPW" to "KP",
    "KWD" to "KW",
    "XOF" to "SN",
    "SLL" to "SL",
    "SCR" to "SC",
    "KZT" to "KZ",
    "KYD" to "KY",
    "SGD" to "SG",
    "SEK" to "SE",
    "SDG" to "SD",
    "DOP" to "DO",
    "XCD" to "DM",
    "DJF" to "DJ",
    "DKK" to "DK",
    "YER" to "YE",
    "DZD" to "DZ",
    "USD" to "US",
    "UYU" to "UY",
    "LBP" to "LB",
    "XCD" to "LC",
    "LAK" to "LA",
    "AUD" to "TV",
    "TWD" to "TW",
    "TTD" to "TT",
    "TRY" to "TR",
    "LKR" to "LK",
    "TOP" to "TO",
    "LTL" to "LT",
    "LRD" to "LR",
    "LSL" to "LS",
    "THB" to "TH",
    "XOF" to "TG",
    "XAF" to "TD",
    "LYD" to "LY",
    "XCD" to "VC",
    "AED" to "AE",
    "XCD" to "AG",
    "AFN" to "AF",
    "XCD" to "AI",
    "ISK" to "IS",
    "IRR" to "IR",
    "AMD" to "AM",
    "ALL" to "AL",
    "AOA" to "AO",
    "ARS" to "AR",
    "AUD" to "AU",
    "AWG" to "AW",
    "INR" to "IN",
    "AZN" to "AZ",
    "IDR" to "ID",
    "UAH" to "UA",
    "QAR" to "QA",
    "MZN" to "MZ"
)

val currencyNames = mapOf(
    "AFN" to "Afghani",
    "EUR" to "Euro",
    "DZD" to "Algerian Dinar",
    "USD" to "US Dollar",
    "AOA" to "Kwanza",
    "XCD" to "East Caribbean Dollar",
    "ICA" to "ANTARC",
    "ARS" to "Argentine Peso",
    "AMD" to "Armenian Dram",
    "AWG" to "Aruban Florin",
    "AUD" to "Australian Dollar",
    "AZN" to "Azerbaijanian Manat",
    "BSD" to "Bahamian Dollar",
    "BHD" to "Bahraini Dinar",
    "BDT" to "Taka",
    "BBD" to "Barbados Dollar",
    "BYN" to "Belarusian Ruble",
    "BZD" to "Belize Dollar",
    "XOF" to "CFA Franc BCEAO",
    "BMD" to "Bermudian Dollar",
    "INR" to "Indian Rupee",
    "BTN" to "Ngultrum",
    "BOB" to "Boliviano",
    "BOV" to "Mvdol",
    "BAM" to "Convertible Mark",
    "BWP" to "Pula",
    "NOK" to "Norwegian Krone",
    "BRL" to "Brazilian Real",
    "BND" to "Brunei Dollar",
    "BGN" to "Bulgarian Lev",
    "XOF" to "CFA Franc BCEAO",
    "BIF" to "Burundi Franc",
    "CVE" to "Cabo Verde Escudo",
    "KHR" to "Riel",
    "XAF" to "CFA Franc BEAC",
    "CAD" to "Canadian Dollar",
    "KYD" to "Cayman Islands Dollar",
    "XAF" to "CFA Franc BEAC",
    "XAF" to "CFA Franc BEAC",
    "CLP" to "Chilean Peso",
    "CLF" to "Unidad de Fomento",
    "CNY" to "Yuan Renminbi",
    "AUD" to "Australian Dollar",
    "AUD" to "Australian Dollar",
    "COP" to "Colombian Peso",
    "COU" to "Unidad de Valor Real",
    "KMF" to "Comoro Franc",
    "CDF" to "Congolese Franc",
    "XAF" to "CFA Franc BEAC",
    "NZD" to "New Zealand Dollar",
    "CRC" to "Costa Rican Colon",
    "XOF" to "CFA Franc BCEAO",
    "HRK" to "Kuna",
    "CUP" to "Cuban Peso",
    "CUC" to "Peso Convertible",
    "ANG" to "Netherlands Antillean Guilder",
    "CZK" to "Czech Koruna",
    "DKK" to "Danish Krone",
    "DJF" to "Djibouti Franc",
    "XCD" to "East Caribbean Dollar",
    "DOP" to "Dominican Peso",
    "EGP" to "Egyptian Pound",
    "SVC" to "El Salvador Colon",
    "XAF" to "CFA Franc BEAC",
    "ERN" to "Nakfa",
    "ETB" to "Ethiopian Birr",
    "FKP" to "Falkland Islands Pound",
    "DKK" to "Danish Krone",
    "FJD" to "Fiji Dollar",
    "XPF" to "CFP Franc",
    "XAF" to "CFA Franc BEAC",
    "GMD" to "Dalasi",
    "GEL" to "Lari",
    "GHS" to "Ghana Cedi",
    "GIP" to "Gibraltar Pound",
    "DKK" to "Danish Krone",
    "XCD" to "East Caribbean Dollar",
    "GTQ" to "Quetzal",
    "GNF" to "Guinea Franc",
    "XOF" to "CFA Franc BCEAO",
    "GYD" to "Guyana Dollar",
    "HTG" to "Gourde",
    "AUD" to "Australian Dollar",
    "HNL" to "Lempira",
    "HKD" to "Hong Kong Dollar",
    "HUF" to "Forint",
    "ISK" to "Iceland Krona",
    "INR" to "Indian Rupee",
    "IDR" to "Rupiah",
    "XDR" to "SDR (Special Drawing Right)",
    "IRR" to "Iranian Rial",
    "IQD" to "Iraqi Dinar",
    "ILS" to "New Israeli Sheqel",
    "JMD" to "Jamaican Dollar",
    "JPY" to "Yen",
    "GBP" to "Pound Sterling",
    "JOD" to "Jordanian Dinar",
    "KZT" to "Tenge",
    "KES" to "Kenyan Shilling",
    "AUD" to "Australian Dollar",
    "KPW" to "North Korean Won",
    "KRW" to "Won",
    "KWD" to "Kuwaiti Dinar",
    "KGS" to "Som",
    "LAK" to "Kip",
    "LBP" to "Lebanese Pound",
    "LSL" to "Loti",
    "ZAR" to "Rand",
    "LRD" to "Liberian Dollar",
    "LYD" to "Libyan Dinar",
    "CHF" to "Swiss Franc",
    "MOP" to "Pataca",
    "MKD" to "Denar",
    "MGA" to "Malagasy Ariary",
    "MWK" to "Malawi Kwacha",
    "MYR" to "Malaysian Ringgit",
    "MVR" to "Rufiyaa",
    "XOF" to "CFA Franc BCEAO",
    "MRO" to "Ouguiya",
    "MUR" to "Mauritius Rupee",
    "XUA" to "ADB Unit of Account",
    "MXN" to "Mexican Peso",
    "MXV" to "Mexican Unidad de Inversion (UDI)",
    "MDL" to "Moldovan Leu",
    "MNT" to "Tugrik",
    "XCD" to "East Caribbean Dollar",
    "MAD" to "Moroccan Dirham",
    "MZN" to "Mozambique Metical",
    "MMK" to "Kyat",
    "NAD" to "Namibia Dollar",
    "ZAR" to "Rand",
    "AUD" to "Australian Dollar",
    "NPR" to "Nepalese Rupee",
    "XPF" to "CFP Franc",
    "NZD" to "New Zealand Dollar",
    "NIO" to "Cordoba Oro",
    "XOF" to "CFA Franc BCEAO",
    "NGN" to "Naira",
    "NZD" to "New Zealand Dollar",
    "AUD" to "Australian Dollar",
    "NOK" to "Norwegian Krone",
    "OMR" to "Rial Omani",
    "PKR" to "Pakistan Rupee",
    "PAB" to "Balboa",
    "PGK" to "Kina",
    "PYG" to "Guarani",
    "PEN" to "Sol",
    "PHP" to "Philippine Peso",
    "NZD" to "New Zealand Dollar",
    "PLN" to "Zloty",
    "QAR" to "Qatari Rial",
    "RON" to "Romanian Leu",
    "RUB" to "Russian Ruble",
    "RWF" to "Rwanda Franc",
    "SHP" to "Saint Helena Pound",
    "XCD" to "East Caribbean Dollar",
    "WST" to "Tala",
    "STD" to "Dobra",
    "SAR" to "Saudi Riyal",
    "XOF" to "CFA Franc BCEAO",
    "RSD" to "Serbian Dinar",
    "SCR" to "Seychelles Rupee",
    "SLL" to "Leone",
    "SGD" to "Singapore Dollar",
    "ANG" to "Netherlands Antillean Guilder",
    "XSU" to "Sucre",
    "SBD" to "Solomon Islands Dollar",
    "SOS" to "Somali Shilling",
    "ZAR" to "Rand",
    "NDS" to "SOUTH GEORGIA AND THE SOUTH SANDWICH ISL",
    "SSP" to "South Sudanese Pound",
    "LKR" to "Sri Lanka Rupee",
    "SDG" to "Sudanese Pound",
    "SRD" to "Surinam Dollar",
    "NOK" to "Norwegian Krone",
    "SZL" to "Lilangeni",
    "SEK" to "Swedish Krona",
    "CHF" to "Swiss Franc",
    "CHE" to "WIR Euro",
    "CHW" to "WIR Franc",
    "SYP" to "Syrian Pound",
    "TWD" to "New Taiwan Dollar",
    "TJS" to "Somoni",
    "TZS" to "Tanzanian Shilling",
    "THB" to "Baht",
    "XOF" to "CFA Franc BCEAO",
    "NZD" to "New Zealand Dollar",
    "TTD" to "Trinidad and Tobago Dollar",
    "TND" to "Tunisian Dinar",
    "TRY" to "Turkish Lira",
    "TMT" to "Turkmenistan New Manat",
    "AUD" to "Australian Dollar",
    "UGX" to "Uganda Shilling",
    "UAH" to "Hryvnia",
    "AED" to "UAE Dirham",
    "UYU" to "Peso Uruguayo",
    "UYI" to "Uruguay Peso en Unidades Indexadas (URUIURUI)",
    "UZS" to "Uzbekistan Sum",
    "VUV" to "Vatu",
    "VND" to "Dong",
    "XPF" to "CFP Franc",
    "MAD" to "Moroccan Dirham",
    "YER" to "Yemeni Rial",
    "ZMW" to "Zambian Kwacha",
    "ZWL" to "Zimbabwe Dollar"
)