package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ALDO device specifications for Android Compose previews.
 *
 * This extension provides ALDO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aldo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aldo: Any
  get() = object {
      /** ALDO T10S */
      val T10S = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ALDO T7Q-4G */
      val T7Q_4G = "spec:width=600,height=1024,unit=px,dpi=213"

  }
