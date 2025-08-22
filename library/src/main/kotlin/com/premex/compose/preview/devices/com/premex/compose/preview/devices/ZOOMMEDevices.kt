package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZOOMME device specifications for Android Compose previews.
 *
 * This extension provides ZOOMME device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZOOMME.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZOOMME: Any
  get() = object {
      /** DeviceSpec(manufacturer=ZOOMME, code=M2, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZOOMME, code=M2, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val M2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZOOMME, code=M3, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZOOMME, code=M3, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M3 = "spec:width=600,height=1280,unit=px,dpi=240"

  }
