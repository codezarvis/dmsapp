/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmsapp.service.impl;

import com.dmsapp.domain.sub.TypeOne;
import com.dmsapp.domain.sub.TypeTwo;
import com.dmsapp.domain.sub.UpdateObject;
import com.dmsapp.service.UpdateMarksService;
import com.dmsapp.utils.hibernate.HibernateUtils;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Sudarsan
 */
public class UpdateMarksServiceImpl extends ServiceImpl implements UpdateMarksService {

    private static Logger LOG = Logger.getLogger(UpdateMarksServiceImpl.class);
    private static UpdateMarksServiceImpl updateMarksServiceImpl = new UpdateMarksServiceImpl();

    private UpdateMarksServiceImpl() {
    }

    public static UpdateMarksService getInstance() {
        return updateMarksServiceImpl;
    }

    public UpdateObject findByStudentId(String studentId, String branch, String year, Integer semister, String paper, String internalType) {

        LOG.debug(studentId + " " + year + " " + branch + " " + " " + semister + " " + paper + " " + internalType);
        TypeOne typeOne = null;
        TypeTwo typeTwo = null;
        UpdateObject updateObject = null;
        Session session = HibernateUtils.currentSession();
        try {

            if ("1".equalsIgnoreCase(internalType)) {
                LOG.debug("In One");
                Query query = session.createQuery("from TypeOne typeOne where typeOne.studentId=:studentId and typeOne.year=:year and typeOne.branch=:branch and typeOne.semister=:semister and typeOne.paper=:paper and typeOne.internalType=:internalType");
                query.setParameter("studentId", studentId);
                query.setParameter("year", year);
                query.setParameter("branch", branch);
                query.setParameter("semister", new Integer(semister));
                query.setParameter("paper", paper);
                query.setParameter("internalType", internalType);

                typeOne = (TypeOne) query.uniqueResult();

                if (typeOne != null) {
                    LOG.debug("Type One : " + typeOne);
                    updateObject = new UpdateObject();
                    updateObject.setId(typeOne.getId());
                    updateObject.setStudentId(typeOne.getStudentId());
                    updateObject.setFirstName(typeOne.getFirstName());
                    updateObject.setSurName(typeOne.getSurName());
                    updateObject.setYear(typeOne.getYear());
                    updateObject.setBranch(typeOne.getBranch());
                    updateObject.setSemister(String.valueOf(typeOne.getSemister()));
                    updateObject.setInternalType(typeOne.getInternalType());
                    updateObject.setPaper(typeOne.getPaper());
                    updateObject.setMarks(typeOne.getInterOneMarks());
                    updateObject.setAssignmentMarks(typeOne.getAssignmentMarks());
                    updateObject.setActive(typeOne.getActive());
                }


            } else if ("2".equalsIgnoreCase(internalType)) {
                LOG.debug("In Two");
                Query query = session.createQuery("from TypeTwo typeTwo where typeTwo.studentId=:studentId and typeTwo.branch=:branch and typeTwo.year=:year and typeTwo.semister=:semister and typeTwo.paper=:paper and typeTwo.internalType=:internalType");
                query.setParameter("studentId", studentId);
                query.setParameter("branch", branch);
                query.setParameter("year", year);
                query.setParameter("semister", new Integer(semister));
                query.setParameter("paper", paper);
                query.setParameter("internalType", internalType);

                typeTwo = (TypeTwo) query.uniqueResult();

                if (typeTwo != null) {
                    updateObject = new UpdateObject();
                    updateObject.setId(typeTwo.getId());
                    updateObject.setStudentId(typeTwo.getStudentId());
                    updateObject.setFirstName(typeTwo.getFirstName());
                    updateObject.setSurName(typeTwo.getSurName());
                    updateObject.setYear(typeTwo.getYear());
                    updateObject.setBranch(typeTwo.getBranch());
                    updateObject.setSemister(String.valueOf(typeTwo.getSemister()));
                    updateObject.setInternalType(typeTwo.getInternalType());
                    updateObject.setPaper(typeTwo.getPaper());
                    updateObject.setMarks(typeTwo.getInterTwoMarks());
                    updateObject.setAssignmentMarks(typeTwo.getAssignmentMarks());
                    updateObject.setAttendanceMarks(typeTwo.getAttendanceMarks());
                    updateObject.setActive(typeTwo.getActive());
                }

            }

        } catch (Exception exception) {
            LOG.debug("UpdateMarksServiceImpl", exception);
        } finally {
            HibernateUtils.closeSession();
        }
        return updateObject;
    }
}
