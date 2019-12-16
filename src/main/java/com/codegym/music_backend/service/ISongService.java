package com.codegym.music_backend.service;

import com.codegym.music_backend.model.Song;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface ISongService {
    List<Song> findAllByOrderByLikeSong();

    List<Song> findAllByOrderByListenSong();

    List<Song> findAllByUserId(Long userId);

    List<Song> findAll();

    Optional<Song> findById(Long id);

    void delete(long id);

    Optional<Song> findByNameSong(String song_name);

    Song save(Song song);

}
