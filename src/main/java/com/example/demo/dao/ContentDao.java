package com.example.demo.dao;

import com.example.demo.model.Content;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ContentDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Content findOne(final String id) {
        return (Content) getCurrentSession().get(Content.class, id);
    }

    public List<Content> findAll() {
        return getCurrentSession()
                .createQuery("from " + Content.class.getName()).list();
    }

    public void save(final Content entity) {
        getCurrentSession().persist(entity);
    }

    public Content update(final Content entity) {
        return (Content) getCurrentSession().merge(entity);
    }

    public void delete(final Content entity) {
        getCurrentSession().delete(entity);
    }

    public void deleteById(final String id) {
        final Content entity = findOne(id);
        delete(entity);
    }

    protected final Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
}
