package com.example.midterm_2

import androidx.room.*


@Dao
interface HealthDao {

    @Query("SELECT * FROM HEALTH")
    fun getAllCars(): List<Health>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg cars: Health)

    @Delete
    fun deleteCar(car: Health)

    @Query("DELETE FROM health")
    fun deleteAll()

}