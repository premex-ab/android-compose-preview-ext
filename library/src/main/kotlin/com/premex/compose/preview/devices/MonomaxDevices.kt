package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MONOMAX device specifications for Android Compose previews.
 *
 * This extension provides MONOMAX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Monomax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Monomax: Any
  get() = object {
      /** MONOMAX DV6071Z-KTM */
      val DV6071Z_KTM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
