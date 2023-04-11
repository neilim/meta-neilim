SUMMARY = "A small image with minimal configs"

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

export IMAGE_BASENAME = "drosophila"

# Set rootfs to 200MiB by default
IMAGE_OVERHEAD_FACTOR ?= "1.0"
IMAGE_ROOTFS_SIZE ?= "20480"
IMAGE_ROOTFS_EXTRA_SPACE:append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "", d)}"

IMAGE_INSTALL:append = "vim mc htop git tmux tree opkg c-make"
