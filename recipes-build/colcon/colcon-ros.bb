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
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=993ff28185bc99b008231dd1d31f2eaf"



RDEPENDS_${PN} = "docutils"

PV = "0.3.10"

inherit pypi setuptools3
SRC_URI[md5sum] = "442a731ad4a9f5dbbc76d2df282e0c2c"

PYPI_PACKAGE = "colcon-ros"


BBCLASSEXTEND = "native"
