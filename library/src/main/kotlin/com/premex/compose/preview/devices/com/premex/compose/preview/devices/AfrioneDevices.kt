package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * afrione device specifications for Android Compose previews.
 *
 * This extension provides afrione device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Afrione.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Afrione: Any
  get() = object {
      /** DeviceSpec(manufacturer=afrione, code=CYGNUSX, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=afrione, code=CYGNUSX, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val CYGNUSX = "spec:width=720,height=1560,unit=px,dpi=320"

  }
