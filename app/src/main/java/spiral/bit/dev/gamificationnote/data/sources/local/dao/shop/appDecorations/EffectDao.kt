package spiral.bit.dev.gamificationnote.data.sources.local.dao.shop.appDecorations

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import spiral.bit.dev.gamificationnote.data.sources.local.dao.BaseDao
import spiral.bit.dev.gamificationnote.data.sources.local.entities.shop.appDecorations.EffectEntity

@Dao
interface EffectDao : BaseDao<EffectEntity> {

    @Query("SELECT * FROM effects WHERE isAlreadyBought = :isFromInventory")
    fun getEffects(isFromInventory: Boolean): Flow<List<EffectEntity>>
}
