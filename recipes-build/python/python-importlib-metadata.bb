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
LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"


PV = "0.17"

inherit pypi setuptools3
SRC_URI += " file://add-version-to-setup-cfg.patch;md5=4cc764df5f975a9e37b93f2e7947a0b4"
SRC_URI[md5sum] = "dda7b351e8fa12e169ce0b67bfe0be05"

PYPI_PACKAGE = "importlib_metadata"

RDEPENDS_${PN} += " python-zipp "

BBCLASSEXTEND = "native"
