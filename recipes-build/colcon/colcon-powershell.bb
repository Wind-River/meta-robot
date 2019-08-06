# Copyright (c) 2019 Wind River Systems, Inc. 
# Licensed under the Apache License, Version 2.0 (the "License"); 
# you may not use this file except in compliance with the License. 
# You may obtain a copy of the License at: 
#       http://www.apache.org/licenses/LICENSE-2.0 
# Unless required by applicable law or agreed to in writing, software  distributed 
# under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES 
# OR CONDITIONS OF ANY KIND, either express or implied.DESCRIPTION = "Colcon Build Tool"

SECTION = "turtlebot3_ws"



PV = "0.3.4"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=42e9ebd2c3361763db6b182d8629f6f1"

inherit pypi setuptools3
SRC_URI[md5sum] = "7ba604decd6bd0eb88b3a07b4562534b"

PYPI_PACKAGE = "colcon-powershell"


BBCLASSEXTEND = "native"
