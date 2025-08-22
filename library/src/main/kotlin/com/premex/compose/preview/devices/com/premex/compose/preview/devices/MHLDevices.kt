package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MHL device specifications for Android Compose previews.
 *
 * This extension provides MHL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MHL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MHL: Any
  get() = object {
      /** DeviceSpec(manufacturer=MHL, code=TRECFONE_A21S, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MHL, code=TRECFONE_A21S, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val TRECFONE_A21S = "spec:width=720,height=1520,unit=px,dpi=320"

  }
