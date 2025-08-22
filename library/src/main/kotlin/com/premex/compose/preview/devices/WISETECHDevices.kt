package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WISE-TECH device specifications for Android Compose previews.
 *
 * This extension provides WISE-TECH device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WISETECH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WISETECH: Any
  get() = object {
      /** WISE-TECH P1_Plus */
      val P1_PLUS = "spec:width=720,height=1520,unit=px,dpi=320"

  }
