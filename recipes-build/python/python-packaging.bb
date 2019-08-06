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

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.APACHE;md5=a832eda17114b48ae16cda6a500941c2"



PV = "19.0"

inherit pypi setuptools3
SRC_URI[md5sum] = "dd118dc389f8e90840d44240292bf3d9"

PYPI_PACKAGE = "packaging"


BBCLASSEXTEND = "native"
