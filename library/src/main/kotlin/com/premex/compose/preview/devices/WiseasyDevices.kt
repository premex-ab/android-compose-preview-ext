package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Wiseasy device specifications for Android Compose previews.
 *
 * This extension provides Wiseasy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wiseasy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wiseasy: Any
  get() = object {
      /** Wiseasy WISENET5 */
      val WISENET5 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
