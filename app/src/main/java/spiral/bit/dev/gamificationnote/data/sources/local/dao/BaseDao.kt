package spiral.bit.dev.gamificationnote.data.sources.local.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update

interface BaseDao<T> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(obj: T)

    @Delete
    suspend fun delete(obj: T)

    @Update
    suspend fun update(obj: T)
}