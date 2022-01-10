package com.halal.halal_appmwllc.model

data class Country(val nameOfCountry:String, var isSelected :Boolean = false)

//model for ECode
data class ECode(var id:Int,val code:String,val title_ky:String,val title_ru:String,
                 val type:String,val damage_description_ru:String,
                 val damage_description_ky:String,val useful_description_ru:String,val useful_description_ky:String,
                 val use_description_ky:String,val use_description_ru:String,
                 val text: String, val textDescription: String)

//model for Product
data class Product(
    var id:Int,
    val title_ky: String,
    val title_ru: String,
    val photo:String? = null,
    val company: String? =null )

//model for Category
data class Category(val id:Int, val title_ky:String,val title_ru:String)

// model for Banner
data class Banner(val id:Int,val banner:String,val creation_date:String,val update_date:String)

data class Question(var id:Int = 0,val author:String,val question:String,val answer:String = "")

//model for Application
data class Application(var id:Int,val company_name :String,val address:String
,val product_type:String,val name:String,val phone:String)

//model for User
data class User(var id:Int = 0 ,val username:String,val email:String
,val avatar:String? = "",val phone:String? = "",val gender:String,val creation_date:String? = "",val update_date:String? = "")

//model for TokenObtainPair
data class TokenObtainPai(val email:String,val password:String)

//model for TokenRefresh
data class TokenRefresh(val refresh:String,val access:String)

//model for Company
data class Company(var id:Int,val name:String,val logo:String? = null,val category:Int? = null)

//model for Time
data class Time(var id:Int,val date:String,val first_time:String,val second_time:String
,val third_time:String,val fourth_time:String,val fifth_time:String,val sixth_time:String)