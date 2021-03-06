package com.iflytek.cyber.iot.show.core.api

import com.iflytek.cyber.iot.show.core.model.SkillDetail
import com.iflytek.cyber.iot.show.core.model.SkillSection
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface SkillApi {

    @GET("skill_sections")
    fun getSkillSections(): Call<ArrayList<SkillSection>>

    @GET("skills/{id}")
    fun getSkillDetail(@Path("id") id: String): Call<SkillDetail>
}