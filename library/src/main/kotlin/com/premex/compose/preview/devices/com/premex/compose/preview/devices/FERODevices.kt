package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FERO device specifications for Android Compose previews.
 *
 * This extension provides FERO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FERO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FERO: Any
  get() = object {
      /** DeviceSpec(manufacturer=FERO, code=Royale_X2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FERO, code=Royale_X2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ROYALE_X2 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
