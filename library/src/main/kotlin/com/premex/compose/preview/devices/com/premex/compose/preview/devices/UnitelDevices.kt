package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Unitel device specifications for Android Compose previews.
 *
 * This extension provides Unitel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Unitel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Unitel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Unitel, code=U903, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unitel, code=U903, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val U903 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Unitel, code=USMART6, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unitel, code=USMART6, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val USMART6 = "spec:width=720,height=1612,unit=px,dpi=320"

  }
