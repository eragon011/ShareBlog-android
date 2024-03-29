package th.ac.up.ict.se.dump.shareblog.domain.repository;

import java.util.Iterator;
import java.util.List;

import th.ac.up.ict.se.dump.shareblog.domain.dao.BlogDao;
import th.ac.up.ict.se.dump.shareblog.domain.model.Blog;
import th.ac.up.ict.se.dump.shareblog.domain.model.Comment;
import th.ac.up.ict.se.dump.shareblog.domain.service.BlogService;

/**
 * Created by 56023 on 10/5/2559.
 */
public class BlogServiceWebImpl implements BlogService {

    private BlogDao blogDao = BlogDaoWebImpl.instance();
    private static BlogService instance;

    private BlogServiceWebImpl(){}

    public static BlogService instance() {
        if (instance == null) {
            instance = new BlogServiceWebImpl();
        }
        return instance;
    }

    @Override
    public Iterator<Blog> getBlogs() {
        return blogDao.getBlogs();
    }

    @Override
    public Iterator<Comment> getComments(Blog blog) {
        return blogDao.getComments(blog);
    }

    @Override
    public Blog findById(Long id) {
        return blogDao.findById(id);
    }

    @Override
    public Blog save(Blog blog) {
        return blogDao.save(blog);
    }

    @Override
    public Blog update(Blog blog) {
        return blogDao.update(blog);
    }

    @Override
    public void delete(Blog blog) {
        blogDao.delete(blog);
    }
}
