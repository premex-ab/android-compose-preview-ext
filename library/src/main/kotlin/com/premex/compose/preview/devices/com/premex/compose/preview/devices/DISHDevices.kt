package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DISH device specifications for Android Compose previews.
 *
 * This extension provides DISH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DISH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DISH: Any
  get() = object {
      /** DeviceSpec(manufacturer=DISH, code=ATVMJ4, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DISH, code=ATVMJ4, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ATVMJ4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DISH, code=ATVWJ4, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DISH, code=ATVWJ4, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ATVWJ4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DISH, code=EU001, width=480, height=800, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DISH, code=EU001, width=480,
      height=800, dpi=200, isGoogleDevice=false).code */
      val EU001 = "spec:width=480,height=800,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=DISH, code=m377_dish, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DISH, code=m377_dish, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val M377_DISH = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DISH, code=SNAP2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DISH, code=SNAP2, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SNAP2 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
