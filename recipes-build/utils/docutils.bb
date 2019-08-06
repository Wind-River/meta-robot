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

LICENSE = "PD"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=35a23d42b615470583563132872c97d6"


PV = "0.14"

inherit pypi setuptools3
SRC_URI[md5sum] = "c53768d63db3873b7d452833553469de"
PYPI_PACKAGE = "docutils"

do_configure_prepend(){
  touch ${S}/tools/editors/emacs
  rm -r ${S}/tools/editors/emacs
  bbwarn "removing emacs script"
}


BBCLASSEXTEND = "native"
