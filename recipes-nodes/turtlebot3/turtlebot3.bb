
DESCRIPTION = "Turtlebot3 Demo Nodes"
SECTION = "turtlebot3_ws"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"


PACKAGES = "${PN}"
RDEPENDS_${PN} = "turtlebot3-teleop turtlebot3-bringup turtlebot3-description turtlebot3-node turtlebot3-teleop turtlebot3-msgs geometry-msgs"


RDEPENDS_${PN} += " python3-terminal std-msgs rclcpp rclpy "
DEPENDS += " rosidl-generator-c-native python-cmake-module rclpy osrf-testing-tools-cpp rosidl-adapter-native sensor-msgs std-msgs rosidl-default-generators-native \
  cmake python3 fastrtps fastrtps-cmake-module ament-cmake-native rclcpp"


ROS_BPN = "turtlebot3"

SRC_URI = "git://github.com/ROBOTIS-GIT/turtlebot3.git;branch=ros2"


include turtlebot3-${ROS_DISTRO}.inc


inherit ros_ament_cmake
inherit ros2_component


INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"


S = "${WORKDIR}/git/turtlebot3"


BBCLASSEXTEND = "native"
