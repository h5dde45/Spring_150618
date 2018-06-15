package ru.project.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.project.model.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer> {
}
