# Copyright (c) 2019 Wind River Systems, Inc. 
# Licensed under the Apache License, Version 2.0 (the "License"); 
# you may not use this file except in compliance with the License. 
# You may obtain a copy of the License at: 
#       http://www.apache.org/licenses/LICENSE-2.0 
# Unless required by applicable law or agreed to in writing, software  distributed 
# under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES 
# OR CONDITIONS OF ANY KIND, either express or implied.

DESCRIPTION = "Turtlebot3 Messages"
SECTION = "turtlebot3_ws"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

PACKAGES = "${PN}"
RDEPENDS_${PN} += " std-msgs rclcpp rclpy "
DEPENDS += " rosidl-generator-c-native python-cmake-module rclpy osrf-testing-tools-cpp rosidl-adapter-native sensor-msgs std-msgs rosidl-default-generators-native \
  cmake python3 fastrtps fastrtps-cmake-module ament-cmake-native rclcpp"

SRCREV = "6813d307f3d92144939b4585a3adae53b1741c1a"

SRC_URI = "git://github.com/ROBOTIS-GIT/turtlebot3_msgs.git;branch=ros2"
SRC_URI[md5sum] = "e3fc50a88d0a364313df4b21ef20c29e"

#FILES_${PN} += " /usr/include/turtlebot3_msgs/msg/* "

inherit ros_ament_cmake
inherit ros2_component
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

S = "${WORKDIR}/git"


BBCLASSEXTEND = "native"
