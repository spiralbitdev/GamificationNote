package spiral.bit.dev.gamificationnote.data.dto.hero

data class Hero(
    val nickName: String,
    val health: Int = 100,
    val progress: Long,
    val money: Long,
    val crystals: Long
)
