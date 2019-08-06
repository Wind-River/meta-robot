# Copyright (c) 2019 Wind River Systems, Inc. 
# Licensed under the Apache License, Version 2.0 (the "License"); 
# you may not use this file except in compliance with the License. 
# You may obtain a copy of the License at: 
#       http://www.apache.org/licenses/LICENSE-2.0 
# Unless required by applicable law or agreed to in writing, software  distributed 
# under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES 
# OR CONDITIONS OF ANY KIND, either express or implied.

DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a0bb0f2949a8babbc1df9a81a569b25"



PV = "0.8.0"

inherit pypi setuptools3
SRC_URI[md5sum] = "8301c6be12215654bdbd635b53e72d78"
PYPI_PACKAGE = "pytest-repeat"
DEPENDS += " python-latestpytest python3-setuptools-native python3-setuptools-scm-native"



BBCLASSEXTEND = "native"
