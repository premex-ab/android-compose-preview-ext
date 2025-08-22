package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * COOKIE device specifications for Android Compose previews.
 *
 * This extension provides COOKIE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.COOKIE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.COOKIE: Any
  get() = object {
      /** COOKIE YS-CK0001 */
      val YS_CK0001 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
