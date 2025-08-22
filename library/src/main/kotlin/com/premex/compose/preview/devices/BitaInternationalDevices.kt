package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Bita-International device specifications for Android Compose previews.
 *
 * This extension provides Bita-International device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BitaInternational.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BitaInternational: Any
  get() = object {
      /** Bita-International MC66 */
      val MC66 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
