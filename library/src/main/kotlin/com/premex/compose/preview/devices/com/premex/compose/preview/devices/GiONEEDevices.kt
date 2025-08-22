package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GiONEE device specifications for Android Compose previews.
 *
 * This extension provides GiONEE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GiONEE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GiONEE: Any
  get() = object {
      /** DeviceSpec(manufacturer=GiONEE, code=GiONEE_BBL7332, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GiONEE, code=GiONEE_BBL7332,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_BBL7332 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GiONEE, code=GiONEE_BBL7505, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GiONEE, code=GiONEE_BBL7505,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val GIONEE_BBL7505 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GiONEE, code=GiONEE_CBL7513, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GiONEE, code=GiONEE_CBL7513,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_CBL7513 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GiONEE, code=GiONEE_GBL7319, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GiONEE, code=GiONEE_GBL7319,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_GBL7319 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GiONEE, code=GiONEE_GBL7333, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GiONEE, code=GiONEE_GBL7333,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_GBL7333 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GiONEE, code=GiONEE_GBL7335, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GiONEE, code=GiONEE_GBL7335,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_GBL7335 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GiONEE, code=GiONEE_GN9008, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GiONEE, code=GiONEE_GN9008,
      width=1440, height=2560, dpi=640, isGoogleDevice=false).code */
      val GIONEE_GN9008 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=GiONEE, code=GiONEE_M3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GiONEE, code=GiONEE_M3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_M3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GiONEE, code=GiONEE_WBL7352, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GiONEE, code=GiONEE_WBL7352,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_WBL7352 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GiONEE, code=GiONEE_WBL7511, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GiONEE, code=GiONEE_WBL7511,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_WBL7511 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GiONEE, code=GiONEE_WBW5612, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GiONEE, code=GiONEE_WBW5612,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val GIONEE_WBW5612 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=GiONEE, code=GiONEE_WBW5613, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GiONEE, code=GiONEE_WBW5613,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val GIONEE_WBW5613 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=GiONEE, code=GiONEE_WBW5615, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GiONEE, code=GiONEE_WBW5615,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_WBW5615 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GiONEE, code=GiONEE_WBW5616, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GiONEE, code=GiONEE_WBW5616,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GIONEE_WBW5616 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GiONEE, code=GiONEE_WBW5617, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GiONEE, code=GiONEE_WBW5617,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val GIONEE_WBW5617 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=GiONEE, code=GN9006, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GiONEE, code=GN9006, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val GN9006 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GiONEE, code=M5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GiONEE, code=M5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M5 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
