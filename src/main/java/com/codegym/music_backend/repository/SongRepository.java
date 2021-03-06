package com.codegym.music_backend.repository;

import com.codegym.music_backend.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    List<Song> findAllByUserId(Long userId);
    Optional<Song> findByNameSongContaining(String song);
    List<Song> findAllByOrderByLikeSongDesc();
    List<Song> findAllByOrderByListenSongDesc();
}
