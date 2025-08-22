package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BLUEDOT device specifications for Android Compose previews.
 *
 * This extension provides BLUEDOT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BLUEDOT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BLUEDOT: Any
  get() = object {
      /** DeviceSpec(manufacturer=BLUEDOT, code=BNT_1012W, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLUEDOT, code=BNT_1012W, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BNT_1012W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BLUEDOT, code=BNT-1013, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLUEDOT, code=BNT-1013, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val BNT_1013 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLUEDOT, code=BNT_801W, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLUEDOT, code=BNT_801W, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BNT_801W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BLUEDOT, code=BNT-802, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLUEDOT, code=BNT-802, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val BNT_802 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
