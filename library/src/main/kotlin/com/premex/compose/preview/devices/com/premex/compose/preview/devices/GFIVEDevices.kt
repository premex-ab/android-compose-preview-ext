package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GFIVE device specifications for Android Compose previews.
 *
 * This extension provides GFIVE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GFIVE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GFIVE: Any
  get() = object {
      /** DeviceSpec(manufacturer=GFIVE, code=GPAD702, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GFIVE, code=GPAD702, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val GPAD702 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=GFIVE, code=PRESIDENT_GOLD_10, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GFIVE, code=PRESIDENT_GOLD_10,
      width=600, height=1280, dpi=240, isGoogleDevice=false).code */
      val PRESIDENT_GOLD_10 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=GFIVE, code=PRESIDENT_GOLD_9, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GFIVE, code=PRESIDENT_GOLD_9,
      width=600, height=1280, dpi=240, isGoogleDevice=false).code */
      val PRESIDENT_GOLD_9 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=GFIVE, code=Speedo_1, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GFIVE, code=Speedo_1, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val SPEEDO_1 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=GFIVE, code=Stark, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GFIVE, code=Stark, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val STARK = "spec:width=480,height=960,unit=px,dpi=240"

  }
