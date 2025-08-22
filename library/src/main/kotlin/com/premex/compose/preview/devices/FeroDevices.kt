package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Fero device specifications for Android Compose previews.
 *
 * This extension provides Fero device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fero.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fero: Any
  get() = object {
      /** Fero A4001_Plus_2019 */
      val A4001_PLUS_2019 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Fero A5003_512 */
      val A5003_512 = "spec:width=480,height=854,unit=px,dpi=240"

  }
