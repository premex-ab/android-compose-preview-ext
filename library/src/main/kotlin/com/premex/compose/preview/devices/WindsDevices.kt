package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WINDS device specifications for Android Compose previews.
 *
 * This extension provides WINDS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Winds.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Winds: Any
  get() = object {
      /** WINDS WINDS-T3 */
      val WINDS_T3 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
