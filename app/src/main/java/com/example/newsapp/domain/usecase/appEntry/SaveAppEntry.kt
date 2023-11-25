package com.example.newsapp.domain.usecase.appEntry

import com.example.newsapp.domain.manager.LocalUserManger

class SaveAppEntry(
    private val localUserManger: LocalUserManger
) {

    suspend operator fun invoke() {
        localUserManger.saveAppEntry()
    }

}