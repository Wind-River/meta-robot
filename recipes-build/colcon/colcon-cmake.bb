# Copyright (c) 2019 Wind River Systems, Inc. 
# Licensed under the Apache License, Version 2.0 (the "License"); 
# you may not use this file except in compliance with the License. 
# You may obtain a copy of the License at: 
#       http://www.apache.org/licenses/LICENSE-2.0 
# Unless required by applicable law or agreed to in writing, software  distributed 
# under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES 
# OR CONDITIONS OF ANY KIND, either express or implied.

LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://PKG-INFO;md5=8fcfaa7873e92a1d6a25dde14180c544"

DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

PV = "0.2.11"

inherit pypi setuptools3
SRC_URI[md5sum] = "81a3b97066c259197db8dabb4b7a8292"
PYPI_PACKAGE = "colcon-cmake"



BBCLASSEXTEND = "native"
