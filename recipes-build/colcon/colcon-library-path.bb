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
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=b94a16e5f4e95aa9867f896ab2d41dbd"


PV = "0.2.1"

inherit pypi setuptools3
SRC_URI[md5sum] = "b9a08b6e6246a1db17f2d1b9dccc571b"

PYPI_PACKAGE = "colcon-library-path"



BBCLASSEXTEND = "native"
