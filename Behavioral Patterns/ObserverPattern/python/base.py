#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Apr  2 19:19:12 2020

@author: adam
"""
from abc import ABCMeta, abstractmethod

class Observer(metaclass=ABCMeta):
    """
    observer interface
    """
    
    @abstractmethod
    def update(self, observerable, object):
        pass
    
class Observable(metaclass=ABCMeta):
    """
    Observable abstract class
    """
    
    def __init__(self):
        """
        initial observer list

        Returns
        -------
        None.

        """
        self.__observers=[]
        
    def addObserver(self, observer):
        """
        add observer in list

        Parameters
        ----------
        observer : TYPE
            DESCRIPTION.

        Returns
        -------
        None.

        """
        self.__observers.append(observer)
        
    def removeObserver(self, observer):
        """
        remove observer from list

        Parameters
        ----------
        observer : TYPE
            DESCRIPTION.

        Returns
        -------
        None.

        """
        self.__observers.remove(observer)
        
    def notify(self, object=0):
        """
        notify oberverable

        Parameters
        ----------
        object : TYPE, optional
            DESCRIPTION. The default is 0.

        Returns
        -------
        None.

        """
        for obs in self.__observers:
            obs.update(self, object)
        
    
    