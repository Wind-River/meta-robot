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
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=083c87d2f80f5d765bc4b1b36be38027"

RDEPENDS_${PN} += " python3-pytest-runner python3-distutils python3-empy python-latestpytest argcomplete coverage distlib docutils notify2 pytest-cov pytest-repeat pytest-rerunfailures python-dateutil colcon-pkg-config"

PV = "0.1.0"

inherit pypi setuptools3
SRC_URI[md5sum] = "cd27e96d55a3d00f897fd6c5c323979e"
PYPI_PACKAGE = "colcon-pkg-config"


BBCLASSEXTEND = "native"
