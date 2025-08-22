package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TIOK device specifications for Android Compose previews.
 *
 * This extension provides TIOK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TIOK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TIOK: Any
  get() = object {
      /** DeviceSpec(manufacturer=TIOK, code=S32, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TIOK, code=S32, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S32 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
