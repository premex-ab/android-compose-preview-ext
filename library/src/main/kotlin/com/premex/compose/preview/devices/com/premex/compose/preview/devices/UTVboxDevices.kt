package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UTVbox device specifications for Android Compose previews.
 *
 * This extension provides UTVbox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UTVbox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UTVbox: Any
  get() = object {
      /** DeviceSpec(manufacturer=UTVbox, code=MGV2002_HK, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UTVbox, code=MGV2002_HK,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val MGV2002_HK = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
