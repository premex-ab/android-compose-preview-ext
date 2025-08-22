package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ultra device specifications for Android Compose previews.
 *
 * This extension provides Ultra device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ultra.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ultra: Any
  get() = object {
      /** DeviceSpec(manufacturer=Ultra, code=UltraJ8, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ultra, code=UltraJ8, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ULTRAJ8 = "spec:width=480,height=854,unit=px,dpi=240"

  }
