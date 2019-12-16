package com.codegym.music_backend.service.impl;

import com.codegym.music_backend.model.Song;
import com.codegym.music_backend.repository.SongRepository;
import com.codegym.music_backend.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongServiceImpl implements ISongService {
    @Autowired
    SongRepository songRepository;
    @Override
    public List<Song> findAllByOrderByLikeSong() {
        return songRepository.findAllByOrderByLikeSongDesc();
    }

    @Override
    public List<Song> findAllByOrderByListenSong() {
        return songRepository.findAllByOrderByListenSongDesc();
    }

    @Override
    public List<Song> findAllByUserId(Long userId) {
        return findAllByUserId(userId);
    }

    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public Optional<Song> findById(Long id) {
        return songRepository.findById(id);
    }

    @Override
    public void delete(long id) {
        songRepository.deleteById(id);

    }

    @Override
    public Optional<Song> findByNameSong(String song_name) {
        return songRepository.findByNameSongContaining(song_name);
    }

    @Override
    public Song save(Song song) {
        return songRepository.save(song);
    }
}
