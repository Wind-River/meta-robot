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

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a33f38bbf47d48c70fe0d40e5f77498e"


PV = "0.5.1"

inherit pypi setuptools3
SRC_URI[md5sum] = "45286cd2f2e0c3423b4e18a863d3b84d"

PYPI_PACKAGE = "zipp"
DEPENDS = " python3 python3-setuptools-native python3-setuptools-scm-native "


BBCLASSEXTEND = "native"
