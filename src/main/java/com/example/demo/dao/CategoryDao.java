package com.example.demo.dao;

import com.example.demo.model.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CategoryDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Category findOne(final String id) {
        return (Category) getCurrentSession().get(Category.class, id);
    }

    public List<Category> findAll() {
        return getCurrentSession()
                .createQuery("from " + Category.class.getName()).list();
    }

    public void save(final Category entity) {
        getCurrentSession().persist(entity);
    }

    public Category update(final Category entity) {
        return (Category) getCurrentSession().merge(entity);
    }

    public void delete(final Category entity) {
        getCurrentSession().delete(entity);
    }

    public void deleteById(final String id) {
        final Category entity = findOne(id);
        delete(entity);
    }

    protected final Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
}
