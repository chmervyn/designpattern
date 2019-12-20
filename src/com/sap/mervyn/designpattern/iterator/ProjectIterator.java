package com.sap.mervyn.designpattern.iterator;

import java.util.List;

public class ProjectIterator implements IProjectIterator {
    private final List<IProject> projectList;
    private int currentItem = 0;

    public ProjectIterator(List<IProject> projectList) {
        this.projectList = projectList;
    }

    @Override
    public boolean hasNext() {
        if (this.currentItem >= projectList.size() || this.projectList.get(currentItem) == null) {
            return false;
        }

        return true;
    }

    @Override
    public IProject next() {
        return this.projectList.get(this.currentItem++);
    }

    @Override
    public void remove() {
        this.projectList.remove(currentItem--);
    }
}
