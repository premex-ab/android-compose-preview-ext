package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Fortus device specifications for Android Compose previews.
 *
 * This extension provides Fortus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fortus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fortus: Any
  get() = object {
      /** DeviceSpec(manufacturer=Fortus, code=PayTab_PT10, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fortus, code=PayTab_PT10,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val PAYTAB_PT10 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
