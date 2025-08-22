package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QUICK device specifications for Android Compose previews.
 *
 * This extension provides QUICK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Quick.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Quick: Any
  get() = object {
      /** QUICK U55 */
      val U55 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
