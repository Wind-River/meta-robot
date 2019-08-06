# Copyright (c) 2019 Wind River Systems, Inc. 
# Licensed under the Apache License, Version 2.0 (the "License"); 
# you may not use this file except in compliance with the License. 
# You may obtain a copy of the License at: 
#       http://www.apache.org/licenses/LICENSE-2.0 
# Unless required by applicable law or agreed to in writing, software  distributed 
# under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES 
# OR CONDITIONS OF ANY KIND, either express or implied.

LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://PKG-INFO;md5=dd15b942d7f8b49a92d87a642707876f"
DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"


RDEPENDS_${PN} += " python-latestdateutil python3-pytest-runner python3-distutils python3-empy python-latestpytest coverage distlib docutils notify2 pytest-cov pytest-repeat pytest-rerunfailures python-dateutil colcon-pkg-config"

PV = "0.3.22"

inherit pypi setuptools3
SRC_URI[md5sum] = "3cd13803c6c4629baf301cc0c665d69d"

PYPI_PACKAGE = "colcon-core"


BBCLASSEXTEND = "native"
