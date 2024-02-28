package com.example.musicapp

import androidx.annotation.DrawableRes

data class Lib(@DrawableRes val icon:Int, val name:String)

val libraries = listOf<Lib>(
    Lib(R.drawable.baseline_playlist_play_24, "Playlist"),
    Lib(R.drawable.baseline_mic_24, "Artists"),
    Lib(R.drawable.baseline_album_24,"Album"),
    Lib(R.drawable.library_music_24, "Songs"),
    Lib(R.drawable.baseline_swap_horiz_24, "Genre")
)