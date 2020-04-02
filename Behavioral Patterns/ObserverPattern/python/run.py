#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Apr  2 19:44:49 2020

@author: adam
"""
from base import Observer, Observable

class Subject(Observable):
    """
    This is oberservable implementer
    """
    
    def __init__(self):
        super().__init__()
        print("subject init...")
        
    def changeState(self, info):
        """
        Change state and notify observer

        Returns
        -------
        None.

        """
        print("change state and notify observer")
        super().notify(info)
        
class Observer1(Observer):
    """
    This is observer 1
    """

    def __init__(self):
        print("observer 1 initial...")

    def update(self, observerable, object):
        """
        update from observerable notify

        Parameters
        ----------
        observerable : TYPE
            DESCRIPTION.
        object : TYPE
            DESCRIPTION.

        Returns
        -------
        None.

        """
        print(f'observer 1: update from observable notify: {object}')
                
class Observer2(Observer):
    """
    This is observer 1
    """

    def __init__(self):
        print("observer 2 initial...")

    def update(self, observerable, object):
        """
        update from observerable notify

        Parameters
        ----------
        observerable : TYPE
            DESCRIPTION.
        object : TYPE
            DESCRIPTION.

        Returns
        -------
        None.

        """
        print(f'observer 2: update from observable notify: {object}')
                

def run():
    subject = Subject()
    observer1 = Observer1()
    observer2 = Observer2()
    
    subject.addObserver(observer1)
    subject.addObserver(observer2)
    
    subject.changeState("change subject state!!!")
    
    
if __name__ == "__main__":
    run()
    