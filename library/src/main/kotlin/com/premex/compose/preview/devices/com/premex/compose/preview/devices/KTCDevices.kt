package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KTC device specifications for Android Compose previews.
 *
 * This extension provides KTC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KTC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KTC: Any
  get() = object {
      /** DeviceSpec(manufacturer=KTC, code=BLISS503, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KTC, code=BLISS503, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BLISS503 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KTC, code=Capricorn, width=2160, height=3840, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KTC, code=Capricorn, width=2160,
      height=3840, dpi=560, isGoogleDevice=false).code */
      val CAPRICORN = "spec:width=2160,height=3840,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=KTC, code=hongkong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KTC, code=hongkong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KTC, code=lavender, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KTC, code=lavender, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KTC, code=Leo, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KTC, code=Leo, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val LEO = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KTC, code=mountbaker, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KTC, code=mountbaker, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KTC, code=Sagittarius, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KTC, code=Sagittarius, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SAGITTARIUS = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KTC, code=stanford, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KTC, code=stanford, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KTC, code=W83B-F2-RK3576, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KTC, code=W83B-F2-RK3576,
      width=2160, height=3840, dpi=480, isGoogleDevice=false).code */
      val W83B_F2_RK3576 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KTC, code=zhongshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KTC, code=zhongshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
