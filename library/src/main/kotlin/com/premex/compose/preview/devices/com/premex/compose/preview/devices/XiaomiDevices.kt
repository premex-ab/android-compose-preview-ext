package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * xiaomi device specifications for Android Compose previews.
 *
 * This extension provides xiaomi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xiaomi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xiaomi: Any
  get() = object {
      /** DeviceSpec(manufacturer=xiaomi, code=axolotl, width=466, height=466, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xiaomi, code=axolotl, width=466,
      height=466, dpi=320, isGoogleDevice=false).code */
      val AXOLOTL = "spec:width=466,height=466,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=xiaomi, code=axolotlaxie, width=466, height=466, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xiaomi, code=axolotlaxie,
      width=466, height=466, dpi=320, isGoogleDevice=false).code */
      val AXOLOTLAXIE = "spec:width=466,height=466,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=xiaomi, code=axolotlte, width=466, height=466, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xiaomi, code=axolotlte, width=466,
      height=466, dpi=320, isGoogleDevice=false).code */
      val AXOLOTLTE = "spec:width=466,height=466,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=xiaomi, code=cactus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xiaomi, code=cactus, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val CACTUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=xiaomi, code=cereus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xiaomi, code=cereus, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val CEREUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=xiaomi, code=daisy_sprout, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xiaomi, code=daisy_sprout,
      width=1080, height=2280, dpi=480, isGoogleDevice=false).code */
      val DAISY_SPROUT = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=xiaomi, code=ginkgo, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xiaomi, code=ginkgo, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val GINKGO = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=xiaomi, code=jasmine_sprout, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xiaomi, code=jasmine_sprout,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val JASMINE_SPROUT = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=xiaomi, code=lavender, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xiaomi, code=lavender, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val LAVENDER = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=xiaomi, code=lotus, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xiaomi, code=lotus, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val LOTUS = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=xiaomi, code=mido, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xiaomi, code=mido, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val MIDO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=xiaomi, code=onc, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xiaomi, code=onc, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val ONC = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=xiaomi, code=sakura, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xiaomi, code=sakura, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SAKURA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=xiaomi, code=tiffany, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xiaomi, code=tiffany, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val TIFFANY = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=xiaomi, code=tissot_sprout, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xiaomi, code=tissot_sprout,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val TISSOT_SPROUT = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=xiaomi, code=ugg, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xiaomi, code=ugg, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val UGG = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=xiaomi, code=ugglite, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xiaomi, code=ugglite, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val UGGLITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=xiaomi, code=vince, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xiaomi, code=vince, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val VINCE = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=xiaomi, code=violet, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xiaomi, code=violet, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val VIOLET = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=xiaomi, code=wayne, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xiaomi, code=wayne, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val WAYNE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=xiaomi, code=willow, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xiaomi, code=willow, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val WILLOW = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=xiaomi, code=ysl, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=xiaomi, code=ysl, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val YSL = "spec:width=720,height=1440,unit=px,dpi=320"

  }
