package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KAAN device specifications for Android Compose previews.
 *
 * This extension provides KAAN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kaan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kaan: Any
  get() = object {
      /** KAAN KAAN_A1 */
      val KAAN_A1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KAAN KAAN_N2 */
      val KAAN_N2 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
