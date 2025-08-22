package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QUINT device specifications for Android Compose previews.
 *
 * This extension provides QUINT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Quint.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Quint: Any
  get() = object {
      /** QUINT R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** QUINT R3_GTV */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** QUINT R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** QUINT R4_GTV */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
