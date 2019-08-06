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
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=8edd8c3068954e1b9c2bb3856dc51265"


PV = "0.2.2"

inherit pypi setuptools3
SRC_URI[md5sum] = "7929f632f4829cf6dbf2d993d4b252fd"
PYPI_PACKAGE = "colcon-metadata"


BBCLASSEXTEND = "native"
