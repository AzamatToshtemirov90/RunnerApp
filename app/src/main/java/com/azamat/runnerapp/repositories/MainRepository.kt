package com.azamat.runnerapp.repositories

import com.azamat.runnerapp.db.Run
import com.azamat.runnerapp.db.RunDAO
import javax.inject.Inject


//repository decides which data source to get the data
class MainRepository @Inject constructor(
    val runDAO: RunDAO
){

    suspend fun insertRun(run: Run) = runDAO.upsert(run)

    suspend fun deleteRun(run: Run) = runDAO.delete(run)

    fun getAllRunsSortedByDate() = runDAO.getAllRunsSortedByDate()

    fun getAllRunsSortedByDistance() = runDAO.getAllRunsSortedByDistance()

    fun getAllRunsSortedByTimeInMillis() = runDAO.getAllRunsSortedByTimeInMillis()

    fun getAllRunsSortedByAvgSpeed() = runDAO.getAllRunsSortedByAvgSpeed()

    fun getAllRunsSortedByCaloriesBurned() = runDAO.getAllRunsSortedByCaloriesBurned()

    fun getTotalAvgSpeed() = runDAO.getTotalAvgSpeed()

    fun getTotalDistance() = runDAO.getTotalDistance()

    fun getTotalCaloriesBurned() = runDAO.getTotalCaloriesBurned()

    fun getTotalTimeInMillis() = runDAO.getTotalTimeInMillis()

}