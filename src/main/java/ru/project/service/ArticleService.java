package ru.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.project.dao.ArticleRepository;
import ru.project.model.Article;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository repository;

    public void save(Article article) {
        repository.save(article);
    }

    public List<Article> getAll() {
        return StreamSupport
                .stream(Spliterators.spliteratorUnknownSize(
                        repository.findAll().iterator(),
                        Spliterator.NONNULL),false)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
