package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MAGNUMTECH device specifications for Android Compose previews.
 *
 * This extension provides MAGNUMTECH device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Magnumtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Magnumtech: Any
  get() = object {
      /** MAGNUMTECH MG715 */
      val MG715 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
