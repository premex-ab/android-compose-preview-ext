package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZooomTV device specifications for Android Compose previews.
 *
 * This extension provides ZooomTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZooomTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZooomTV: Any
  get() = object {
      /** ZooomTV DV8529-T2_S2-KSI */
      val DV8529_T2_S2_KSI = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
