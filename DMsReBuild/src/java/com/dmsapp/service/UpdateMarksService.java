/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dmsapp.service;

import com.dmsapp.domain.sub.UpdateObject;

/**
 *
 * @author Sudarsan
 */
public interface UpdateMarksService extends Service{

    UpdateObject findByStudentId(String studentId, String branch, String year, Integer semister, String papaer, String type);
}
