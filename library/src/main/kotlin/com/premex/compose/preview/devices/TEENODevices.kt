package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TEENO device specifications for Android Compose previews.
 *
 * This extension provides TEENO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TEENO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TEENO: Any
  get() = object {
      /** TEENO A1_EEA */
      val A1_EEA = "spec:width=480,height=800,unit=px,dpi=240"

      /** TEENO TEENO_i12 */
      val TEENO_I12 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
