package org.hswebframework.web.organizational.authorization.simple;

import org.hswebframework.web.organizational.authorization.Personnel;
import org.hswebframework.web.organizational.authorization.PersonnelAuthorization;
import org.hswebframework.web.organizational.authorization.TreeNode;

import java.util.Collections;
import java.util.Set;

/**
 * TODO 完成注释
 *
 * @author zhouhao
 */
public class SimplePersonnelAuthorization implements PersonnelAuthorization {
    private Personnel             personnel;
    private Set<TreeNode<String>> areaIds;
    private Set<TreeNode<String>> orgIds;
    private Set<TreeNode<String>> positionIds;
    private Set<TreeNode<String>> departmentIds;

    @Override
    public Personnel getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Personnel personnel) {
        this.personnel = personnel;
    }

    @Override
    public Set<TreeNode<String>> getAreaIds() {
        if (areaIds == null) areaIds = Collections.emptySet();
        return areaIds;
    }

    public void setAreaIds(Set<TreeNode<String>> areaIds) {
        this.areaIds = areaIds;
    }

    @Override
    public Set<TreeNode<String>> getOrgIds() {
        if (orgIds == null) orgIds = Collections.emptySet();
        return orgIds;
    }

    public void setOrgIds(Set<TreeNode<String>> orgIds) {
        this.orgIds = orgIds;
    }

    @Override
    public Set<TreeNode<String>> getPositionIds() {
        if (positionIds == null) positionIds = Collections.emptySet();
        return positionIds;
    }

    public void setPositionIds(Set<TreeNode<String>> positionIds) {
        this.positionIds = positionIds;
    }

    @Override
    public Set<TreeNode<String>> getDepartmentIds() {
        if (departmentIds == null) departmentIds = Collections.emptySet();
        return departmentIds;
    }

    public void setDepartmentIds(Set<TreeNode<String>> departmentIds) {
        this.departmentIds = departmentIds;
    }
}
