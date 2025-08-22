package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Estalky device specifications for Android Compose previews.
 *
 * This extension provides Estalky device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Estalky.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Estalky: Any
  get() = object {
      /** DeviceSpec(manufacturer=Estalky, code=E618, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Estalky, code=E618, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val E618 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
