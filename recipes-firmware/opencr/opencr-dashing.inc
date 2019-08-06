# Copyright (c) 2019 Wind River Systems, Inc. 
# Licensed under the Apache License, Version 2.0 (the "License"); 
# you may not use this file except in compliance with the License. 
# You may obtain a copy of the License at: 
#       http://www.apache.org/licenses/LICENSE-2.0 
# Unless required by applicable law or agreed to in writing, software  distributed 
# under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES 
# OR CONDITIONS OF ANY KIND, either express or implied.

DESCRIPTION = "Turtlebot3 OpenCR Firware"
SECTION = "turtlebot3"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

PACKAGES = "${PN}"

RDEPENDS_${PN} += " glibc bash "
SRCREV = "${AUTOREV}"
#PV = "1.1+gitr${SRCPV}"

SRC_URI = "https://github.com/ROBOTIS-GIT/turtlebot3/raw/ros2/turtlebot3_sbc_settings/${ROS_DISTRO}/tb3_sbc_settings.tar.bz2;name=${ROS_DISTRO}opencr \
  https://raw.githubusercontent.com/ROBOTIS-GIT/turtlebot3/master/turtlebot3_bringup/99-turtlebot3-cdc.rules;name=t3rules \
  https://raw.githubusercontent.com/ROBOTIS-GIT/OpenCR/master/99-opencr-cdc.rules;name=opencrrules \
  "
SRC_URI[dashingopencr.md5sum] = "26304f9ba0e5a71609cb0d33ac2d6ec4"
SRC_URI[crystalopencr.md5sum] = "f3ca4860630c38a7aa970ee18c2b50e0"
SRC_URI[t3rules.md5sum] = "8de86ae7ba79a893cb5ce841c3eadd2d"
SRC_URI[opencrrules.md5sum] = "8de86ae7ba79a893cb5ce841c3eadd2d"

do_install(){
  bbnote "Libdir is ${libdir}"
  echo "libdir is ${libdir}"
  echo "baselib is ${BASE_LIB}"
  install -d ${D}${base_prefix}/etc/udev/rules.d
  install -d ${D}${base_prefix}
  cp -r ${WORKDIR}/tb3_sbc_settings/opencr_update ${D}${base_prefix}/opencr_update          
  install -m 0755 ${WORKDIR}/99-turtlebot3-cdc.rules ${D}${base_prefix}/etc/udev/rules.d/
  install -m 0755 ${WORKDIR}/99-opencr-cdc.rules ${D}${base_prefix}/etc/udev/rules.d/
}


INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

OPENCR_ARCH ?= "arm"

FILES_${PN} += " ${base_prefix}/etc/udev/rules.d/* "
FILES_${PN} += " ${base_prefix}/opencr_update/update.sh "
FILES_${PN} += " ${base_prefix}/opencr_update/burger.opencr "

FILES_${PN} += " ${base_prefix}/opencr_update/opencr_ld_shell_${OPENCR_ARCH} "

FILES_${PN} += " ${base_prefix}/opencr_update/burger_ros2.OpenCR.bin "

#SRC_URI[sha256sum] = "5571f2d3d946549c50d6c64119eb113527cdc2e64264ef9cbd62f9684c790e32"
S = "${WORKDIR}"


BBCLASSEXTEND = "native"
