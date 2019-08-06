# Copyright (c) 2019 Wind River Systems, Inc. 
# Licensed under the Apache License, Version 2.0 (the "License"); 
# you may not use this file except in compliance with the License. 
# You may obtain a copy of the License at: 
#       http://www.apache.org/licenses/LICENSE-2.0 
# Unless required by applicable law or agreed to in writing, software  distributed 
# under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES 
# OR CONDITIONS OF ANY KIND, either express or implied.

DESCRIPTION = "Google Test Library"
SECTION = "turtlebot3_ws"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cbbd27594afd089daa160d3a16dd515a"
SRC_URI = "git://github.com/ament/googletest.git;branch=crystal"

SRCREV = "8d97cc0bbe8a67743d48594c18c1ce5a40f16bb9"
inherit cmake
SRC_URI[md5sum] = "ffccaed9330787c7442b453f6520a474"

S = "${WORKDIR}/git/googletest"
FILES_${PN} += " /usr/* "

BBCLASSEXTEND = "native"
