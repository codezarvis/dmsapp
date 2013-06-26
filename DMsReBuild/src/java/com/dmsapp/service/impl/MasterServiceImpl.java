/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dmsapp.service.impl;

import com.dmsapp.domain.sub.Master;
import com.dmsapp.service.MasterService;
import com.dmsapp.utils.hibernate.HibernateUtils;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Sudarsan
 */
public class MasterServiceImpl extends ServiceImpl implements MasterService{

    private static Logger LOG = Logger.getLogger(MasterServiceImpl.class);
    private static MasterServiceImpl masterServiceImpl = new MasterServiceImpl();

    private MasterServiceImpl() {
        // SingleTon
    }

    public static MasterService getInstance() {
        return masterServiceImpl;
    }
    public List<Master> findBy(String year, String branch, Integer semister) {

        Session session = HibernateUtils.currentSession();
        List<Master> masterList = null;
        try {
            Query query = session.createQuery("from Master master where master.year=:year and master.branch=:branch and master.semister=:semister");
            query.setParameter("year", year.trim());
            query.setParameter("branch", branch.trim());
            query.setParameter("semister", semister);
            masterList = query.list();
        }catch(Exception exception) {
            LOG.warn("MasterServiceImpl", exception);
        }finally{
            HibernateUtils.closeSession();
        }

        return masterList;
    }

    public List<Master> getAll() {
        List<Master> masterList = null;
        Session session = HibernateUtils.currentSession();
        try {
            Query query =  session.createQuery("from Master master");
            masterList = query.list();
        }catch(Exception exception) {
            LOG.warn("MasterServiceImpl", exception);
        }finally {
            HibernateUtils.closeSession();
        }

        return masterList;
    }


    public Master findByPaperName(String paper, String year, String branch, String sem) {
        LOG.debug("Paper Name : "+paper+"Year : "+year+"Sem : "+sem);
        Master master = null;
        Session session = HibernateUtils.currentSession();
        try {
            Query query = session.createQuery("from Master master where master.paper=:paper and master.year=:year and master.branch=:branch and master.semister=:semister");
            query.setParameter("paper", paper.trim());
            query.setParameter("year", year.trim());
            query.setParameter("branch", branch);
            query.setParameter("semister", new Integer(sem));
            master =(Master) query.uniqueResult();
        }catch(Exception exception){
            LOG.debug("MasterServiceImpl",exception);
        }finally {
            HibernateUtils.closeSession();
        }

        return master;
    }


}
