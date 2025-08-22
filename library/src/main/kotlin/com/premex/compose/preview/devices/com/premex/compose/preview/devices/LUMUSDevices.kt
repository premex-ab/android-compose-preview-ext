package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LUMUS device specifications for Android Compose previews.
 *
 * This extension provides LUMUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LUMUS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LUMUS: Any
  get() = object {
      /** DeviceSpec(manufacturer=LUMUS, code=INNOSR545, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LUMUS, code=INNOSR545, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val INNOSR545 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LUMUS, code=NEOSR620, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LUMUS, code=NEOSR620, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val NEOSR620 = "spec:width=720,height=1500,unit=px,dpi=320"

  }
