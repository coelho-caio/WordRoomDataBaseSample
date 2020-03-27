package com.example.roomwordssample

import androidx.lifecycle.LiveData


import androidx.annotation.WorkerThread

class WordRepository(private val wordDao: WordDao) {


    val allWords: LiveData<List<Word>> = wordDao.getAlphabetizedWords()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}