package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Rockcel device specifications for Android Compose previews.
 *
 * This extension provides Rockcel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rockcel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rockcel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Rockcel, code=Quartzo_UP, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rockcel, code=Quartzo_UP,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val QUARTZO_UP = "spec:width=480,height=854,unit=px,dpi=240"

  }
