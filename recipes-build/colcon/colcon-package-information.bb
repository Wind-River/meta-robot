# Copyright (c) 2019 Wind River Systems, Inc. 
# Licensed under the Apache License, Version 2.0 (the "License"); 
# you may not use this file except in compliance with the License. 
# You may obtain a copy of the License at: 
#       http://www.apache.org/licenses/LICENSE-2.0 
# Unless required by applicable law or agreed to in writing, software  distributed 
# under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES 
# OR CONDITIONS OF ANY KIND, either express or implied.DESCRIPTION = "Colcon Build Tool"

SECTION = "turtlebot3_ws"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=f77dc77081dfcba19fb0cd25e90e7c3e"


PV = "0.2.2"

inherit pypi setuptools3
SRC_URI[md5sum] = "a0b7df616e331a0701975c0ba197e5fe"

PYPI_PACKAGE = "colcon-package-information"


BBCLASSEXTEND = "native"
