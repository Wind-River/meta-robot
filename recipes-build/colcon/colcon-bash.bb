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
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=e8b1d7d7b143a598c8229299a9dbb1a7"

PV = "0.3.2"

inherit pypi setuptools3
SRC_URI[md5sum] = "4ca101dad3c32362b00eed63c6c2d6c6"

PYPI_PACKAGE = "colcon-bash"


BBCLASSEXTEND = "native"
