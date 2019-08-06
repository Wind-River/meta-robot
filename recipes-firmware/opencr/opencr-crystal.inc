
DESCRIPTION = "Turtlebot3 OpenCR Firware"
SECTION = "turtlebot3"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

PACKAGES = "${PN}"

RDEPENDS_${PN} += " glibc bash "
SRCREV = "${AUTOREV}"
#PV = "1.1+gitr${SRCPV}"

SRC_URI = "https://github.com/ROBOTIS-GIT/OpenCR_Binaries/raw/master/turtlebot3/ROS2/latest/opencr_update.tar.bz2;name=opencr \
  https://raw.githubusercontent.com/ROBOTIS-GIT/turtlebot3/master/turtlebot3_bringup/99-turtlebot3-cdc.rules;name=t3rules \
  https://raw.githubusercontent.com/ROBOTIS-GIT/OpenCR/master/99-opencr-cdc.rules;name=opencrrules \
  "
SRC_URI[opencr.md5sum] = "71e9e0b609dfa6720b58df52f090e328"
SRC_URI[t3rules.md5sum] = "8de86ae7ba79a893cb5ce841c3eadd2d"
SRC_URI[opencrrules.md5sum] = "8de86ae7ba79a893cb5ce841c3eadd2d"

do_install(){
  bbnote "Libdir is ${libdir}"
  echo "libdir is ${libdir}"
  echo "baselib is ${BASE_LIB}"
  install -d ${D}${base_prefix}/etc/udev/rules.d
  install -d ${D}${base_prefix}/opencr-firmware
  cp -r ${WORKDIR}/opencr_update ${D}${base_prefix}/opencr-firmware/opencr_update          
  install -m 0755 ${WORKDIR}/99-turtlebot3-cdc.rules ${D}${base_prefix}/etc/udev/rules.d/
  install -m 0755 ${WORKDIR}/99-opencr-cdc.rules ${D}${base_prefix}/etc/udev/rules.d/
}


INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

OPENCR_ARCH ?= "arm"

FILES_${PN} += " ${base_prefix}/etc/udev/rules.d/* "
FILES_${PN} += " ${base_prefix}/opencr-firmware/opencr_update/update.sh "
FILES_${PN} += " ${base_prefix}/opencr-firmware/opencr_update/burger.opencr "

FILES_${PN} += " ${base_prefix}/opencr-firmware/opencr_update/opencr_ld_shell_${OPENCR_ARCH} "

FILES_${PN} += " ${base_prefix}/opencr-firmware/opencr_update/burger_ros2.OpenCR.bin "

#SRC_URI[sha256sum] = "5571f2d3d946549c50d6c64119eb113527cdc2e64264ef9cbd62f9684c790e32"
S = "${WORKDIR}"


BBCLASSEXTEND = "native"
