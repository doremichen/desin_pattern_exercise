#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Apr  9 20:36:03 2020

@author: adam
"""
from abc import ABCMeta, abstractmethod

class State:
    """
    base state 
    """
    
    def __init__(self, name):
        self._name = name
        
    def getName(self):
        return self._name
    
    def isMatch(self, value):
        """
        default false

        Returns
        -------
        None.

        """
        return False
    
    @abstractmethod
    def behavior(self, context):
        pass


class Context(metaclass=ABCMeta):
    """
    Manager state
    """
    def __init__(self):
        self._states = []
        self._currState = None
        self._stateInfo = 0
        
    def addState(self, state):
        # chaeck state
        if (state not in self._states):
            self._states.append(state)
            
    def changeState(self, state):
        # check state validity
        if (state is None):
            return False
        # check state info
        if (self._currState is None):
            print("initial state: ", state.getName())
        else:
            print("From state: ", self._currState.getName(), "to ", state.getName())
            
        self._currState = state
        self.addState(state)
        
    def getState(self):
        return self._currState
    
    def _setStateinfo(self, info):
        self._stateInfo = info
        # look up state
        for state in self._states:
            if (state.isMatch(info)):
                self.changeState(state)
            
    def _getStateinfo(self):
        return self._stateInfo

# singleton
def singleton(cls, *args, **kwargs):
    instance = {}
    def _singleton(*args, **kwargs):
        if cls not in instance:
            instance[cls] = cls(*args, **kwargs)
        return instance[cls]
    
    return _singleton


# state1
@singleton
class State1(State):
    def __init__(self, name):
        super().__init__(name)
        
    def isMatch(self, value):
        return value < 0
    
    def behavior(self, context):
        print("State1: ", context._getStateinfo())
        
# state2
@singleton
class State2(State):
    def __init__(self, name):
        super().__init__(name)
        
    def isMatch(self, value):
        return value >= 0 and value < 50
    
    def behavior(self, context):
        print("State2: ", context._getStateinfo())
        
# state3
@singleton
class State3(State):
    def __init__(self, name):
        super().__init__(name)
        
    def isMatch(self, value):
        return value >= 50 and value < 100
    
    def behavior(self, context):
        print("State3: ", context._getStateinfo())
        
# state manaer
class Manager(Context):
    def __init__(self):
        super().__init__()
        # add state
        self.addState(State1("state one..."))
        self.addState(State2("state two..."))
        self.addState(State3("state three..."))
        self._setStateinfo(64)
        
    def setValue(self, value):
        self._setStateinfo(value)
        
    def getValue(self):
        return self._getStateinfo()
    
    def incValue(self, step):
        self._setStateinfo(self._getStateinfo() + step)
        
    def decValue(self, step):
        self._setStateinfo(self._getStateinfo() - step)
        
    def behavior(self):
        state = self.getState()
        
        if isinstance(state, State):
            state.behavior(self)
        
# run
def run():
    manager = Manager()
    manager.behavior()
    # set value at first time
    manager.setValue(-3)
    manager.behavior()
    manager.incValue(64)
    manager.behavior()
    manager.decValue(50)
    manager.behavior()
    
if __name__ == '__main__':
    run()    
    
    
        
        
    
        
        
