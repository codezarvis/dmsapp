/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dmsapp.web.controller;

import com.dmsapp.domain.sub.MarksMaster;
import com.dmsapp.utils.service.ServiceUtils;
import com.dmsapp.web.forms.MarksMasterForm;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Sudarsan
 */
@Controller
@RequestMapping("/doPost")
public class DoPostController {

    private static Logger LOG = Logger.getLogger(DoPostController.class);
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String doPostForm(MarksMasterForm marksMasterForm) {
        LOG.debug(marksMasterForm);

        String response = null;

        MarksMaster marksMaster = new MarksMaster();
        marksMaster.setYear(marksMasterForm.getYear());
        marksMaster.setBranch(marksMasterForm.getBranch());
        marksMaster.setSemister(Integer.parseInt(marksMasterForm.getSemister()));
        marksMaster.setPaper(marksMasterForm.getPaper());
        marksMaster.setStudentId(marksMasterForm.getStudentId());
        marksMaster.setInternalOne(marksMasterForm.getInternalOne());
        marksMaster.setInternalTwo(marksMasterForm.getInternalTwo());

        marksMaster.setAssignmentMarks(marksMasterForm.getAssignmentMarks());
        marksMaster.setAttendanceMarks(marksMasterForm.getAttendanceMarks());
        marksMaster.setActive(1);


        



        ServiceUtils.getMarksMasterService().create(marksMaster);

        response = "Marks Posted !";
        return response;
    }
}
