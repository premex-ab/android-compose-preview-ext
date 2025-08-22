package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KIRISUN device specifications for Android Compose previews.
 *
 * This extension provides KIRISUN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kirisun.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kirisun: Any
  get() = object {
      /** KIRISUN T650 */
      val T650 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
