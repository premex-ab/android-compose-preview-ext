package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cozyla device specifications for Android Compose previews.
 *
 * This extension provides Cozyla device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cozyla.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cozyla: Any
  get() = object {
      /** DeviceSpec(manufacturer=Cozyla, code=Calendar, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cozyla, code=Calendar, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val CALENDAR = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
