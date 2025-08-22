package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SCOPE device specifications for Android Compose previews.
 *
 * This extension provides SCOPE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SCOPE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SCOPE: Any
  get() = object {
      /** SCOPE F5O3V */
      val F5O3V = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SCOPE SP1089 */
      val SP1089 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
