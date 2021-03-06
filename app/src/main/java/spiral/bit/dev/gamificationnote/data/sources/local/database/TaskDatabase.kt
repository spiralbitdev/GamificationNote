package spiral.bit.dev.gamificationnote.data.sources.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import spiral.bit.dev.gamificationnote.data.sources.local.dao.tasks.*
import spiral.bit.dev.gamificationnote.data.sources.local.dao.tasks.inFolder.InFolderCompositeSubTaskDao
import spiral.bit.dev.gamificationnote.data.sources.local.dao.tasks.inFolder.InFolderCompositeTaskDao
import spiral.bit.dev.gamificationnote.data.sources.local.dao.tasks.inFolder.InFolderRepeatingTaskDao
import spiral.bit.dev.gamificationnote.data.sources.local.dao.tasks.inFolder.InFolderSimpleTaskDao
import spiral.bit.dev.gamificationnote.data.sources.local.entities.tasks.CompositeSubTaskEntity
import spiral.bit.dev.gamificationnote.data.sources.local.entities.tasks.CompositeTaskEntity
import spiral.bit.dev.gamificationnote.data.sources.local.entities.tasks.RepeatingTaskEntity
import spiral.bit.dev.gamificationnote.data.sources.local.entities.tasks.SimpleTaskEntity
import spiral.bit.dev.gamificationnote.data.sources.local.entities.tasks.inFolder.*

@Database(
    entities = [
        SimpleTaskEntity::class,
        RepeatingTaskEntity::class,
        CompositeTaskEntity::class,
        CompositeSubTaskEntity::class,
        InFolderSimpleTaskEntity::class,
        InFolderRepeatingTaskEntity::class,
        InFolderCompositeTaskEntity::class,
        InFolderCompositeSubTaskEntity::class,
        FolderEntity::class
    ], version = 1, exportSchema = false
)
abstract class TaskDatabase : RoomDatabase() {
    abstract fun simpleTaskDao(): SimpleTaskDao
    abstract fun repeatingTaskDao(): RepeatingTaskDao
    abstract fun compositeTaskDao(): CompositeTaskDao
    abstract fun compositeSubTaskDao(): CompositeSubTaskDao

    abstract fun folderDao(): FolderDao
    abstract fun inFolderSimpleTaskDao(): InFolderSimpleTaskDao
    abstract fun inFolderRepeatingTaskDao(): InFolderRepeatingTaskDao
    abstract fun inFolderCompositeTaskDao(): InFolderCompositeTaskDao
    abstract fun inFolderCompositeSubTaskDao(): InFolderCompositeSubTaskDao
}