package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Irbis device specifications for Android Compose previews.
 *
 * This extension provides Irbis device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Irbis.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Irbis: Any
  get() = object {
      /** Irbis TZ170 */
      val TZ170 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Irbis TZ727 */
      val TZ727 = "spec:width=600,height=1024,unit=px,dpi=213"

  }
