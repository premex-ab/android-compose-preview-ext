package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * G-TAB device specifications for Android Compose previews.
 *
 * This extension provides G-TAB device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GTAB.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GTAB: Any
  get() = object {
      /** DeviceSpec(manufacturer=G-TAB, code=G5, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-TAB, code=G5, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val G5 = "spec:width=600,height=1024,unit=px,dpi=213"

  }
