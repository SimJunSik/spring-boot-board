package com.board.springbootboard.repository;

import com.board.springbootboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}