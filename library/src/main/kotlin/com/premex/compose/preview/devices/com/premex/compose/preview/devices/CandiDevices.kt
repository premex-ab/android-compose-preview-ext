package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Candi device specifications for Android Compose previews.
 *
 * This extension provides Candi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Candi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Candi: Any
  get() = object {
      /** DeviceSpec(manufacturer=Candi, code=Blaze, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Candi, code=Blaze, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BLAZE = "spec:width=480,height=854,unit=px,dpi=240"

  }
