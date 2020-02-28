package co.lucaspinazzola.example.domain.interactor.gif

import co.lucaspinazzola.example.domain.model.Gif
import co.lucaspinazzola.example.domain.repo.GiphyRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.flow.collect

class GetGifsAndListenForUpdatesUseCase(private val giphyRepository: GiphyRepository) {

    fun execute(query: String) : Flow<List<Gif>> = channelFlow {
        send(giphyRepository.getGifs())
        giphyRepository.listenForGifUpdates {
            giphyRepository.updateGifs(query, 0)
        }.collect { gifs ->
            send(gifs)
        }
    }

}