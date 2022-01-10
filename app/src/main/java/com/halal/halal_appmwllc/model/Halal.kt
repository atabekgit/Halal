package com.halal.halal_appmwllc.model

data class Country(val nameOfCountry:String, var isSelected :Boolean = false)

data class ECode(val text: String, val textDescription: String)

data class Language(val id:Int,val nameOfLanguage:String, var isSelected :Boolean = false)

data class Banner(val id:Int,val banner:String,val creation_date:String,val update_date:String)

data class Question(var id:Int = 0,val author:String,val question:String,val answer:String)