package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BUFF device specifications for Android Compose previews.
 *
 * This extension provides BUFF device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BUFF.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BUFF: Any
  get() = object {
      /** BUFF X-9_LTEVII_PRO */
      val X_9_LTEVII_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

  }
